package test.ShujujiegoAndsf;

public class MyCharstack {
    private char[] arr;
    private int top;
    private int Max_Size;

    public MyCharstack(int Size) {
        Max_Size = Size;
        arr = new char[Max_Size];
        top = -1;
    }

    public void push(char Value) {
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
