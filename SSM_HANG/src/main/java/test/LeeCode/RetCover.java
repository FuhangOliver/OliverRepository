package test.LeeCode;


public class RetCover {
    public static void main(String[] args) {
//        test_1(10);
//        NumberOf1(8);
        Power(2, 8);
    }

    public static double Power(double base, int expoment) {
        double result = 1;
        int temp = Math.abs(expoment);
        for (int i = 1; i <= temp; i++) {
            result = result * base;
        }
        if (expoment == 0)
            result = 1;
        else if (expoment < 0) {
            result = 1 / result;
        }
        System.out.println(result);
        return result;
    }

    /**
     * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
     *
     * @param i
     * @return
     */
    public static int NumberOf1(int i) {
        int count = 0;
        char[] ch = Integer.toBinaryString(i).toCharArray();
        for (int j = 0; j < ch.length; j++) {
            if (ch[j] == '1')
                count++;
        }
        return count;
    }

    /**
     * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
     * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
     * 分析：n = 1；只有一种
     * n = 2 的时候有2种
     * n = 3的时候有f（1）+f（2）种
     * f（n） = f（n-1）+ f（n-2）
     *
     * @param target
     * @return
     */
    public static int test_1(int target) {
        if (target < 0)
            return 0;
        else if (target == 1)
            return 1;
        else if (target == 2)
            return 2;
        else {
            return test_1(target - 1) + test_1(target - 2);
        }
    }

}
