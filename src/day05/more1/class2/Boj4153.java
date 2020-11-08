package day05.more1.class2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> result = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("0 0 0")) break;
            list.add(input);
        }

        for (String str : list) {
            String[] lengths = str.split(" ");
            int a = Integer.parseInt(lengths[0]);
            int b = Integer.parseInt(lengths[1]);
            int c = Integer.parseInt(lengths[2]);
            int[] numbers = {a, b, c};
            Arrays.sort(numbers);

            if (Math.pow(numbers[0], 2) + Math.pow(numbers[1], 2) == Math.pow(numbers[2], 2)) {
                result.add("right");
            } else result.add("wrong");
        }

        for (String str : result) {
            System.out.println(str);
        }

    }
}
