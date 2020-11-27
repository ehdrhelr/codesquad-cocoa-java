// https://leetcode.com/problems/reverse-integer/

package day20;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int result = ri.reverse(-123);
        System.out.println(result);
    }

    public int reverse(int x) {
        int op = 1;
        String xStr = x + "";
        if (xStr.startsWith("-")) {
            xStr = xStr.substring(1);
            op = -1;
        }
        StringBuilder xSb = new StringBuilder(xStr);
        xSb.reverse();
        long result = Long.valueOf(xSb.toString());
        if (result < Integer.MIN_VALUE || Integer.MAX_VALUE < result) {
            result = 0;
        }
        return (int) result * op;
    }
}
