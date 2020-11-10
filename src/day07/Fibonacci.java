package day07;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("피보나치 수열의 몇 번째 값을 찾으시나요??");
        System.out.print(" >> ");

        int n = sc.nextInt();
        int result = fibonacci(n);

        System.out.println(result);
    }
}
