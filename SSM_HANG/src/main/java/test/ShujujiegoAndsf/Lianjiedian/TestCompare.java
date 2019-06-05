package test.ShujujiegoAndsf.Lianjiedian;


import test.ShujujiegoAndsf.PaixuSuanfa.LongArray;

import java.util.Date;

public class TestCompare {
    public static void main(String[] args) {
        Date data1 = new Date();
        LinkList linkList = new LinkList();
        for (int i = 0; i < 100000; i++) {
            linkList.insert(i);
        }
        Date date2 = new Date();
        System.out.println(date2.getTime() - data1.getTime());

        data1 = new Date();
        LongArray longArray = new LongArray(100000);
        for (int i = 0; i < 100000; i++) {
            longArray.insert(i);
        }
        date2 = new Date();
        System.out.println(date2.getTime() - data1.getTime());
    }
}
