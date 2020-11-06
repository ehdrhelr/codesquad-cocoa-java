package day05.lv1;

import java.util.*;

public class Boj2920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SIZE = 8;

        List<Integer> list = new ArrayList<>();
        List<Integer> checker = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            int a = sc.nextInt();
            list.add(a);
            checker.add(a);
        }

        int count = 0;

        Collections.sort(checker);

        for (int i = 0; i < SIZE; i++) {
            if (list.get(i) == checker.get(i)) count++;
        }

        if (count == SIZE) {
            System.out.println("ascending");
            return;
        }

        Collections.reverse(checker);
        count = 0;

        for (int i = 0; i < SIZE; i++) {
            if (list.get(i) == checker.get(i)) count++;
        }

        if (count == SIZE) {
            System.out.println("descending");
            return;
        }

        System.out.println("mixed");

    }
}
