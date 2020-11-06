package day05.more1.class2;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) break;
            list.add(input);
        }

        // 팰린드롬수 체크
        for (int i = 0; i < list.size(); i++) {
            String num = list.get(i);
            int size = num.length() / 2;

            int checker = 0;
            for (int j = 0; j < size; j++) {
                if (num.charAt(j) == num.charAt(num.length() - 1 - j)) {
                    checker++;
                    continue;
                }
            }
            if (checker == size) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
