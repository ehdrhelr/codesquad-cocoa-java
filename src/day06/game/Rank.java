package day06.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rank {

    private static List<Player> winnerList = new ArrayList<>();

    Rank() {

    }

    public static void addRank(Player player) {
        winnerList.add(player);
        Collections.sort(winnerList);
        showRank();
    }

    public static void showRank() {
        System.out.println("-----랭킹-----");
        for (int i = 0; i < winnerList.size(); i++) {
            System.out.println((i + 1) + "등 " + winnerList.get(i).getName());
        }
        System.out.println("-------------");
    }


}
