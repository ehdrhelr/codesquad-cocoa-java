package day05.more1.class1;

import java.util.Scanner;

public class Boj2675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String[n];

        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextLine();
        }
        for (int i = 0; i < inputs.length; i++) {
            String[] rs = inputs[i].split(" ");
            int r = Integer.valueOf(rs[0]);
            String s = rs[1];
            String result = "";
            for (int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    if (s.charAt(j) == '\\') result += '\\' + "";
                    result += s.charAt(j) + "";
                }
            }
            System.out.println(result);
        }

    }
}
