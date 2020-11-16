package day11.shell;

public enum DirectoryCommand {

    PWD, MKDIR;

    private String newDirectory = "";

    public String getNewDirectory() {
        return this.newDirectory;
    }

    public void setNewDirectory(String newDirectory) {
        this.newDirectory = newDirectory;
    }
}
