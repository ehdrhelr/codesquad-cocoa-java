package day05.more1.class2;

import java.util.Scanner;

public class Boj1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String nameOfMovie = "666";

        String[] arr = new String[n];
        int index = 0;

        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            String iStr = i + "";
            if (iStr.contains("666")) {
                arr[index] = iStr;
                if (index == n - 1) break;
                index++;
            }
            ;
        }
        System.out.println(arr[n - 1]);
    }
}

// 666, 1666, 2666, 3666, 4666, 5666, 6661, 6662, 6663, 6664, 6665, 6666, 6667, 6668, 6669, 7666, 8666, 9666
// 10666, 11666, 12666, 13666, 14666, 15666, 16661, 16662, 16663, 16664, 16665, 16666, 16667, 16668, 16669, 17666, 18666,19666