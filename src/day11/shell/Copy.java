package day11.shell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy implements Runnable {
    private String targetFileName = "";
    private String copiedFileName = "";

    public Copy(String targetFileName, String copiedFileName) {
        this.targetFileName = targetFileName;
        this.copiedFileName = copiedFileName;
    }

    public void run() {
        File targetFile = new File(Directory.getCurrentDirectory() + targetFileName);
        File copiedFile = new File(Directory.getCurrentDirectory() + copiedFileName);
        if (targetFile.isDirectory()) {
            System.out.println("cp : " + targetFileName + " is a directory (not copied).");
            return;
        }
        try (FileInputStream fis = new FileInputStream(targetFile);
             FileOutputStream fos = new FileOutputStream(copiedFile)) {

            int fileByte = 0;

            while ((fileByte = fis.read()) != -1) {
                fos.write(fileByte);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }

    }

    public String getTargetFileName() {
        return targetFileName;
    }

    public void setTargetFileName(String targetFileName) {
        this.targetFileName = targetFileName;
    }

    public String getCopiedFileName() {
        return copiedFileName;
    }

    public void setCopiedFileName(String copiedFileName) {
        this.copiedFileName = copiedFileName;
    }
}
