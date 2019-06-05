package test;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File dir = new File("E:\\java学习");
        //listAll(dir);
        int sum = GetSum(5);
        toBin(6);
    }

    public static void toBin(int num) {
        if (num > 0) {
            toBin(num / 2);
            System.out.println(num % 2);
        }
    }

    /*
    递归的小演示：防止内存溢出
     */
    public static int GetSum(int sum) {
        if (sum == 1)
            return 1;
        return sum + GetSum(sum - 1);
    }

    public static void listAll(File dir) {
        System.out.println("dir" + dir.getAbsolutePath());
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                listAll(files[i]);
            } else {
                System.out.println(files[i].getAbsolutePath());
            }
        }
    }
}
