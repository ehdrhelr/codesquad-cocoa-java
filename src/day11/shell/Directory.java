/**
 * pwd를 입력시 현재 디렉토리를 보여준다.
 * 현재 디렉토리를 변수로 만들어서 관리하자.
 */

package day11.shell;

import java.io.File;

public class Directory implements Runnable {

    private static String currentDirectory = "/Users/shion/";
    private static DirectoryCommand commandStatus = null;

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    public static void setCurrentDirectory(String newCurrentDirectory) {
        currentDirectory = newCurrentDirectory;
    }

    public static void setCommandStatus(DirectoryCommand newCommandStatus) {
        commandStatus = newCommandStatus;
    }

    public void run() {
        if (commandStatus == DirectoryCommand.PWD) {
            System.out.println(getCurrentDirectory());
        }
        if (commandStatus == DirectoryCommand.MKDIR) {
            File newDirectory = new File(getCurrentDirectory() + DirectoryCommand.MKDIR.getNewDirectory() + "/");
            newDirectory.mkdir();
        }
        if (commandStatus == DirectoryCommand.CD) {
            File directory = new File(getCurrentDirectory());
            if (DirectoryCommand.CD.getNewDirectory().equals("..")) {
                String parentPath = directory.getParent() + "/";
                setCurrentDirectory(parentPath);
                return;
            }

            String newPath = getCurrentDirectory() + DirectoryCommand.CD.getNewDirectory() + "/";

            if (DirectoryCommand.CD.getNewDirectory().startsWith("Users")) {
                newPath = "/" + DirectoryCommand.CD.getNewDirectory() + "/";
            }

            if (!new File(newPath).isDirectory()) {
                System.out.println("no such file or directory : " + DirectoryCommand.CD.getNewDirectory());
                return;
            }

            setCurrentDirectory(newPath);
        }
    }
}
