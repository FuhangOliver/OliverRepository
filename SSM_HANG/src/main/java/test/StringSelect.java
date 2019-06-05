package test;

public class StringSelect {
    public static void main(String[] args) {
        String str1 = "nbasdfsdfsnbadfsfsnbacbaklkl";
        String str2 = "hfskfskanbacbadsf";
//        System.out.println("sub:"+str2.substring(0,str2.length()));
        String sub = getMaxSubString(str1, str2);
        System.out.println("最大相同子串是：" + sub);
    }

    /**
     * 获取两个字符串做大相同的子串
     * 思路：
     * 1，既然取得是最大子串，先看短的那个字符串是否在长的那个字符串中。
     * 如果存在，短的那个字符串就是最大子串。
     * 2，如果不是呢，那么就将短的那个子串进行长度递减的方式去子串，去长串中判断是否存在。
     * 如果存在就已找到，就不用在找了。
     *
     * @param str1
     * @param str2
     */
    public static String getMaxSubString(String str1, String str2) {
        String max = null, min = null;
        max = str1.length() > str2.length() ? str1 : str2;
        min = str1.equals(max) ? str2 : str1;
//        System.out.println("max:"+max+"\n"+"min:"+min);
        for (int i = 0; i < min.length(); i++) {
            for (int a = 0, b = min.length() - i; b != min.length() + 1; a++, b++) {
                String sub = min.substring(a, b);
//                System.out.printf("..."+str2.substring(a,b)+"\n");
                if (max.contains(sub)) {
                    return sub;
                }
            }
        }
        return null;
    }
}
