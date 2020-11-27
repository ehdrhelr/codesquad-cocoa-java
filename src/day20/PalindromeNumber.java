// https://leetcode.com/problems/palindrome-number/

package day20;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        boolean result = pn.isPalindrome(121);
        System.out.println(result);
    }

    public boolean isPalindrome(int x) {
        String xStr = x + "";
        StringBuilder xSb = new StringBuilder(xStr);
        xSb.reverse();
        if (xStr.equals(xSb.toString())) {
            return true;
        }
        return false;
    }
}
