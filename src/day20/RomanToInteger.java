// https://leetcode.com/problems/roman-to-integer/

package day20;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        int result = rti.romanToInt("MDCXCV");
        System.out.println(result);
    }

    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            char ch = s.charAt(i);
            char chBefore = s.charAt(i - 1);
            result += getInteger(ch);
            if (chBefore == 'I' && ch == 'V') {
                result -= 1;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else if (chBefore == 'I' && ch == 'X') {
                result -= 1;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else if (chBefore == 'X' && ch == 'L') {
                result -= 10;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else if (chBefore == 'X' && ch == 'C') {
                result -= 10;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else if (chBefore == 'C' && ch == 'D') {
                result -= 100;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else if (chBefore == 'C' && ch == 'M') {
                result -= 100;
                i--;
                if (i == 1) result += getInteger(s.charAt(0));
            } else {
                if (i == 1) result += getInteger(s.charAt(0));
            }

        }
        if (s.length() == 1) {
            result += getInteger(s.charAt(0));
        }
        return result;
    }

    public int getInteger(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
