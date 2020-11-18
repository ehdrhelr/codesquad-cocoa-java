package day13.shell.clock;

public class Minute {

    String[] minuteOverTen;
    String[] minuteUnderTen;

    public void displayMinuteOverTen(int[] time) {
        MinuteBoard minuteBoard = new MinuteBoard();
        minuteOverTen = minuteBoard.getMinuteBoardOverTen();
        int firstNumber = getFirstNumberOfMinute(time[1]);

        for (int i = 1; i < minuteOverTen.length; i++) {
            if (i == minuteOverTen.length - 1) { // '십'을 출력할 때 10분 이상일 경우 '십'에 불켜준다.
                lightSibOn(i, time[1]);
                continue;
            }
            if (time[1] >= 20 && i == firstNumber) {
                lightFirstNumberOfMinuteOn(firstNumber);
                continue;
            }
            if (i == 1 && time[1] == 0) { // '자'를 출력할 때 0시 0분이면 '자'를 출력한다.
                lightJaOn(time); // 0시 조건을 실행
                continue;
            }
            System.out.print(FontColor.ANSI_RESET.getValue() + minuteOverTen[i] + " ");

        }
        System.out.println();
    }

    public void displayMinuteUnderTen(int[] time) {
        MinuteBoard minuteBoard = new MinuteBoard();
        minuteUnderTen = minuteBoard.getMinuteboardUnderTen();
        int lastNumberOfMinute = getLastNumberOfMinute(time[1]);

        for (int i = 0; i < minuteUnderTen.length; i++) {
            moveNextLineWhenTargetIndex(i);
            if (i == minuteUnderTen.length - 1) { // '분'을 출력할 때
                lightBunOn(i, time); // '0'시 '0'분이면 '자정'출력을 위해 '분'에 불끈다.
                continue;
            }
            if (i == lastNumberOfMinute && i <= 5) {
                lightLastNumberOfMinuteOn(lastNumberOfMinute);
                continue;
            }

            System.out.print(FontColor.ANSI_RESET.getValue() + minuteUnderTen[i] + " ");

            if (i == lastNumberOfMinute) {
                lightLastNumberOfMinuteOn(lastNumberOfMinute);
                i++;
                continue;
            }
        }
    }

    public void moveNextLineWhenTargetIndex(int i) {
        if (i == 6) {
            System.out.println();
        }
    }

    public void lightSibOn(int i, int minute) {
        if (minute >= 10) {
            System.out.print(FontColor.ANSI_CYAN.getValue() + minuteOverTen[i] + " ");
            return;
        }
        // 10 미만일 때는 플레인 '십'을 출력한다.
        System.out.print(FontColor.ANSI_RESET.getValue() + minuteOverTen[i] + " ");
    }

    public int getFirstNumberOfMinute(int minute) { // 20 이상일 때만 실행한다.
        return minute / 10;
    }

    public void lightFirstNumberOfMinuteOn(int firstNumberOfMinute) {
        System.out.print(FontColor.ANSI_CYAN.getValue() + minuteOverTen[firstNumberOfMinute] + " ");
    }

    public void lightJaOn(int[] time) {
        if (time[0] == 0) {
            System.out.print(FontColor.ANSI_CYAN.getValue() + minuteOverTen[1] + " ");
            return;
        }
        // 0분이지만 0시가 아니면 플레인 '자' 출력
        System.out.print(FontColor.ANSI_RESET.getValue() + minuteOverTen[1] + " ");
    }

    public int getLastNumberOfMinute(int minute) {
        return minute % 10;
    }

    public void lightBunOn(int i, int[] time) {
        if (time[1] == 0) { // '0'시 '0분일 때는 '자정'출력을 위해 '분'에 불끈다.
            System.out.print(FontColor.ANSI_RESET.getValue() + minuteUnderTen[i] + " ");
            return;
        }
        System.out.print(FontColor.ANSI_CYAN.getValue() + minuteUnderTen[i] + " ");
    }

    public void lightLastNumberOfMinuteOn(int lastNumberOfMinute) {
        if (lastNumberOfMinute > 5) lastNumberOfMinute++;
        System.out.print(FontColor.ANSI_CYAN.getValue() + minuteUnderTen[lastNumberOfMinute] + " ");
    }
}
