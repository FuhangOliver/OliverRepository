package test;

import java.io.*;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class GetFileNameToFiles {
    public static void main(String[] args) throws IOException {
        File dir = new File("E:\\java学习");
        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".java");
            }
        };
        List<File> files = new ArrayList<File>();

        getFileName(dir, filter, files);
        File destFile = new File("javalist.txt");
        write2File(files, destFile);
    }

    public static void getFileName(File file, FilenameFilter filter, List<File> list) {
        if (!file.exists())
            return;
        File[] files = file.listFiles();
        for (File fl : files)
            if (fl.isDirectory())
                getFileName(fl, filter, list);
            else {
                if (filter.accept(fl, fl.getName())) {
                    list.add(fl);
                    System.out.println(fl.getAbsolutePath());
                }
            }
    }

    public static void write2File(List<File> list, File destFile) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
        for (File file : list) {
            bw.write(file.getAbsolutePath());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
