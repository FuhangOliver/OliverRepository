package test;

import sun.awt.geom.AreaOp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapHash {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "zhangsan");
        map.put(4, "zhangsa");
        map.put(44, "zhangs");
        map.put(8, "zhang");
        map.put(9, "zhan");
        map.put(3, "zha");
        GetAllMapValue(map);
        GetAllMapValue_2(map);


    }

    public static void GetAllMapValue_2(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> me = it.next();
            int Key = me.getKey();
            String Value = me.getValue();
            System.out.println(Key + ":::::::::" + Value);
        }
    }

    public static void GetAllMapValue(Map<Integer, String> map) {
        Set<Integer> set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println("Key:" + obj + "value:" + map.get(obj));
        }
    }

}
