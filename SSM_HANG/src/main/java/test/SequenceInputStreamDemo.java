package test;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        Vector<InputStream> vector = new Vector<InputStream>();
        vector.add(new FileInputStream("demo.txt"));
        vector.add(new FileInputStream("Print.txt"));
        vector.add(new FileInputStream("copy.txt"));
        Enumeration<InputStream> en = vector.elements();
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("all.txt");
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len = sis.read(buff)) != -1) {
            fos.write(buff, 0, len);
        }
        fos.close();
        sis.close();

    }
}
