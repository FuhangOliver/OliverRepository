package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("demo.txt");
            fw = new FileWriter("copy.txt");
            char[] chars = new char[BUFFER_SIZE];
            int len = 0;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
