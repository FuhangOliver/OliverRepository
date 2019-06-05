package test.LeeCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindTargetNum {
    public static void main(String[] args) {
//        int tar = 8;
//        int [][] arr = new int[][]{{1,3,5,8},{9,63,69,99}};
//        System.out.println(arr.length);
//        boolean b = Find3(8,arr);
//        ListNode ls = new ListNode(6);
        //int [] pre = new int[]{1,2,4,7,3,5,6,8},in = new int[]{4,7,2,1,5,3,8,6};
        //TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        int[] array = new int[]{6501, 6828, 6963, 7036, 7422, 7674, 8146, 8468, 8704, 8717, 9170, 9359, 9719, 9895, 9896, 9913, 9962, 154, 293, 334, 492, 1323, 1479, 1539, 1727, 1870, 1943, 2383, 2392, 2996, 3282, 3812, 3903, 4465, 4605, 4665, 4772, 4828, 5142, 5437, 5448, 5668, 5706, 5725, 6300, 6334};
        minNumberInRotateArray(array);
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int prestar, int preend, int[] in, int instar, int inend) {
        if (preend < prestar || inend < instar)
            return null;
        TreeNode head = new TreeNode(pre[prestar]);
        head.display();
        for (int i = instar; i <= inend; i++) {
            if (in[i] == pre[prestar]) {
                head.left = reConstructBinaryTree(pre, prestar + 1, prestar + i - instar, in, instar, i - 1);
                head.right = reConstructBinaryTree(pre, i - instar + prestar + 1, preend, in, i + 1, inend);
            }
        }
        return head;
    }

    public static boolean Find3(int target, int[][] arr) {
        int m = arr.length - 1;
        int i = 0;
        while (m >= 0 && i < arr[0].length) {
            if (arr[m][i] > target)
                m--;
            else if (arr[m][i] < target)
                i++;
            else
                return true;
        }

        return false;
    }

    public boolean Find1(int tar, int[] arr) {
        int start = 0, end = arr.length - 1;
        int mid = (start + end) / 2;
        boolean flag = false;

        while (end >= start) {
            if (tar <= arr[mid]) {
                end = mid - 1;
            } else if (tar > arr[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean Find(int target, int[][] array) {
        for (int[] array1 : array) {
            if (Find1(target, array1))
                return true;
            else
                return false;
        }
        return false;
    }

    public String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String regex = " +";
        string.replaceAll(regex, "%20");
        return string;
    }

    /**
     * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
     * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
     * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
     *
     * @param array
     * @return
     */
    public static int minNumberInRotateArray(int[] array) {
        int min = 0;
        if (array.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    min = array[i + 1];
                }
            }
        }
        return min;
    }

    /**
     * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
     * n<=39
     *
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

}
