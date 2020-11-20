// https://www.hackerrank.com/challenges/time-conversion/problem

package day15;

public class Solution5 {
    static String timeConversion(String s) {
        String result = "";
        if (s.endsWith("PM")) {
            if (!s.startsWith("12")) {
                int time = Integer.valueOf(s.substring(0, 2));
                time += 12;
                s = time + s.substring(2);
            }
            result = s.replace("PM", "");
        }
        if (s.endsWith("AM")) {
            if (s.startsWith("12")) {
                s = s.replaceFirst("12", "00");
            }
            result = s.replace("AM", "");
        }
        return result;
    }

    public static void main(String[] args) {
        String result = timeConversion("07:05:45PM");
        System.out.println(result);
    }

}
