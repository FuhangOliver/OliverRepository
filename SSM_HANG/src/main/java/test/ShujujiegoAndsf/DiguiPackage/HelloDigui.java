package test.ShujujiegoAndsf.DiguiPackage;

public class HelloDigui {
    public static void main(String[] args) {
        //HelloWord(0);
        Sanjiaodigui(7);
        int result = Fibonacci(7);

    }

    /**
     * Fibonacci数列
     * 第一二项为1，第n项由n-1项加上n-2项得到
     *
     * @param i
     * @return
     */
    public static int Fibonacci(int i) {
        if (i == 1 || i == 2)
            return 1;
        else {
            return Fibonacci(i - 1) + Fibonacci(i - 2);
        }
    }

    /**
     * 求三角函数的值，数列的第一项为1
     * 运用递归
     *
     * @param i
     * @return
     */
    public static int Sanjiaodigui(int i) {
        int total = 0;
        if (i == 1) {
            total = 1;
        } else
            total = Sanjiaodigui(i - 1) + i;
        System.out.println(total);
        return total;
    }

    public static void HelloWord(int i) {
        if (i < 100) {
            System.out.println("hello word!" + i);
            HelloWord(++i);
        }
    }

}
