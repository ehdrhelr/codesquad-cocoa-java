package day13.shell.terminal;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class History extends Thread {
    private static final int HISTORY_MAX_SIZE = 10;
    private static Queue<String> history = new LinkedList<>();

    public static void saveInHistory(String command) {
        if (!command.equals("")) {
            history.offer(command);
        }
        if (history.size() > HISTORY_MAX_SIZE) {
            history.remove();
        }
    }

    public static Queue<String> getHistory() {
        return history;
    }

    public void run() {
        int i = 0;
        LinkedList<String> tempHistory = (LinkedList<String>) getHistory();
        ListIterator<String> iterHistory = tempHistory.listIterator();

        while (iterHistory.hasNext()) {
            System.out.println(" " + ++i + "  " + iterHistory.next());
        }
    }

}
