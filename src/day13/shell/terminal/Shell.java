package day13.shell.terminal;

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
            History.saveInHistory(command);
            if (command.trim().equalsIgnoreCase(Command.LS.getCommandAlias())) { // Runnable 구현
                Runnable list = new List();
                Thread listThread = new Thread(list);
                listThread.start();
                Thread.sleep(10);
            }
            if (command.trim().equalsIgnoreCase(Command.PWD.getCommandAlias())) { // Runnable 구현
                Directory.setCommandStatus(DirectoryCommand.PWD);
                Thread directoryThread = new Thread(new Directory());
                directoryThread.start();
                Thread.sleep(10);
            }
            if (command.trim().equalsIgnoreCase(Command.HISTORY.getCommandAlias())) { // Thread 상속
                History historyThread = new History();
                historyThread.start();
                Thread.sleep(10);
            }
            if (command.startsWith(Command.HISTORY.getCommandAlias())) { // Runnable 구현
                String[] files = command.split(" ");
                String targetFile = files[1];
                String copiedFile = files[2];
                Runnable copy = new Copy(targetFile, copiedFile);
                Thread copyThread = new Thread(copy);
                copyThread.start();
                Thread.sleep(10);
            }
            if (command.trim().equalsIgnoreCase(Command.HELP.getCommandAlias())) { // Thread 상속
                Help help = new Help();
                help.start();
                Thread.sleep(10);
            }
            if (command.startsWith(Command.MKDIR.getCommandAlias())) {
                Directory.setCommandStatus(DirectoryCommand.MKDIR);
                String[] commandAndDirectory = command.split(" ");
                String directory = commandAndDirectory[1];
                DirectoryCommand.MKDIR.setNewDirectory(directory); // MKDIR에 입력된 directory를 변수값?으로 넣어준다.
                Thread directoryThread = new Thread(new Directory());
                directoryThread.start();
                Thread.sleep(10);
            }

            if (command.startsWith(Command.CD.getCommandAlias())) {
                Directory.setCommandStatus(DirectoryCommand.CD);
                String[] commandAndDirectory = command.split(" ");
                String directory = commandAndDirectory[1];
                DirectoryCommand.CD.setNewDirectory(directory); // CD에 입력된 directory를 변수값?으로 넣어준다.
                Thread directoryThread = new Thread(new Directory());
                directoryThread.start();
                Thread.sleep(10);
            }
            if (command.equalsIgnoreCase(Command.HCLOCK.getCommandAlias())) {
                HClock clock = new HClock();
                clock.start();
                Thread.sleep(10);
            }

            if (command.equalsIgnoreCase(Command.EXIT.getCommandAlias())) {
                System.out.println("[ 프로세스 완료됨 ]");
                System.exit(0);
            }
        }
    }
}
