package test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
//        PrintStream printStream = new PrintStream("Print.txt");
//        printStream.write(97);//只写入数据的后八位
//        printStream.print(97);//转换成string后写入
        Print2Upcase();
    }

    public static void Print2Upcase() throws IOException {
        BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String line = null;
        while ((line = bw.readLine()) != null) {
            if ("over".equals(line))
                break;
            else {
                pw.println(line.toUpperCase());
                pw.flush();
            }
        }
    }

}
