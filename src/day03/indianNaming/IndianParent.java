package day03.indianNaming;

import java.util.*;

public class IndianParent {

    public static void giveBirth() { // 아이를 낳다.
        Scanner sc = new Scanner(System.in);
        System.out.println("생년월일을 입력해 주세요>");
        String[] birth = sc.nextLine().split(" ");
        IndianBaby baby = new IndianBaby(birth);
        System.out.printf("당신의 이름은 %s입니다.", baby.getName());
    }

    public static void main(String[] args) {
        giveBirth();
    }
}
