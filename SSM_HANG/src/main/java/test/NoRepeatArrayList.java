package test;

import java.util.ArrayList;
import java.util.Iterator;

public class NoRepeatArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("test2");
        al.add("test1");
        al.add("test2");
        al.add("test3");
        al.add("test1");
        System.out.println("去重前：" + al);
        al = RemoveRepeat(al);
        System.out.println("去重后：" + al);


    }

    public static ArrayList RemoveRepeat(ArrayList al) {
        ArrayList temp = new ArrayList();
        Iterator it = al.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if (!temp.contains(obj)) {
                temp.add(obj);
            }
        }
        return temp;
    }
}
