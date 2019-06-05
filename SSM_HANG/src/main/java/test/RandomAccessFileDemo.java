package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
        //writeFile();
        readFile();
    }

    public static void readFile() throws IOException {
        File file = new File("src\\main\\java\\test\\Resources\\randomcc.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        byte[] buf = new byte[6];
        raf.read(buf);
        String name = new String(buf);
        int age = raf.readInt();
        raf.seek(3 * 8);
        byte[] buf1 = new byte[9];
        raf.read(buf1);
        String gfname = new String(buf1);
        int gfage = raf.readInt();
        System.out.println("name:" + name + "::::" + "age:" + age);
        System.out.println("gfname:" + gfname + "::::" + "gfage:" + gfage);
        raf.close();
    }

    public static void writeFile() throws IOException {
        File file = new File("src\\main\\java\\test\\Resources\\randomcc.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.write("付航".getBytes());
        raf.writeInt(23);
        raf.seek(3 * 8);
        raf.write("吴兰兰".getBytes());
        raf.writeInt(23);
        raf.close();
    }
}
