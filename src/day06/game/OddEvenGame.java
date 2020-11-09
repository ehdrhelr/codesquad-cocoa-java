//연습문제: 홀짝게임 구현하기 (선택)
//        가계부 구현이 어려울 경우 선택한다.
//        간단한 홀짝게임을 구현해 본다.
//        플레이어의 이름을 입력받는데, 초기 자본은 100원
//        상대방 플레이어는 120원을 가지고 시작한다.
//        상대방은 Random 을 이용, 1- 20까지 임의의 수를 뽑는다. 단 화면에 해당 숫자가 출력되지는 않는다.
//        플레이어는 홀 또는 짝을 입력하고 배팅을 한다. 배팅 최대 금액은 min(내 소지금, 상대방 소지금) 으로 결정한다.
//        맞았을 경우 배팅 금액만큼 상대방에게 얻고, 반대의 경우 상대방에게 빼앗긴다.
//        플레이어의 소지금이 0원이 되면 게임 종료
//        상대방의 소지금이 0원이 되면 다음 상대가 등장. 다음 상대는 내 소지금 * pow(1.2, numStage) 의 소지금을 가지고 등장한다.
//        라이벌은 총 8명이 등장한다.
//        게임 오버시 소지금과 진행 턴을 표시해 준다.
//        (옵션) 게임 오버시 이름을 입력받고 랭킹을 출력해 준다. 랭킹은 소지금이 많을 수록, 턴이 작을수록 높아진다.

package day06.game;

import java.util.Random;
import java.util.Scanner;

public class OddEvenGame {

    public static Scanner sc = new Scanner(System.in);
    final int PLAYER_INITIAL_MONEY = 100;
    final int OPPONENT_MONEY = 120;
    final int RANDOM_LIMIT = 20;
    Player player;
    Player opponent;
    Random r;
    int currentGame = 0;
    int gameRound = 0;

    OddEvenGame() {
        r = new Random();
    }

    public static void main(String[] args) {
        OddEvenGame game = new OddEvenGame();
        game.init();
    }

    public void init() {
        System.out.println("이름을 입력하세요.");
        System.out.print(" >> ");
        String name = sc.nextLine();
        player = new Player(name, PLAYER_INITIAL_MONEY);
        opponent = new Player("상대방", OPPONENT_MONEY);
        playGame();
    }

    public void playGame() {
        currentGame++;
        while (player.getMoney() > 0 && opponent.getMoney() > 0) {
            gameRound++;
            System.out.println("Game " + currentGame + "(Round " + gameRound + ") 상대방이 숫자를 뽑았습니다. (1 - " + RANDOM_LIMIT + ")");
            int randomNum = r.nextInt(RANDOM_LIMIT) + 1;
            String opponentResult = isOddEven(randomNum);
            System.out.println("베팅해주세요. (ex : 홀 10)");
            System.out.print(" >> ");
            String[] playerBetting = sc.nextLine().split(" ");
            String oddEven = playerBetting[0];
            int betting = Integer.parseInt(playerBetting[1]);

            if (playerBetting[0].equals(opponentResult)) {
                player.setMoney(player.getMoney() + betting);
                opponent.setMoney(opponent.getMoney() - betting);
                System.out.println("정답!");
            }
            if (!playerBetting[0].equals(opponentResult)) {
                player.setMoney(player.getMoney() - betting);
                opponent.setMoney(opponent.getMoney() + betting);
                System.out.println("오답!");
            }
            System.out.printf("남은 돈 : %s(%d), %s(%d)%n", player.getName(), player.getMoney(), opponent.getName(), opponent.getMoney());

        }
    }

    public String isOddEven(int randomNum) {
        if (randomNum % 2 == 1) return "홀";
        if (randomNum % 2 == 0) return "짝";
        return "";
    }
}
