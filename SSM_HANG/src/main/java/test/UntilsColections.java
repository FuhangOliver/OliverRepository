package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UntilsColections {
    public static void main(String[] args) {
        String Str = "8 88 54 2 2 121 45 23 121 45 78 12 15";
        String str1 = StringNumberSort(Str);
        System.out.println(str1);
        List<String> list = new ArrayList<String>();
        list.add("sdfsfsf");
        list.add("fkkdsljgjs");
        list.add("rdsgje");
        list.add("okooko");
        list.add("jbdjgoieg");
        System.out.println(list);
        //Collections.sort(list);
        MySort(list);
        System.out.println(list);
    }

    public static <T extends Comparable<? super T>> void MySort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T Temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, Temp);
                }
            }
        }
    }

    public static String StringNumberSort(String str) {
        String[] strings = str.split(" " + "+");
        int[] Arr = new int[strings.length];
        for (int a = 0; a < strings.length; a++) {
            Arr[a] = Integer.parseInt(strings[a]);
        }
        for (int i = 0; i < Arr.length - 1; i++) {
            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[i] > Arr[j]) {
                    int min = Arr[j];
                    Arr[j] = Arr[i];
                    Arr[i] = min;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int b = 0; b < Arr.length; b++) {
            if (b != Arr.length - 1)
                sb.append(Arr[b] + "<");
            else
                sb.append(Arr[b]);
        }
        return sb.toString();
    }
}
