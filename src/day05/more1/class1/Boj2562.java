package day05.more1.class1;

import java.util.Scanner;

public class Boj2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[9];

        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxValue = -1;

        for (int i = 0; i < 9; i++) {
            maxValue = Math.max(maxValue, numbers[i]);
        }
        int index = -1;

        for (int i = 0; i < 9; i++) {
            if (numbers[i] == maxValue) {
                index = i + 1;
            }
        }

        System.out.println(maxValue);
        System.out.println(index);
    }
}
