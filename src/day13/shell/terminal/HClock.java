package day13.shell.terminal;

import day13.shell.clock.Clock;

public class HClock extends Thread {

    public void run() {
        Clock clock = new Clock();
        clock.init();
    }

}
