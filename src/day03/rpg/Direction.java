package day03.rpg;

public enum Direction {
    W(0), A(1), S(2), D(3);

    private int index;

    Direction(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
