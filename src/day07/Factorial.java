package day07;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n < 2) return 1;
        return n * factorial(n - 1);
    }

    public static int factorialWithLoop(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int result = factorial(input);
        System.out.println(result);
    }
}
