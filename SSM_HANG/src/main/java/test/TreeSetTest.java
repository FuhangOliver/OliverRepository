package test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(new Person("zhangsan", 22));
        ts.add(new Person("lisi", 22));
        ts.add(new Person("wnagwu", 24));
        ts.add(new Person("zhoujian", 25));

        Iterator it = ts.iterator();
        while (it.hasNext()) {
            Person per = (Person) it.next();
            System.out.println("::::" + per.getName() + "::::" + per.getAge());
        }

    }
}
