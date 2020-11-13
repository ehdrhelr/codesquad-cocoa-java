package day10;

import java.util.ArrayList;
import java.util.Collections;

public class Solution4 {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        int[] answers = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};

        int[] answer = sol.solution(answers);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[] answers) {
        int[] a = new int[10001];
        int[] b = new int[10001];
        int[] c = new int[10001];

        int aCorrect = 0;
        int bCorrect = 0;
        int cCorrect = 0;

        // a 값 초기화 {1, 2, 3, 4, 5, 1, 2, 3, 4, 5 ..., 1, 2, 3, 4, 5}
        for (int i = 1; i < a.length; i++) {
            if (i % 5 == 0) {
                a[i] = 5;
                continue;
            }
            a[i] = i % 5;
        }
        // b 값 초기화 {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5 ..., 2, 1, 2, 3, 2, 4, 2, 5}
        int even = 0;
        for (int i = 1; i < b.length; i++) {
            if (i % 2 != 0) {
                b[i] = 2;
                continue;
            }
            if (i % 2 == 0) {
                if (even == 5) even = 0;
                even++;
                if (even == 2) even = 3;
                b[i] = even;
            }
        }
        // c 값 초기화 {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ..., 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,}
        int data = 0;
        for (int i = 1; i < c.length; i += 2) {
            if (data == 5) data = 0;

            data++;

            if (data == 1) data = 3;
            else if (data == 4) data = 1;
            else if (data == 3) data++;

            c[i] = data;
            c[i + 1] = data;
        }
        // 맞춘 문제 개수 확인
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i + 1]) aCorrect++;
            if (answers[i] == b[i + 1]) bCorrect++;
            if (answers[i] == c[i + 1]) cCorrect++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(aCorrect);
        list.add(bCorrect);
        list.add(cCorrect);
        int max = Collections.max(list);

        ArrayList<Integer> result = new ArrayList<>();
        if (max == list.get(0)) result.add(1);
        if (max == list.get(1)) result.add(2);
        if (max == list.get(2)) result.add(3);

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
