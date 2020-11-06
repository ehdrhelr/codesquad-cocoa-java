package day05.lv1;

import java.util.Scanner;

public class Boj8908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] ox = new String[n];
        for (int i = 0; i < n; i++) {
            ox[i] = sc.next();
        }

        int[] scoreBoard = new int[n];

        for (int i = 0; i < ox.length; i++) {
            int score = 0;
            for (int j = 0; j < ox[i].length(); j++) {
                if (ox[i].charAt(j) == 'O') {
                    score += 1;
                    scoreBoard[i] += score;
                    continue;
                }
                score = 0;
            }
        }

        for (int score : scoreBoard) {
            System.out.println(score);
        }


    }
}
