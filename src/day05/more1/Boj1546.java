package day05.more1;

import java.util.Scanner;

public class Boj1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int maxScore = -1;

        for(int i = 0; i < n; i++) {
            maxScore = Math.max(maxScore, scores[i]);
        }

        float[] changedScores = new float[n];
        float sumOfChangedScores = 0.0f;
        for (int i = 0; i < n; i++) {
            changedScores[i] = 1.0f * scores[i] / maxScore * 100;
            sumOfChangedScores += changedScores[i];
        }

        System.out.println(sumOfChangedScores / n);
    }
}
