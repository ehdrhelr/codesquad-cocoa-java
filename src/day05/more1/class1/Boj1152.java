package day05.more1.class1;

import java.util.Scanner;

public class Boj1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] arrOfWords = input.split(" ");

        int size = arrOfWords.length;
        if (input.isEmpty()) size = 0;

        System.out.println(size);
    }
}
