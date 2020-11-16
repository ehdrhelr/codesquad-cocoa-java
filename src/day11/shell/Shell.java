package day11.shell;

import java.util.Scanner;

public class Shell {

    public static void main(String[] args) throws Exception {
        Shell shell = new Shell();
        shell.startMainShell();
    }

    public void startMainShell() throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Java Shell> ");
            String command = sc.nextLine();
            if (command.equalsIgnoreCase("ls")) {
                Runnable list = new List();
                Thread listThread = new Thread(list);
                listThread.start();
                Thread.sleep(10);
            }
        }
    }
}
