package test;

import java.util.Scanner;

public class PrintlnLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[1000];
        String arr1[] = new String[1000];
        for (int i = 0; ; i++) {
            int count = 1;
            arr[i] = scan.nextInt();
            if (arr[i] == 0)
                break;
            arr1[i] = Integer.toBinaryString(arr[i]);
            //System.out.println(arr1[i]);
            char temp[] = arr1[i].toCharArray();
            //从后向前匹配，等于0加一，等于1停止，因为是char型，所以应=='0'
            for (int k = temp.length; k >= 0; k--) {
                if (temp[k - 1] == '0') {
                    count++;
                } else {
                    break;
                }
            }
            //输出时转化为十进制输出，为2的（n-1）次方
            System.out.println((int) Math.pow(2, count - 1));
        }
    }
}
