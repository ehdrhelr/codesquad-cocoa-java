package day05.more1;

import java.util.Scanner;

public class Boj2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        int sumOfSquare = 0;
        for (int i = 0; i < 5; i++) {
            sumOfSquare += Math.pow(numbers[i], 2);
        }

        System.out.println(sumOfSquare % 10);
    }
}
