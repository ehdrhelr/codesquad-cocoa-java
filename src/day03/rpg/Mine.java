package day03.rpg;

import java.util.ArrayList;

public class Mine {

    private ArrayList<ArrayList<Integer>> mineXY = new ArrayList<>();

    Mine(Monster monster, int currentRound) { // 객체 생성하면 맵 임의의 장소에 지뢰 위치
        for (int i = 0; i < Math.pow(2, currentRound - 1); i++) {
            locateMine(monster);
        }
    }

    public void locateMine(Monster monster) {

        int x = (int) (Math.random() * 11) + 1;
        int y = (int) (Math.random() * 11) + 1;

        if (x == 6 && y == 6) {  // 지가 플레이어 위치에 생성되면
            locateMine(monster); // 다시 위치 시킨다.
        }

        if (x == 0 || y == 0) {  // 지가 index 1 - 11 밖에 있으면
            locateMine(monster); // 다시 위치 시킨다.
        }

        if (x == monster.getX() && y == monster.getY()) { // 지뢰가 몬스터와 위치가 같으면
            locateMine(monster); // 다시 위치 시킨뢰다.
        }

        ArrayList<Integer> position = new ArrayList<>();
        position.add(x);
        position.add(y);
        mineXY.add(position);
    }

    public ArrayList<ArrayList<Integer>> getMineXY() {
        return mineXY;
    }
}
