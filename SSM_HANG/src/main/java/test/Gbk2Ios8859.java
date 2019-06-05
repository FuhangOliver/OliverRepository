package test;

import java.io.UnsupportedEncodingException;

public class Gbk2Ios8859 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //twiceencode();
        String str = "ab你好fd谢谢";
        int len = str.getBytes("gbk").length;
        for (int i = 0; i < len; i++) {
            System.out.println("截取" + (i + 1) + "个字节：" + cutStringgbk(str, i + 1));
        }
        int len1 = str.getBytes("utf-8").length;
        for (int i = 0; i < len1; i++) {
            System.out.println("截取" + (i + 1) + "个字节：" + cutStringUtf8(str, i + 1));
        }

    }

    public static String cutStringUtf8(String str, int len) throws UnsupportedEncodingException {
        int count = 0;
        byte[] buf = str.getBytes("utf-8");
        for (int i = len - 1; i >= 0; i--) {
            if (buf[i] < 0)
                count++;
            else break;
        }
        if (count % 3 == 0)
            return new String(buf, 0, len, "utf-8");
        else if (count % 3 == 1)
            return new String(buf, 0, len - 1, "utf-8");
        else
            return new String(buf, 0, len - 2, "utf-8");
    }

    public static String cutStringgbk(String str, int len) throws UnsupportedEncodingException {
        int count = 0;
        byte[] buf = str.getBytes("gbk");
        for (int i = len - 1; i >= 0; i--) {
            if (buf[i] < 0)
                count++;
            else break;
        }
        if (count % 2 == 0)
            return new String(buf, 0, len, "gbk");
        else
            return new String(buf, 0, len - 1, "gbk");
    }

    public static void twiceencode() throws UnsupportedEncodingException {
        String str = "你好";
        byte[] buf = str.getBytes("gbk");
        for (int s : buf)
            System.out.println("s=" + s);
        String s = new String(buf, "iso8859-1");
        System.out.println("s=" + s);

        byte[] buf2 = s.getBytes("iso8859-1");
        String s1 = new String(buf2, "gbk");
        System.out.println("s2 = " + s1);
    }
}
