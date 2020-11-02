package day01;

import java.util.*;

public class Gugudan {

    Gugudan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단의 시작단과 끝단을 입력해주세요.");
        System.out.print(">> ");

        int startDan = sc.nextInt();
        int endDan = sc.nextInt();

        System.out.printf("%d단부터 %d단까지 출력합니다..%n", startDan, endDan);

        multiply1to9(startDan, endDan);
        sc.close();
    }

    private void multiply1to9(int startDan, int endDan) {
        for (int i = 1; i <= 9; i++) {
            printResultOfMultiplying(startDan,endDan, i);
            System.out.println();
        }
    }

    private void printResultOfMultiplying(int startDan, int endDan, int i) {
        for (int dan = startDan; dan <= endDan; dan++) {
            System.out.printf("%d X %d = %-7d", dan, i, dan * i);
        }
    }

    public static void main(String[] args) {
        new Gugudan();
    }
}
