package test.ShujujiegoAndsf.QueuDemo;

import test.ShujujiegoAndsf.Mystack;

public class QueueTest {
    public static void main(String[] args) {
        Mystack ms = new Mystack(10);
        ms.push(878);
        ms.push(85);
        ms.push(68);
        ms.push(78);
        ms.push(534);
        ms.push(-564);

        while (!ms.isEmpty())
            System.out.println(ms.pop());
    }
}
