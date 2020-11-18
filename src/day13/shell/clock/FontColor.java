package day13.shell.clock;

public enum FontColor {
    ANSI_RESET("\u001B[0m"), ANSI_CYAN("\u001B[36m");

    private String value;

    FontColor(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
