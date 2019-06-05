package test.ShujujiegoAndsf.PaixuSuanfa;


public class LongArray {
    private long[] arr;
    private int elems;

    public LongArray() {
        arr = new long[50];
    }

    public LongArray(int max) {
        arr = new long[max];
    }

    public void insert(long e) {
        arr[elems] = e;
        elems++;
    }

    public void display() {
        for (int i = 0; i < elems; i++) {
            if (i != elems - 1)
                System.out.print(arr[i] + ",");
            else
                System.out.print(arr[i]);

        }
        System.out.println();
    }

    public int find(long Key) {
        int i;
        for (i = 0; i < elems; i++) {
            if (arr[i] == (Key))
                break;
        }
        if (i == arr.length)
            return -1;
        else
            return i;
    }

    public void delete(long e) {
        if (find(e) == -1) {
            System.out.println("未查找到指定数据，删除失败！");
        } else {
            for (int i = find(e); i < elems; i++) {
                arr[i] = arr[i + 1];
            }
            elems--;
        }
    }

    public void change(long oldValue, long newValue) {
        if (find(oldValue) == -1) {
            System.out.println("未查找到指定数据，修改失败！");
        } else {
            arr[find(oldValue)] = newValue;
        }
    }

    public void bubbleSort() {
        long temp = 0l;
        for (int i = 0; i < elems - 1; i++) {
            for (int j = 0; j < elems - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void selectSort() {
        long temp = 0l;
        int min = 0;
        for (int i = 0; i < elems - 1; i++) {
            min = i;
            for (int j = i + 1; j < elems; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public void insertSort() {
        long select = 0l;
        for (int i = 1; i < elems; i++) {
            select = arr[i];
            int j = 0;
            for (j = i; j > 0 && arr[j - 1] >= select; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = select;
        }
    }
}
