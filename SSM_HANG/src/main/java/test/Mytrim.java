package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mytrim {
    public static void main(String[] args) {
        String s = "    bnb  v    ";
//        java.util.Scanner scan = new java.util.Scanner(System.in);
//        System.out.println("请输入一个数字:"); //提示输入一个数
//        int num = scan.nextInt(); // 从键盘接收一个整数
//        long lon = scan.nextLong(); // 从键盘接收一个长整数
//        float fla = scan.nextFloat(); // 从键盘接收一个浮点数
//        double dou = scan.nextDouble(); // 从键盘接收一个浮点数
//        System.out.println(num+"........"+lon+"........"+fla+"......."+dou+".........");
//
//        //接收从键盘输入的字符串
//        String str1=null;
//        BufferedReader bd=new BufferedReader( new InputStreamReader(System.in));
//        try{StringBuffer sb =new StringBuffer(bd.readLine());
//            str1=sb.toString();}
//        catch(Exception e ){}
//        System.out.println("你输入的是："+str1);

        s = mytrimpro(s);
        System.out.println("Mytrim:" + s);
    }

    /**
     * 去字符串空格的方法
     * 从头开始遍历直到不为空格取出index
     * 从尾部开始遍历直到取出不为空格Index
     *
     * @param s
     * @return
     */
    public static String mytrimpro(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ')
            start++;
        while (start <= end && s.charAt(end) == ' ')
            end--;
        return s.substring(start, end + 1);
    }
}
