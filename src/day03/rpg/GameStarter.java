// 11 * 11 배열 초기화
// 화면 중앙에는 캐릭터 위치
// 임의의 장소에 몬스터 위치
// 임의의 장소에 1개의 지뢰를 배치한다. 단 지뢰는 플레이어가 밟기 전까지 화면에 표시하지 않는다.
// 콘솔 입력으로 WASD 중 하나의 키를 입력받고 엔터를 누르면 캐릭터가 상좌하우로 이동함
// 캐릭터가 지뢰를 밟으면 사망
// 캐릭터가 몬스터의 위치까지 이동하면 몬스터가 사라지고 정해진 점수 획득
// 점수 획득시 새로운 몬스터와 지뢰를 배치한다. 단 지뢰의 갯수는 2배 증가시킨다.
// 매 턴마다 현재 배열의 상태를 화면에 출력. 단 밟지 않은 지뢰는 표시하지 않는다.
// 똑같이 구현하지 않아도 되니 재미있는 게임을 만들어 보자.

// 캐릭터, 몬스터, 지뢰 맵 못 벗어나게 하기
// 캐릭터, 몬스터, 지뢰 위치 안겹치게 하
// 지뢰 숨기기
// 점수 획득하고 지뢰 증가시켜서 재시작


package day03.rpg;

import java.util.*;

public class GameStarter {

    static int[][] map = new int[12][12]; // 11 * 11 크기의 맵 생성

    Player player;
    Monster monster;
    Mine mine;

    int score = 0; // 점수
    int currentRound = 0; // 판수

    boolean isMonsterMeet = false;
    boolean isStepOnMine = false;

    // 플레이어 이동    W, A, S, D
    int[] moveX = { 0,-1, 0, 1};
    int[] moveY = {-1, 0, 1, 0};

    public void init() {
        currentRound++;
        isMonsterMeet = false;
        isStepOnMine = false;

        player = new Player();   // 플레이어 객체 생성하고 위치 초기화 (6, 6)
        monster = new Monster(); // 몬스터 객체 생성하고 위치 초기화(random)
        mine = new Mine(monster);// 지뢰 객체 생성하고 위치 초기화(random)
    }

    public void movePlayer() {
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine();
        if (move.equalsIgnoreCase("W")) moveUp();
        if (move.equalsIgnoreCase("A")) moveLeft();
        if (move.equalsIgnoreCase("S")) moveDown();
        if (move.equalsIgnoreCase("D")) moveRight();
    }

    public void moveUp() {
        int newX = player.getX() + moveX[0]; // 이동하려는 위치의 x좌표 newX
        int newY = player.getY() + moveY[0]; // 이동하려는 위치의 y좌표 newY
        if (outOfMap(newX, newY)) {
            System.out.println("맵 바깥쪽은 위험합니다.!");
            return;
        }
        player.setX(newX);
        player.setY(newY);
    }

    public void moveLeft() {
        int newX = player.getX() + moveX[1]; // 이동하려는 위치의 x좌표 newX
        int newY = player.getY() + moveY[1]; // 이동하려는 위치의 y좌표 newY
        if (outOfMap(newX, newY)) {
            System.out.println("맵 바깥쪽은 위험합니다.!");
            return;
        }
        player.setX(newX);
        player.setY(newY);
    }

    public void moveDown() {
        int newX = player.getX() + moveX[2]; // 이동하려는 위치의 x좌표 newX
        int newY = player.getY() + moveY[2]; // 이동하려는 위치의 y좌표 newY
        if (outOfMap(newX, newY)) {
            System.out.println("맵 바깥쪽은 위험합니다.!");
            return;
        }
        player.setX(newX);
        player.setY(newY);
    }

    public void moveRight() {
        int newX = player.getX() + moveX[3]; // 이동하려는 위치의 x좌표 newX
        int newY = player.getY() + moveY[3]; // 이동하려는 위치의 y좌표 newY
        if (outOfMap(newX, newY)) {
            System.out.println("맵 바깥쪽은 위험합니다.!");
            return;
        }
        player.setX(newX);
        player.setY(newY);
    }

    public void showMap() {
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                if (j == player.getX() && i == player.getY()) {
                    System.out.print("P ");
                    continue;
                }
                if (j == mine.getX() && i == mine.getY()) {
                    System.out.print("X ");
                    continue;
                }
                if (j == monster.getX() && i == monster.getY()) {
                    System.out.print("M ");
                    continue;
                }
                System.out.print("O ");
            }
            System.out.println();
        }
    } // 14 lines, 3 depth - > 각각 10 , 1 이하로 줄이자.

    public void checkMeetMonster(int playerX, int playerY) {
        if (playerX == monster.getX() && playerY == monster.getY()) {
            score++; // 점수 획득하고
            System.out.println("1점 획득! (총 점수 : " + score + ")");
            isMonsterMeet = true;
        }
    }

    public void checkStepOnMine(int playerX, int playerY) {
        if (playerX == mine.getX() && playerY == mine.getY()) {
            System.out.println("GAME OVER (총 점수 : " + score + ")");
            isStepOnMine = true;
        }
    }

    public boolean outOfMap(int x, int y) { // 플레이어가 맵 바깥으로 나가지 못하도록
        if (x < 1 || y < 1 || x > 11 || y > 11) return true;
        return false;
    }

    public void playGame() {
        init();
        while (true) {
            showMap();
            movePlayer();
            checkMeetMonster(player.getX(), player.getY());
            checkStepOnMine(player.getX(), player.getY());
            if (isMonsterMeet) playGame();
            if (isStepOnMine) return;
        }
    } // 9 lines

    public static void main(String[] args) {
        GameStarter gameStarter = new GameStarter();
        gameStarter.playGame();

    }
}
