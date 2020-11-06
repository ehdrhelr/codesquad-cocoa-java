package day05.more1;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine().trim().toUpperCase();

        String[] als = word.split(""); // alphabets

        int[] count = new int[26];
        int[] sortedArr = new int[26];

        for (int i = 0; i < als.length; i++) {
            int alphabet = als[i].charAt(0) - 'A';
            count[alphabet]++;
            sortedArr[alphabet]++;
        }

        Arrays.sort(sortedArr);

        String result = "";
        if (sortedArr[count.length - 1] == sortedArr[count.length - 2]) {
            result = "?";
        } else {
            for (int i = 0; i < count.length; i++) {
                if (sortedArr[count.length - 1] == count[i]) {
                    result = (char) (i + 'A') + "";
                }
            }
        }
        System.out.println(result);



    }
}
