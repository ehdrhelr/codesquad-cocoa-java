package day10;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 sol = new Solution3();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        int[] answer = sol.solution(numbers2);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] numbers) {
        int[] add = new int[201];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int addIndex = numbers[i] + numbers[j];
                add[addIndex]++;
            }
        }
        for (int i = 0; i < add.length; i++) {
            if (add[i] != 0) {
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
