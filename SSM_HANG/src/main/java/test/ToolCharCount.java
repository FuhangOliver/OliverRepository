package test;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ToolCharCount {
    public static void main(String[] args) {
        String str = "sjdfjsfsfkjhwiufjkvjshadfiweifsdknsdgh";
        String s = StringCharsCount(str);
        System.out.println(s);
    }

    public static String StringCharsCount(String str) {
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            Integer Value = map.get(chs[i]);
            int Count = 1;
            if (Value != null) {
                Count = Value + 1;
            }
            map.put(chs[i], Count);
//            if(Value == null)
//            {
//                map.put(chs[i],1);
//            }
//            else
//            {
//                map.put(chs[i],Value+1);
//            }
        }
        return maptoString(map);
    }

    public static String maptoString(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character key = it.next();
            Integer count = map.get(key);
            sb.append(count.toString() + key + " ");
        }
        return sb.toString();
    }
}
