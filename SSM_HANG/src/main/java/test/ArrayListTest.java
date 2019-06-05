package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        //arrayList存储的是对象在内存中的地址
        ArrayList a1 = new ArrayList();
        a1.add(new Person("list1", 21));
        a1.add(new Person("list2", 22));
        a1.add(new Person("list3", 23));
        a1.add(new Person("list4", 24));
        Iterator it = a1.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(((Person) obj).getName() + ":::" + ((Person) obj).getAge());
        }
    }
}
