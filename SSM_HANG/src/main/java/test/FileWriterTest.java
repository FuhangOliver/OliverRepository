package test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("fuhang zhengbang!");
        fw.close();
    }
}
