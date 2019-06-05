package test;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class Kaoshi {
    private static void countString(String str, String s) {
        int count = 0;
        while (str.indexOf(s) != -1) {

            str = str.substring(str.indexOf(s) + 1, str.length());
            count++;

        }
        System.out.println(s + "出现的次数为" + count + "次");
    }

    public static void main(String[] args) {
        String str = "aassbbaadabbfaffgvdghfjfcgdshbghgfgdsgdgdshdgfdgdfghfgfhgfdbnfghdgfdvsfdsafsdfsdvs";
//        countString(str,"a");
        HashMap<String, String> map = new HashMap<>();

        HashMap<String, Integer> newMap = new HashMap<>();

        String[] strings = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            String substr = str.substring(i, i + 1);
            strings[i] = substr;
        }

        Set<String> set = new HashSet<String>();

        for (String s1 : strings) {

            int count = 1;

            if (newMap.containsKey(s1)) {

                int count1 = newMap.get(s1);

                count1++;

                newMap.put(s1, count1);

            } else {

                newMap.put(s1, count);

            }

            map.put(s1, s1);

            set.add(s1);

        }

//        for (String s2 : set) {
//
//            //System.out.println(s2);
//
//        }

        Set<String> keySet = newMap.keySet();

        String str1 = "";

        for (String s3 : keySet) {

            if (newMap.get(s3) > 1) {


                str1 = str1 + "\t" + newMap.get(s3) + s3;


            }

        }
        System.out.print(str1);

    }
}
