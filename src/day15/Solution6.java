// https://www.hackerrank.com/challenges/kangaroo/problem

package day15;

public class Solution6 {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v2 >= v1) return "NO"; // b가 a보다 걸음이 크면 도달X
        if ((x2 - x1) % v1 == 0) { // a가 b의 시작점에 도달함
            return "YES";
        }

        int initialDiff = x2 - x1;
        int diffRate = v1 - v2;
        if (initialDiff < diffRate) return "NO";
        if (initialDiff % diffRate == 0) return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        String result = kangaroo(0, 2, 5, 3);
        System.out.println(result);
    }
}
