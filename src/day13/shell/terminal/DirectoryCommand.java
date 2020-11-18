package day13.shell.terminal;

public enum DirectoryCommand {

    PWD, MKDIR, CD;

    private String newDirectory = "";

    public String getNewDirectory() {
        return this.newDirectory;
    }

    public void setNewDirectory(String newDirectory) {
        this.newDirectory = newDirectory;
    }
}
