package day05.more1.class2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] temp = new int[n];
        ArrayList<String> result = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            temp[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (!s.isEmpty() && s.peek() == temp[j]) {
                s.pop();
                j++;
                result.add("pop");
                System.out.print("pop ");

            }
            s.push(i + 1);
            result.add("push");
            System.out.print("push ");
        }

    }
}
