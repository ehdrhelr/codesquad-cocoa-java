package day05.more1.class1;

import java.util.Scanner;

public class Boj10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxValue = -1_000_001;
        int minValue = 1_000_001;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            maxValue = Math.max(maxValue, input);
            minValue = Math.min(minValue, input);
        }

        System.out.printf("%d %d", minValue, maxValue);
    }
}
