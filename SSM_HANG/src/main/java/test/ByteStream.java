package test;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        copy_3();
    }

    public static void copy_3() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\resume.pdf");
        FileOutputStream fos = new FileOutputStream("F:\\resumeCopy3.pdf");
        byte[] buff = new byte[fis.available()];
        fis.read(buff);
        fos.write(buff);
        fis.close();
        fos.close();
    }

    public static void copy_2() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\resume.pdf");
        BufferedInputStream bfis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("F:\\resumeCopy1.pdf");
        BufferedOutputStream bfos = new BufferedOutputStream(fos);
        int len = 0;
        while ((len = bfis.read()) != -1) {
            bfos.write(len);
            bfos.flush();
        }
        bfis.close();
        bfos.close();
    }

    public static void copy_1() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\resume.pdf");
        FileOutputStream fos = new FileOutputStream("F:\\resumeCopy.pdf");
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            fos.write(buff, 0, len);
        }
        fis.close();
        fos.close();
    }
}
