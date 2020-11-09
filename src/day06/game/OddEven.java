package day06.game;

public enum OddEven {
    ODD(1), EVEN(2);

    private int value;

    OddEven(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
