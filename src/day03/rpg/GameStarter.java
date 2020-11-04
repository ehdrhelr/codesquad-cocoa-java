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

package day03.rpg;

import java.util.*;

public class GameStarter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] map = new int[12][12]; // 전체 맵

        int[]     player = {6, 6}; // 플레이어의 위치
        int[]    monster = {0, 0}; // 몬스터의 위치
        int[] spiderMine = {0, 0}; // 지뢰의 위치

        int score = 0; // 점수

        // 플레이어 이동   W, A, S, D
        int[] moveX = { 0,-1, 0, 1};
        int[] moveY = {-1, 0, 1, 0};

        // 몬스터 소환
        monster[0] = (int) (Math.random() * 11) + 1;
        monster[1] = (int) (Math.random() * 11) + 1;

        // 지뢰 심기
        spiderMine[0] = (int) (Math.random() * 11) + 1;
        spiderMine[1] = (int) (Math.random() * 11) + 1;

        while (true) {
            // 화면 출력
            for (int i = 1; i < map.length; i++) {
                for (int j = 1; j < map.length; j++) {
                    if (j == player[0] && i == player[1]) {
                        System.out.print("P ");
                        continue;
                    }
                    if (j == monster[0] && i == monster[1]) {
                        System.out.print("M ");
                        continue;
                    }
                    if (j == spiderMine[0] && i == spiderMine[1]) {
                        System.out.print("X ");
                        continue;
                    }
                    System.out.print("O ");
                }
                System.out.println();
            }

            String move = sc.nextLine();

            if (move.equalsIgnoreCase("W")) {
                int newX = player[0] + moveX[0];
                int newY = player[1] + moveY[0];
                if (newX == monster[0] && newY == monster[1]) { // 캐릭터가 몬스터 위치로 가면
                    score++; // 점수 획득하고
                    System.out.println("승리!");
                    return; // 끝남 (1판 가정)
                }
                if (newX == spiderMine[0] && newY == spiderMine[1]) { // 캐릭터가 몬스터 위치로 가면
                    System.out.println("game over");
                    return; // 끝남 (1판 가정)
                }
                // 아무일도 일어나지 않으면 그냥 위치이동
                player[0] = newX;
                player[1] = newY;
            }

            if (move.equalsIgnoreCase("A")) {
                int newX = player[0] + moveX[1];
                int newY = player[1] + moveY[1];
                if (newX == monster[0] && newY == monster[1]) { // 캐릭터가 몬스터 위치로 가면
                    score++; // 점수 획득하고
                    System.out.println("승리!");
                    return; // 끝남 (1판 가정)
                }
                if (newX == spiderMine[0] && newY == spiderMine[1]) { // 캐릭터가 몬스터 위치로 가면
                    System.out.println("game over");
                    return; // 끝남 (1판 가정)
                }
                // 아무일도 일어나지 않으면 그냥 위치이동
                player[0] = newX;
                player[1] = newY;
            }

            if (move.equalsIgnoreCase("S")) {
                int newX = player[0] + moveX[2];
                int newY = player[1] + moveY[2];
                if (newX == monster[0] && newY == monster[1]) { // 캐릭터가 몬스터 위치로 가면
                    score++; // 점수 획득하고
                    System.out.println("승리!");
                    return; // 끝남 (1판 가정)
                }
                if (newX == spiderMine[0] && newY == spiderMine[1]) { // 캐릭터가 몬스터 위치로 가면
                    System.out.println("game over");
                    return; // 끝남 (1판 가정)
                }
                // 아무일도 일어나지 않으면 그냥 위치이동
                player[0] = newX;
                player[1] = newY;
            }
            if (move.equalsIgnoreCase("D")) {
                int newX = player[0] + moveX[3];
                int newY = player[1] + moveY[3];
                if (newX == monster[0] && newY == monster[1]) { // 캐릭터가 몬스터 위치로 가면
                    score++; // 점수 획득하고
                    System.out.println("승리!");
                    return; // 끝남 (1판 가정)
                }
                if (newX == spiderMine[0] && newY == spiderMine[1]) { // 캐릭터가 몬스터 위치로 가면
                    System.out.println("game over");
                    return; // 끝남 (1판 가정)
                }
                // 아무일도 일어나지 않으면 그냥 위치이동
                player[0] = newX;
                player[1] = newY;
            }
        }

    }
}
