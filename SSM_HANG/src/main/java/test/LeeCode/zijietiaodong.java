package test.LeeCode;

import java.util.Scanner;

public class zijietiaodong {
    public static void main(String[] args) {
        Scanner san = new Scanner(System.in);
        int rowNum = 0;
        int colNum = 0;
        System.out.print("请输入矩阵的行数: ");
        rowNum = san.nextInt();
        System.out.print("请输入矩阵的列数: ");
        colNum = san.nextInt();
        int[][] act = new int[rowNum][colNum];
        System.out.println("你创建了一个" + rowNum + "*" + colNum + "的矩阵");
        String[] temp = null;
        String line = null;
        for (int i = 0; i < rowNum; i++) {
            san = new Scanner(System.in);//??????????
            System.out.print("请输入第" + (i + 1) + "行的数据,以','隔开: ");
            line = san.nextLine();// "1, 2";
            temp = line.split(" ");
            for (int j = 0; j < colNum; j++) {
                act[i][j] = Integer.valueOf(temp[j].trim());
            }
        }
        System.out.println("该" + rowNum + "*" + colNum + "矩阵内容是: ");
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                System.out.print(act[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
