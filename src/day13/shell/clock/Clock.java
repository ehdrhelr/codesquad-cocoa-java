package day13.shell.clock;

import java.util.Calendar;

public class Clock {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.getTime();

    }

    public void getTime() {
        Calendar today = Calendar.getInstance();
        int hour = today.get((Calendar.HOUR));
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);

        display(hour);

    }

    public void display(int hour) {
        displayHour(hour);
    }

    public void moveNextLineWhenTargetHourIndex(int i) {
        if (i == 6) System.out.println();
        if (i == 9) System.out.println();
    }

    public void displayHour(int hour) {
        HourBoard hourBoard = new HourBoard();
        String[] hourOnClock = hourBoard.getHourBoard();
        for (int i = 1; i < hourBoard.getHourBoard().length; i++) {
            if (i == hour) {
                System.out.print(ANSI_CYAN + hourOnClock[i] + " " + ANSI_RESET);
                continue;
            }
            if (i == hourBoard.getHourBoard().length - 1) {
                System.out.print(ANSI_CYAN + hourOnClock[i] + " " + ANSI_RESET);
                continue;
            }
            moveNextLineWhenTargetHourIndex(i);
            System.out.print(hourOnClock[i] + " ");
        }
    }
}
