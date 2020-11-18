package day13.shell.clock;

public class Hour {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";

    private String[] hourOnClock;

    public void moveNextLineWhenTargetHourIndex(int i) {
        if (i == 6) System.out.println();
        if (i == 9) System.out.println();
    }

    public void displayHour(int[] time) {
        HourBoard hourBoard = new HourBoard();
        hourOnClock = hourBoard.getHourBoard();
        for (int i = 1; i < hourBoard.getHourBoard().length; i++) {
            if (i == hourOnClock.length - 1) { // '시'에 도착했을 때 자정인지 아닌지 체크해서 불켜준다.
                lightSiOn(i, time);
                continue;
            }
            if (time[0] >= 10 && i == 10) { // 열시일 때 '열'에 불켜준다.
                lightTenOn();
                continue;
            }
            if (i == time[0] && i >= 10) { // 열시 이상일 때 '열' 불켜진 상태로 '한' 또는 '두'에 불켜준다.
                lightTargetHourOverTenOn(i);
                continue;
            }
            if (i <= 10 && i == time[0]) { // 열시 미만일 때 불켜준다.
                lightTargetHourOn(i);
                continue;
            }
            if (time[0] == 0 && i == 10) { // '0'시일 경우 '열'에 불켜준다.
                lightTenOn();
                continue;
            }
            if (time[0] == 0 && i == 12) { // '0'시일 경우 '두'에 불켜준다.
                lightTargetHourOverTenOn(i);
                continue;
            }

            moveNextLineWhenTargetHourIndex(i); // 화면 이쁘게 줄바꿔준다.
            printOtherHours(i); // 현재 시간이외의 문자들을 플레인으로 출력
        }
        System.out.println(ANSI_RESET);
    }

    public void lightTargetHourOn(int i) {
        System.out.print(ANSI_CYAN + hourOnClock[i] + " ");
    }

    public void lightTargetHourOverTenOn(int i) {
        System.out.print(ANSI_CYAN + hourOnClock[i] + " ");
    }

    public void lightTenOn() {
        System.out.print(ANSI_CYAN + hourOnClock[10] + " ");
    }

    public void lightSiOn(int i, int[] time) {
        if (isNoon(time) || isMidnight(time)) { // 자정이거나 정오일 때 '시' 표시 안한다.
            System.out.print(ANSI_RESET + hourOnClock[i] + " ");
            return;
        }
        System.out.print(ANSI_CYAN + hourOnClock[i] + " ");
    }

    public void printOtherHours(int i) {
        System.out.print(ANSI_RESET + hourOnClock[i] + " ");
    }

    public boolean isMidnight(int[] time) {
        return time[0] == 0 && time[1] == 0;
    }

    public boolean isNoon(int[] time) {
        return time[0] == 12 && time[1] == 0;
    }
}
