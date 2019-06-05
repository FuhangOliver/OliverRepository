package test;

import java.io.FileWriter;
import java.io.IOException;

public class IoExceptionDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("Exception.txt");
            fw.write("fskfsk");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败！");
                }
            }
        }

    }
}
