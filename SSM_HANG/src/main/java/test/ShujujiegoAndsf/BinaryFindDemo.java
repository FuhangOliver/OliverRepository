package test.ShujujiegoAndsf;

import java.util.Arrays;

public class BinaryFindDemo {
    public static void main(String[] args) {
        int key = 5;
        System.out.println("index:" + binaryFind(key));
    }

    public static int binaryFind(int searchKey) {
        int[] intArr = new int[]{3, 4, 5, 48, 21, 1, 26, 66, 332, 454, 78, 58};
        Arrays.sort(intArr);
        for (int a : intArr) {
            System.out.println(":" + a);
        }
        int ins = 0, low = 0, pow = intArr.length;

        while (true) {
            ins = (pow + low) / 2;
            if (intArr[ins] == searchKey) {
                return ins;
            } else if (low > pow)
                return -1;
            else {
                if (intArr[ins] > searchKey) {
                    pow = ins - 1;
                } else {
                    low = ins + 1;
                }
            }
        }
    }
}
