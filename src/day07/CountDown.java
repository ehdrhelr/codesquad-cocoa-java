package day07;

import java.util.Scanner;

public class CountDown extends Thread {

    public static void countDown(int n) throws Exception {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("카운트 다운 설정 (초)");
        System.out.print(" >> ");
        int n = sc.nextInt();
        countDown(n);
    }
}
