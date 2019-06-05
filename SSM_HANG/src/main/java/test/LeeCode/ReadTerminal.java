package test.LeeCode;

import java.util.Scanner;

import static test.RegexPackage.RegexTest.test_1;

public class ReadTerminal {
    public static void main(String[] args) {
        //Erweishuzu();
        test_1();
    }

    public static void test_1() {
        int[][] arr = new int[3][3];
        String[] sarr = new String[]{"1 2 3", "4 5 6", "7 8 9"};
        for (int j = 0; j < sarr.length; j++) {
            String[] strarr = sarr[j].split(" +");
            System.out.println("starr:" + strarr.length);
            for (int m = 0; m < strarr.length; m++) {
                int a = Integer.parseInt(strarr[m]);
                System.out.println(a);
                arr[j][m] = a;
            }
        }
        for (int x = 0; x < arr.length; x++) { //遍历二维数组，遍历出来的每一个元素是一个一维数组
            for (int y = 0; y < arr[x].length; y++) { //遍历对应位置上的一维数组
                System.out.println(arr[x][y]);
            }
        }
    }

    public static void Erweishuzu() {
        Scanner keyboard = new Scanner(System.in);
        String content = null;
        String result = "";
        int i = 0;
//        System.out.print("请输入内容:<空行或直接回车结束>");
        while (!(content = keyboard.nextLine()).trim().equals("")) {
            i++;
            result += content + System.lineSeparator();
        }
        System.out.println(result);
        System.out.println(i);
        int[][] arr = new int[i][];
        String[] sarr = result.split(System.lineSeparator() + "");
        System.out.println(sarr.length);
        for (int j = 0; j < sarr.length; j++) {
            String[] strarr = sarr[j].split(" +");
            System.out.println("starr:" + strarr.length);
            for (int m = 0; m < strarr.length; m++) {
                int a = Integer.parseInt(strarr[m]);
                System.out.println(a);
                arr[j][m] = a;
            }
        }

        for (int x = 0; x < arr.length; x++) { //遍历二维数组，遍历出来的每一个元素是一个一维数组
            for (int y = 0; y < arr[y].length; y++) { //遍历对应位置上的一维数组
                System.out.println(arr[x][y]);
            }
        }
    }

}
