package test;

public class Baoshu {

    public static void main(String[] args) {
        int n = 1;
        boolean[] arr = new boolean[100];
        int arrlength = arr.length;
        int index = 0;
        int countNum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        while (arrlength >= 5) {
            if (arr[index] == true) {
                countNum++;
                if (countNum == 5) {
                    arr[index] = false;
                    arrlength--;
                    countNum = 0;
                }

            }
            index++;
            if (index == arr.length) {
                index = 0;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == true) {
                System.out.println("最后剩下的学生是原来的第：" + String.valueOf(j + 1) + "个");
            }
        }
    }
}
