/**
 * pwd를 입력시 현재 디렉토리를 보여준다.
 * 현재 디렉토리를 변수로 만들어서 관리하자.
 */

package day11.shell;

public class Directory implements Runnable {

    private static String currentDirectory = "/Users/shion";

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    public static void setCurrentDirectory(String newCurrentDirectory) {
        currentDirectory = newCurrentDirectory;
    }

    public void run() {
        System.out.println(getCurrentDirectory());
    }
}
