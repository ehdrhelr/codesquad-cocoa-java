// https://www.hackerrank.com/challenges/a-very-big-sum/problem

package day15;

public class Solution4 {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long lo : ar) {
            sum += lo;
        }
        return sum;
    }

    public static void main(String[] args) {
        long[] ar = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long result = aVeryBigSum(ar);
        System.out.println(result);
    }
}
