// https://www.hackerrank.com/challenges/compare-the-triplets/problem

package day15;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(2);
        result.add(0);
        result.add(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                int aliceScore = result.get(0);
                result.set(0, ++aliceScore);
            }
            if (a.get(i) < b.get(i)) {
                int bobScore = result.get(1);
                result.set(1, ++bobScore);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);

        List<Integer> result = compareTriplets(a, b);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
