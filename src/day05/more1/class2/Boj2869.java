package day05.more1.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Boj2869 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int v = Integer.parseInt(inputs[2]);

        int day = 0;

        v -= a;
        day = v / (a - b);
        day++;


        System.out.println(day);
    }
}
