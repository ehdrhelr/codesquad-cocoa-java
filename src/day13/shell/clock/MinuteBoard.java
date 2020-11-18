package day13.shell.clock;

public class MinuteBoard {

    private String[] minuteBoardOverTen = {"", "자", "이", "삼", "사", "오", "십"};
    private String[] minuteboardUnderTen =
            {"정", "일", "이", "삼", "사", "오",
                    "오", "육", "칠", "팔", "구", "분"};

    public String[] getMinuteBoardOverTen() {
        return minuteBoardOverTen;
    }

    public String[] getMinuteboardUnderTen() {
        return minuteboardUnderTen;
    }
}
