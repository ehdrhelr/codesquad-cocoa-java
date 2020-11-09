package day06.game;

public enum YesOrNo {
    YES(1), NO(2);

    private int value;

    YesOrNo(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
