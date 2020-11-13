package day10;

public class Solution6 {
    public static void main(String[] args) {
        Solution6 sol = new Solution6();
        int result = sol.solution(12);
        System.out.println(result);

    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }

}
