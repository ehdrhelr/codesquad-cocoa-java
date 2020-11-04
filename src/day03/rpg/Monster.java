package day03.rpg;

public class Monster {
    private int x; // x 좌표
    private int y; // y 좌표

    Monster() { // 객체 생성하면 맵 임의의 장소에 몬스터 위치
        locateMonster();
    }

    public void locateMonster() {

        x = (int) (Math.random() * 11) + 1;
        y = (int) (Math.random() * 11) + 1;

        if (x == 6 && y == 6) { // 몬스터가 플레이어 위치에 생성되면
            locateMonster();    // 다시 위치 시킨다.
        }

        if (x == 0 || y == 0) { // 몬스터가 index 1 - 11 밖에 있으면
            locateMonster();    // 다시 위치 시킨다.
        }

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
