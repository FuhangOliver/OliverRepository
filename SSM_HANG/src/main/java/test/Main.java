package test;

import java.util.Scanner;

public class Main {
    static int x, y, z; //x是硬币种数,y是需要凑成的金额数,z是所需硬币数,a是硬币面值数组 
    static int[] a;

    static int coin(int g) //输入数为需要凑成的金额数,返回数为所需要的硬币数 
    {
        int i;
        for (i = 1; i <= x; i++) {
            if (g > a[x - i]) {
                int b = coin(g - a[x - i]);
                if (b != -1)
                    return 1 + b;
            } else if (g == a[x - i])
                return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int p;
        y = Integer.parseInt(reader.nextLine());
        String coinCount = reader.nextLine();
        String[] strs = coinCount.split(" ".toString());
        x = strs.length;
        a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = Integer.parseInt(strs[i]);
        }

        if (y <= 0) {
            System.out.println(-1);
            System.exit(0);
        }
        for (int i = 0; i < x; i++) {
            for (int n = 0; n < (x - 1); n++) {
                if (a[n] > a[n + 1]) {
                    p = a[n + 1];
                    a[n + 1] = a[n];
                    a[n] = p;
                }
            }
        }
        z = coin(y);
        System.out.println(z);
    }

}
