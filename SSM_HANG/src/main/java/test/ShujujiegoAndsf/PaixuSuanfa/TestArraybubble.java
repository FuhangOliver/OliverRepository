package test.ShujujiegoAndsf.PaixuSuanfa;

public class TestArraybubble {
    public static void main(String[] args) {
        LongArray la = new LongArray();
        la.insert(88);
        la.insert(5);
        la.insert(4);
        la.insert(6);
        la.insert(66);
        la.insert(3);
        la.insert(77);
        la.display();
        la.insertSort();
        la.display();

    }
}
