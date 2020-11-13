package day10;

import java.util.ArrayList;

public class Solution2 {
    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        Solution2 sol = new Solution2();
        sol.solution(board, moves);
    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] == 0) {
                    continue;
                }
                list.add(board[j][moves[i] - 1]);

                if ((list.size() >= 2) && (list.get(list.size() - 1) == list.get(list.size() - 2))) {
                    answer += 2;
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                }
                board[j][moves[i] - 1] = 0;
                break;
            }
        }
        return answer;
    }
}
