package day11.shell;

public class Help extends Thread {

    public void run() {
        System.out.println(" help          show the list of help");
        System.out.println(" ls            show the list of files in the directory");
        System.out.println(" pwd           show the current directory path");
        System.out.println(" history       show the last 10 commands");
        System.out.println(" cp            copy the file and paste in the directory");
        System.out.println(" mkdir         make the directory");
        System.out.println(" exit          exit the process");
    }
}
