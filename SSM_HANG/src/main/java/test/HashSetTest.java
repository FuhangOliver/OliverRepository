package test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("1hahaha");
        hs.add("2xixixi");
        hs.add("3hehehe");
        hs.add("4heihie");

        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
