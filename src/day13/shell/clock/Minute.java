package day13.shell.clock;

public class Minute {

    String[] minuteOverTen;
    String[] minuteUnderTen;

    public void displayMinuteOverTen(int[] time) {
        MinuteBoard minuteBoard = new MinuteBoard();
        minuteOverTen = minuteBoard.getMinuteBoardOverTen();

        for (int i = 1; i < minuteOverTen.length; i++) {
            System.out.print(minuteOverTen[i] + " ");
        }
        System.out.println();
    }

    public void displayMinuteUnderTen(int[] time) {
        MinuteBoard minuteBoard = new MinuteBoard();
        minuteUnderTen = minuteBoard.getMinuteboardUnderTen();
        for (int i = 0; i < minuteUnderTen.length; i++) {
            moveNextLineWhenTargetIndex(i);
            System.out.print(minuteUnderTen[i] + " ");
        }
    }

    public void moveNextLineWhenTargetIndex(int i) {
        if (i == 6) {
            System.out.println();
        }
    }
}
