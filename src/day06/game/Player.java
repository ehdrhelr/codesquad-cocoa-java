package day06.game;

public class Player implements Comparable<Player> {
    private String name = "";
    private int money = 0;
    private int totalRounds = 0;

    public Player(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    public void setTotalRounds(int totalRounds) {
        this.totalRounds = totalRounds;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", totalRounds=" + totalRounds +
                '}';
    }

    @Override
    public int compareTo(Player player) {
        if (player.getTotalRounds() < this.getTotalRounds()) return 1;
        return -1;
    }
}
