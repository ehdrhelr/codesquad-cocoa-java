package day03.indianNaming;

import java.util.*;

public class IndianNaming {

    private String name = "";

    public IndianNaming(String[] birth) {
        setName(birth);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String[] birth) {
        int  birthYear = Integer.valueOf(birth[0]);
        int birthMonth = Integer.valueOf(birth[1]);
        int   birthDay = Integer.valueOf(birth[2]);

        String  firstName = "";
        String middleName = "";
        String   lastName = "";

        switch (birthYear % 10) {
            case 0 : firstName = "시끄러운"; break;
            case 1 : firstName = "푸른"; break;
            case 2 : firstName = "적색"; break;
            case 3 : firstName = "조용한"; break;
            case 4 : firstName = "웅크린"; break;
            case 5 : firstName = "백색"; break;
            case 6 : firstName = "지혜로운"; break;
            case 7 : firstName = "용감한"; break;
            case 8 : firstName = "날카로운"; break;
            case 9 : firstName = "욕심 많은"; break;
        }
        switch (birthMonth) {
            case  1 : middleName = "늑대"; break;
            case  2 : middleName = "태양"; break;
            case  3 : middleName = "양"; break;
            case  4 : middleName = "매"; break;
            case  5 : middleName = "황소"; break;
            case  6 : middleName = "불꽃"; break;
            case  7 : middleName = "나무"; break;
            case  8 : middleName = "달빛"; break;
            case  9 : middleName = "말"; break;
            case 10 : middleName = "돼지"; break;
            case 11 : middleName = "하늘"; break;
            case 12 : middleName = "바람"; break;
        }
        switch (birthDay) {
            case  1 : lastName = "와(과) 함께 춤을"; break;
            case  2 : lastName = "의 기상"; break;
            case  3 : lastName = "은(는) 그림자 속에"; break;
            case  4 :
            case  5 :
            case  6 : lastName = ""; break;
            case  7 : lastName = "의 환생"; break;
            case  8 : lastName = "의 죽음"; break;
            case  9 : lastName = " 아래에서"; break;
            case 10 : lastName = "을(를) 보"; break;
            case 11 : lastName = "~이(가) 노래하다."; break;
            case 12 : lastName = "의 그림자"; break;
            case 13 : lastName = "의 일격"; break;
            case 14 : lastName = "에게 쫓기는 남자"; break;
            case 15 : lastName = "의 행진"; break;
            case 16 : lastName = "의 왕"; break;
            case 17 : lastName = "의 유령"; break;
            case 18 : lastName = "을 죽인자"; break;
            case 19 : lastName = "은(는) 맨날 잠잔다."; break;
            case 20 : lastName = "처럼"; break;
            case 21 : lastName = "의 고향"; break;
            case 22 : lastName = "의 전사"; break;
            case 23 : lastName = "은(는) 나의 친구"; break;
            case 24 : lastName = "의 노래"; break;
            case 25 : lastName = "의 정령"; break;
            case 26 : lastName = "의 파수꾼"; break;
            case 27 : lastName = "의 악마"; break;
            case 28 : lastName = "와(과) 같은 사나이"; break;
            case 29 : lastName = "을(를) 쓰러트린 자"; break;
            case 30 : lastName = "의 혼"; break;
            case 31 : lastName = "은(는) 말이 없다."; break;
        }
        this.name = firstName+ " " + middleName + lastName;
    }
}
