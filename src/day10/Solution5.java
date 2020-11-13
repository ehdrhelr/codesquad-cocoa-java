package day10;

public class Solution5 {
    public static void main(String[] args) {
        Solution5 sol = new Solution5();
        int a = 5;
        int b = 24;
        sol.solution(a, b);
    }

    public String solution(int a, int b) {
        String[] nameOfDay = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int HowManyDaysFromFirst = 0;
        int targetDate = 0;
        for (int i = 0; i < a; i++) {
            HowManyDaysFromFirst += daysInMonth[i];
        }
        targetDate = b + HowManyDaysFromFirst;
        int targetDay = targetDate % 7;

        /*
        1 = fri
        2 = sat
        3 = sun
        4 = mon
        5 = tue
        6 = wed
        0 = thu
         */

        String answer = nameOfDay[targetDay];
        return answer;
    }

}
