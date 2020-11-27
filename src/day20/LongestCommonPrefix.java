// https://leetcode.com/problems/longest-common-prefix/

package day20;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] arr = {"flower", "flower", "flower", "flower"};
        String result = lcp.longestCommonPrefix(arr);
        System.out.println(result);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int indexOfShortestWord = -1;
        int minimumLength = 201;
        for (int i = 0; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
            if (minimumLength == strs[i].length()) {
                indexOfShortestWord = i;
            }
        }
        if (indexOfShortestWord == -1) return "";
        System.out.println("minimumLength : " + minimumLength);
        System.out.println("indexOfShortestWord : " + indexOfShortestWord);

        for (int i = 0; i < minimumLength; i++) {
            char ch = strs[indexOfShortestWord].charAt(i);
            int sameNum = 0;
            for (int j = 0; j < strs.length; j++) {
                if (j == indexOfShortestWord) continue;
                if (ch != strs[j].charAt(i)) break;
                sameNum++;
            }
            if (sameNum == strs.length - 1) result += ch;
            else break;
        }

        return result;
    }
}
