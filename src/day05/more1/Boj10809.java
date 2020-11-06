package day05.more1;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10809 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a'] = input.indexOf(input.charAt(i) + "");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
