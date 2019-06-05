package test.RegexPackage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String[] args) throws IOException {
        List<String> list = getMails();
        for (String mail : list)
            System.out.println(mail);
    }

    private static List<String> getMails() throws IOException {
        //爬取本地文件
        BufferedReader bufr = new BufferedReader(new FileReader("src\\main\\java\\test\\Resources\\copy.txt"));
        //爬取网络文件的
        URL url = new URL("http://202.114.144.21/srun_portal_pc_success?ac_id=1&username=2015221111120058&ip=10.185.144.187&access_token=1c8d7510afe0ad3496f4f94c31c65a452ce97ddfc5cca5986132f411f8291615&");
        BufferedReader bufrin = new BufferedReader(new InputStreamReader(url.openStream()));
        //对读取的额数据进行有规则的匹配
        String mail_regex = "\\w+@\\w+(\\.\\w+)+";
        //String javaFile_regex =
        List<String> list = new ArrayList<String>();

        Pattern p = Pattern.compile(mail_regex);

        String line = null;
        while ((line = bufr.readLine()) != null) {
            Matcher matcher = p.matcher(line);
            while (matcher.find()) {
                list.add(matcher.group());
            }
        }
        return list;
    }
}
