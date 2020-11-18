package day13.shell.clock;

import java.util.Calendar;

public class Clock {

    Hour hour;
    Minute minute;

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.init();
    }

    public void init() {
        hour = new Hour();
        minute = new Minute();
        int[] time = getTime();
        display(time);
    }

    public int[] getTime() {
        Calendar today = Calendar.getInstance();
        int hour = today.get((Calendar.HOUR));
        int minute = today.get(Calendar.MINUTE);
        int[] time = {0, 0};
        return time;
    }

    public void display(int[] time) {
        hour.displayHour(time);
        minute.displayMinuteOverTen(time);
        minute.displayMinuteUnderTen(time);
    }
}
