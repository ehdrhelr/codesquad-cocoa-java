package day08;

public enum Membership {
    SIGN_IN(1), SIGN_UP(2);

    private int index;

    Membership(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }


}
