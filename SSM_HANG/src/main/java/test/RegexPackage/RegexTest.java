package test.RegexPackage;

import java.util.TreeSet;

public class RegexTest {
    public static void main(String[] args) {
        //1,治疗口吃
        //2，对ip地址进行排序
        //3，对邮件地址进行校验
        test_4();
    }

    public static void test_4() {
        String mail = "abc1@sina.com.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3})+";
        boolean b = mail.matches(regex);
        System.out.println("b:" + b);
    }

    /*
     * 对连续的IP地址进行排序
     */
    public static void test_3() {
        String ip = "192.168.1.100 127.0.0.1 1.3.2.5 3.3.3.3 189.126.0.140";
        ip = ip.replaceAll("([0-9]+)", "00$1");
        ip = ip.replaceAll("0*([0-9]{3})", "$1");
        String[] ips = ip.split(" +");
        TreeSet<String> ts = new TreeSet<String>();
        for (String ip1 : ips)
            ts.add(ip1);
        for (String s : ts)
            System.out.println(s.replaceAll("0*([0-9]+)", "$1"));
    }

    public static void test_1() {
        String str = "我我我我....我我我......我我我要要要..要要要要学...学学学....学编编.编编编程程程...程...程程程";

        //1,去掉.，使用replaceAll
        str = str.replaceAll("\\.+", "");
        System.out.println(str);

        //2，去掉叠词
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);
    }

    /*
     * 1,治口吃。
     */
    public static void test_2() {

        String str = "我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程...程程程";

        //1，将字符串中.去掉。 用替换。
        str = str.replaceAll("\\.+", "");
        System.out.println(str);

        //2,替换叠词。
        str = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str);


    }
}
