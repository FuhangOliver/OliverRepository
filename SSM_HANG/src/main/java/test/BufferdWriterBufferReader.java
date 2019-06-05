package test;

import java.io.*;

public class BufferdWriterBufferReader {
    public static void main(String[] args) throws IOException {
        //java封装的缓冲区，提高读写的效率
        FileWriter fw = new FileWriter("BufferedTest.txt");
        BufferedWriter bufw = new BufferedWriter(fw);
        bufw.write("fsfjsjljafl");
        bufw.newLine();
        bufw.write("fuhangzhengdeshuai!");
        bufw.flush();
        bufw.close();
        BufferedReaderFunction("BufferedTest.txt");
    }

    public static void BufferedReaderFunction(String s) throws IOException {
        FileReader fr = new FileReader(s);
        BufferedReader bufr = new BufferedReader(fr);
        String line = null;
        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
        bufr.close();
    }
}
