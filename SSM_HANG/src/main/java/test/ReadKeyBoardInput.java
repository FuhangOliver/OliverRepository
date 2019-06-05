package test;


import java.io.*;

public class ReadKeyBoardInput {
    public static void main(String[] args) throws IOException {
        ReadKey3();
    }

    public static void ReadKey3() throws IOException {
//        InputStream is = System.in;
//        //字节流转换成字符流的桥梁
//        InputStreamReader isr = new InputStreamReader(is);
//
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String Line = null;
        while ((Line = br.readLine()) != null) {
            //System.out.println(Line.toUpperCase());
            if ("over".equals(Line)) {
                break;
            }
            bw.write(Line.toUpperCase());
            bw.newLine();
            bw.flush();
        }
    }

    public static void ReadKey2() throws IOException {

        StringBuilder sb = new StringBuilder();
        InputStream is = System.in;

        int ch = 0;
        while ((ch = is.read()) != -1) {
            if (ch == '\r')
                continue;
            if (ch == '\n') {
                String temp = sb.toString();
                if ("over".equals(temp))
                    break;
                System.out.println(temp.toUpperCase());
                sb.delete(0, sb.length());
            } else
                sb.append((char) ch);
        }
    }

    public static void ReadKey1() throws IOException {
        InputStream is = System.in;
        int ch = is.read();
        System.out.println(ch);
    }
}
