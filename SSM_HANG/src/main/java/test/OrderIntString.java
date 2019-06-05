package test;

import java.util.Arrays;

public class OrderIntString {
    public static final String SPACE_GENERATER = " ";

    public static void main(String[] args) {
        String str = "15 23    -6 47 8 52 64 25 66 87";
        String Mystr = SortStringNumber(str);
        System.out.println(Mystr);
        int arr[] = {1, 56, 45, 2, -8, 59, 46, 121, 452};
        int OrderArr[] = SortOrderInt(arr);
        for (int i = 0; i < OrderArr.length; i++) {
            if (i != OrderArr.length - 1) {
                System.out.printf(String.valueOf(OrderArr[i]) + "<");
            } else {
                System.out.printf(String.valueOf(OrderArr[i]));
            }
        }
        SortIntArray(arr);
    }

    private static String SortStringNumber(String str) {
        //将字符串转换成字符串数组
        String[] Str_Array1 = Str2StrArray(str);
        //将字符串数组转换成int数组
        int[] IntArray = getIntArray(Str_Array1);
        //int数组进行排序
        int[] MySortArray = SortInt_Array(IntArray);
        //int数组转换成string字符串
        String SortString = IntArray2String(MySortArray);
        return SortString;
    }

    public static int[] getIntArray(String[] str_Array1) {
        int[] IntArray = new int[str_Array1.length];
        for (int i = 0; i < str_Array1.length; i++) {
            IntArray[i] = Integer.parseInt(str_Array1[i]);
        }
        return IntArray;
    }

    public static String IntArray2String(int[] mySortArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mySortArray.length; i++) {
            if (i != mySortArray.length - 1) {
                sb.append(mySortArray[i] + SPACE_GENERATER);
            } else {
                sb.append(mySortArray[i]);
            }
        }
        return sb.toString();
    }

    private static int[] SortInt_Array(int[] intArray) {
        Arrays.sort(intArray);
        return intArray;
    }

    public static String[] Str2StrArray(String str) {
        String[] Str_Array = str.split(SPACE_GENERATER + "+");
        return Str_Array;
    }

    /**
     * 选择排序是先将数组中的第一个数作为最大或最小数，然后通过循环比较交换最大数或最小数与一轮比较中第一个数位置进行排序；
     *
     * @param arr
     * @return
     */
    public static int[] SortOrderInt(int[] arr) {
        //Arrays.sort(arr);
        // 简单选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        for (int x : arr) {
            System.out.print(x + SPACE_GENERATER);
        }
        return arr;
    }

    /**
     * 冒泡排序也是先将数组中的第一个数作为最大或最小数，循环比较相邻两个数的大小，满足条件就互换位置，将最大数或最小数沉底；
     *
     * @param arr
     * @return
     */
    public static int[] SortIntArray(int[] arr) {
        // 冒泡排序
        boolean swapped = true; // 有没有发生过交换
        for (int i = 1; swapped && i <= arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        for (int x : arr) {
            System.out.print(x + SPACE_GENERATER);
        }
        return arr;
    }
}
