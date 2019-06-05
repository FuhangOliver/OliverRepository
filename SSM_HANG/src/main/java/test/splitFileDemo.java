package test;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class splitFileDemo {
    private static final int SIZE = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        File file = new File("src\\main\\java\\test\\Resources\\Deskt.bmp");
        //SplitFile(file);
        File fl = new File("src\\main\\java\\test\\Resources\\splitParts");
        MergeFile(fl);
    }

    public static void MergeFile(File file) throws IOException {
        File[] files = file.listFiles(new SuffixFilter(".properties"));
        if (files.length != 1)
            throw new RuntimeException("配置文件没有，或配置文件不唯一！");

        File confile = files[0];
        FileInputStream fis = new FileInputStream(confile);
        Properties prop = new Properties();
        prop.load(fis);
        String filename = prop.getProperty("fileName");
        int count = Integer.parseInt(prop.getProperty("splitNum"));

        File[] fls = file.listFiles(new SuffixFilter(".part"));
        if (fls.length != count - 1)
            throw new RuntimeException("碎片文件数量不符合要求！应该是：" + (count - 1) + "个碎片文件！");

        ArrayList<FileInputStream> arrayList = new ArrayList<FileInputStream>();
        for (int i = 0; i < count - 1; i++) {
            arrayList.add(new FileInputStream(fls[i]));
        }
        Enumeration<FileInputStream> en = Collections.enumeration(arrayList);
        SequenceInputStream sequenceInputStream = new SequenceInputStream(en);

        FileOutputStream fos = new FileOutputStream(new File(file, filename));
        int len = 0;
        byte[] buf = new byte[1024 * 1024];
        while ((len = sequenceInputStream.read(buf)) != -1) {
            fos.write(buf, 0, len);
        }
        sequenceInputStream.close();
        fos.close();

    }

    public static void SplitFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] buff = new byte[SIZE];
        int len = 0;
        int count = 1;
        FileOutputStream fos = null;
        File fl = new File("src\\main\\java\\test\\Resources\\splitParts");
        if (!fl.exists())
            fl.mkdirs();
        while ((len = fis.read(buff)) != -1) {
            fos = new FileOutputStream(new File(fl, count++ + "desktop.part"));
            fos.write(buff, 0, len);
            fos.close();
        }
        Properties prop = new Properties();
        prop.setProperty("splitNum", count + "");
        prop.setProperty("fileName", file.getName());
        fos = new FileOutputStream(new File(fl, count++ + ".properties"));
        prop.store(fos, "File info");

        fis.close();
        fos.close();
    }
}
