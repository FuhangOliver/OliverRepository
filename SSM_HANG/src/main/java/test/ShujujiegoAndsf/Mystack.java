package test.ShujujiegoAndsf;

public class Mystack {
    private long[] arr;
    private int top;
    private int Max_Size;

    public Mystack(int Size) {
        Max_Size = Size;
        arr = new long[Max_Size];
        top = -1;
    }

    public void push(long Value) {
        arr[++top] = Value;
    }

    public long pop() {
        return arr[top--];
    }

    public long peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == (Max_Size - 1));
    }
}
