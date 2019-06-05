package test.RegexPackage;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
//        String qq = "0451515";
//        CheckQQNum(qq);
//        String num = "18163524227";
//        CheckPhoneNum(num);
//        String name = "fuhangYYYYYwulanlanIIIIIIhanghangLLLLlanlan";
//        SplitName(name);
//        ReplaceName(name);
        Findfind();
    }

    public static void Findfind() {
        String str = "da jia hao,ming tian bu fang jia,zheng chang shang ke";
        String regex = "\\b[a-z]{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void ReplaceName(String name) {
        String regx = "(.)\\1+";
        name.replaceAll(regx, "$1");
        System.out.println(name);

        String tel = "15800001111";//158****1111;
        tel = tel.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
        System.out.println(tel);
    }

    public static void SplitName(String name) {
        String regx = "(.)\\1+";
        String[] names = name.split(regx);
        for (String na : names)
            System.out.println(na);
    }

    public static void CheckPhoneNum(String num) {
        String regx = "1[358][0-9]{9}";
        boolean b = num.matches(regx);
        System.out.println(num + ":" + b);
    }

    /**
     * 正则表达式：验证QQ号码
     * 5-15位，不能以0开头，不能有字母
     *
     * @param qq
     */
    public static void CheckQQNum(String qq) {
        String regx = "[1-9][0-9]{4,14}";
        boolean b = qq.matches(regx);
        System.out.println(qq + ":" + b);
    }
}
