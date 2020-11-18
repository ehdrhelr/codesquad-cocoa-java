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
    final int TOTAL_RIVAL = 1;

    Player player;
    Player opponent;
    Random r;

    int currentGame = 0;
    int gameRound = 0;
    int totalRounds = 0;

    OddEvenGame() {
        r = new Random();
    }

    public static void main(String[] args) {
        OddEvenGame game = new OddEvenGame();
        game.init();
    }

    public void init() {
        totalRounds = 0;
        System.out.println("이름을 입력하세요.");
        System.out.print(" >> ");
        String name = sc.nextLine();
        player = new Player(name, PLAYER_INITIAL_MONEY);
        opponent = new Player("상대방", OPPONENT_MONEY);
        playGame();
    }

    public void playGame() {
        currentGame++;
        System.out.println("------------------- Game " + currentGame + " -------------------");
        while (player.getMoney() > 0 && opponent.getMoney() > 0) {
            gameRound++;
            totalRounds++;
            System.out.printf("----------- %s(%d) vs %s(%d) ----------%n", player.getName(), player.getMoney(), opponent.getName(), opponent.getMoney());
            int opponentResult = getRandomNum();
            int[] playerOddEvenBetting = betMoney();
            matchOddEven(playerOddEvenBetting, opponentResult);
        }
        checkMoneyZero();
        System.out.println("다시하기(1), 종료(2)");
        askRegame();
    }

    public int getRandomNum() {
        //System.out.println("Game " + currentGame + "(Round " + gameRound + ") 상대방이 숫자를 뽑았습니다. (1 - " + RANDOM_LIMIT + ")");

        int randomNum = r.nextInt(RANDOM_LIMIT) + 1;
        //for test
        System.out.println("Game " + currentGame + "(Round " + gameRound + ") 상대방이 숫자를 뽑았습니다. (" + randomNum + ")");
        return getOddOrEven(randomNum);
    }

    public int[] betMoney() {
        System.out.println("베팅해주세요. (ex : \"1(홀) 10\" 또는 \"2(짝) 10\")");
        System.out.print(" >> ");
        int[] playerOddEvenBetting = new int[2];
        while (true) {
            String[] playerBetting = sc.nextLine().split(" ");
            int playerResult = Integer.parseInt(playerBetting[0]);
            int betting = Integer.parseInt(playerBetting[1]);
            playerOddEvenBetting[0] = playerResult;
            playerOddEvenBetting[1] = betting;
            if (!checkBettingOverMax(getBettingLimit(), playerOddEvenBetting[1])) {
                break;
            }
        }
        return playerOddEvenBetting;
    }

    public int getBettingLimit() {
        return Math.min(player.getMoney(), opponent.getMoney());
    }

    public void getNextRound() {
        opponent = new Player("상대방", (int) (player.getMoney() * Math.pow(1.2, currentGame)));
        playGame();
    }

    public void askRegame() {
        int answer = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기
        if (answer == YesOrNo.YES.getValue()) {
            currentGame = 0;
            init();
        }
        if (answer == YesOrNo.NO.getValue()) {
            System.out.println("이름 : " + player.getName() + ", 소지금 : " + player.getMoney() + ", 총 " + totalRounds + " Round 진행");
            System.out.println("게임을 종료합니다.");
        }
    }

    public void checkMoneyZero() {
        gameRound = 0;
        if (player.getMoney() <= 0) {
            loseGame();
        }
        if (opponent.getMoney() <= 0) {
            if (winGame()) {
                return;
            }
            System.out.println("이겼습니다! 다음 게임을 시작합니다.");
            getNextRound();
        }
    }

    public boolean winGame() {
        if (currentGame == TOTAL_RIVAL) {
            System.out.println(TOTAL_RIVAL + "인의 라이벌에게 모두 승리했습니다.");
            System.out.println("이름 : " + player.getName() + ", 소지금 : " + player.getMoney() + ", 총 " + totalRounds + " Round 진행");
            player.setTotalRounds(totalRounds);
            String winnerInfo = player.getName() + " " + player.getMoney() + " " + totalRounds;
            recordRank(player);
            return true;
        }
        return false;
    }

    public void loseGame() {
        System.out.println("더 이상 베팅할 돈이 없습니다. 다시 하시겠습니까?");
        System.out.println("네(1), 아니요(2)");
        askRegame();
    }

    public int getOddOrEven(int randomNum) {
        if (randomNum % 2 == 1) return OddEven.ODD.getValue();
        if (randomNum % 2 == 0) return OddEven.EVEN.getValue();
        return 0;
    }

    public boolean checkBettingOverMax(int maxBetting, int betting) {
        if (maxBetting < betting) {
            System.out.printf("----------- %s(%d) vs %s(%d) ----------%n", player.getName(), player.getMoney(), opponent.getName(), opponent.getMoney());
            System.out.println("(!) 최대 배팅금액(" + maxBetting + ")을 초과했습니다. 다시 배팅해주세요.");
            return true;
        }
        return false;
    }

    public void matchOddEven(int[] playerOddEvenBetting, int opponentResult) {
        if (playerOddEvenBetting[0] == opponentResult) {
            player.setMoney(player.getMoney() + playerOddEvenBetting[1]);
            opponent.setMoney(opponent.getMoney() - playerOddEvenBetting[1]);
            System.out.println("정답!");
        }
        if (playerOddEvenBetting[0] != opponentResult) {
            player.setMoney(player.getMoney() - playerOddEvenBetting[1]);
            opponent.setMoney(opponent.getMoney() + playerOddEvenBetting[1]);
            System.out.println("오답!");
        }
    }

    public void recordRank(Player player) {
        Rank.addRank(player);
    }
}
