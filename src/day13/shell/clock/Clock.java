package day13.shell.clock;

public class Clock {

    Hour hour;

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.init();

    }

    public void init() {
        hour = new Hour();
        hour.getTime();
    }


}
