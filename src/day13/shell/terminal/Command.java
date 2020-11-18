package day13.shell.terminal;

public enum Command {
    LS("ls"), PWD("pwd"), HISTORY("history"), CP("cp "), HELP("help"),
    MKDIR("mkdir "), CD("cd "), HCLOCK("hclock"), EXIT("exit");

    private String commandAlias;

    Command(String commandAlias) {
        this.commandAlias = commandAlias;
    }

    public String getCommandAlias() {
        return this.commandAlias;
    }
}
