package day05.more1;

import java.util.Scanner;

public class Boj2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String sum = a * b * c + "";

        for (int i = 0; i < sum.length(); i++) {
            numbers[sum.charAt(i) - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
