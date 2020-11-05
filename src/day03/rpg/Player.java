package day03.rpg;

public class Player {
    private static final int INIT_LOCATION = 6;
    private int x; // x 좌표
    private int y; // y 좌표

    Player() { // 객체 생성하면 맵 정 가운데 (6, 6) 위치
        this.x = INIT_LOCATION;
        this.y = INIT_LOCATION;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
}
