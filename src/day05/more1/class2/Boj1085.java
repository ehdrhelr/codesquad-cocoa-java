package day05.more1.class2;

import java.util.Scanner;

public class Boj1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int distWidth = w - x;
        if (distWidth > x) distWidth = x;
        int distHeight = h - y;
        if (distHeight > y) distHeight = y;

        int result = Math.min(distWidth, distHeight);

        System.out.println(result);
    }
}
