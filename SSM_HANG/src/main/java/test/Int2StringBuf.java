package test;

import javax.sound.midi.Soundbank;

public class Int2StringBuf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 44, 5, 6, 7, 8, 9, 8, 9, 8, 9, 88, 99};
        String Str = Int2String(arr);
        System.out.println(Str);
        String Str1 = IntArr2StringBuf(arr);
        System.out.println(Str1);
        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toOctalString(60));
        System.out.println(Integer.parseInt("110", 10));
        char arrChar[] = {'a', 'd', 's'};
        System.out.println(Character.toUpperCase(arrChar[0]));
    }

    /**
     * int数组转string使用stringbuilder
     *
     * @param arr
     * @return
     */
    public static String IntArr2StringBuf(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i] + ",");
            } else {
                sb.append(arr[i] + "]");
            }
        }
        return sb.toString();
    }

    /**
     * 讲一个int数组变成string
     *
     * @param arr
     * @return
     */
    public static String Int2String(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                str += arr[i] + ",";
            } else {
                str += arr[i] + "]";
            }
        }
        return str;
    }

}
