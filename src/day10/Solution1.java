package day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;

        int[] result = sol.solution(arr3, divisor3);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if (answer.length == 0) return new int[]{-1};
        Arrays.sort(answer);

        return answer;
    }
}
