package test.ShujujiegoAndsf.QueuDemo;

public class Queuestack {
    private long[] arr;
    private int Max_Size;
    private int elems;
    private int font;
    private int end;

    public Queuestack(int Size) {
        Max_Size = Size;
        arr = new long[Max_Size];
        font = 0;
        end = -1;
    }

    public void insert(long Value) {
        if (end == Max_Size - 1) {
            end = -1;
        }
        arr[++end] = Value;
        elems++;
    }

    public long remove() {
        long temp = arr[font++];
        if (font == Max_Size) {
            font = 0;
        }
        elems--;
        return temp;
    }

    public int size() {
        return elems;
    }

    public boolean isEmpty() {
        return (elems == 0);
    }

    public boolean isFull() {
        return (elems == Max_Size);
    }
}
