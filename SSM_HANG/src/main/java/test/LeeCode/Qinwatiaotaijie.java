package test.LeeCode;

public class Qinwatiaotaijie {
    public static void main(String[] args) {
        JumpFloor(10);
        JumpFloorII(10);
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * f(n) = f(n-1)+f(n-2)+f(n-3)+......+f(3)+f(2)+f(1)
     * f(n-1) = f(n-2)+f(n-3)+......+f(3)+f(2)+f(1)
     * f(n) = 2*f(n-1)
     *
     * @param num
     * @return
     */
    public static int JumpFloorII(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 2;
        } else {
            return 2 * JumpFloor(num - 1);
        }
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * 转化为斐波那契数列问题
     */
    public static int JumpFloor(int Num) {
        if (Num < 0) {
            return 0;
        } else if (Num == 1) {
            return 1;
        } else if (Num == 2) {
            return 2;
        } else {
            return JumpFloor(Num - 1) + JumpFloor(Num - 2);
        }
    }
}
