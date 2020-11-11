//    미션 3 가계부 구현하기
//    필수 요구사항
//    간단한 가계부를 구현한다.
//    키보드를 통해 데이터 입력을 받고 화면에 내용을 출력한다.
//    사용자 등록: 사용자 이름 및 비밀번호를 입력받는다.
//    데이터 입력: 날짜, 적요, 수입, 지출을 입력받는다.
//    데이터 삭제: 특정 순번의 데이터를 삭제한다.
//    데이터 수정: 특정 순번의 데이터를 수정할 수 있다.
//    화면에 출력: 해당 월의 지출내역을 순번, 적요, 수입, 지출, 잔액으로 화면에 출력한다.

//    미션4 가계부에 검색 기능 추가하기
//    가계부 추가 요구사항
//    자동 저장 기능을 추가한다. 프로그램 종료 후 다시 시작해도 데이터가 보존되도록 구현해 보자.
//    소비 유형을 추가한다. (현금 / 카드)
//    검색 기능을 구현한다. 적요, 날짜, 금액, 수입, 지출, 소비 유형별로 검색을 하고 결과를 표시할 수 있어야 한다.
//    정렬해서 보여주기 기능을 추가한다. 날짜 또는 금액의 오름차순 또는 내림차순으로 정렬해서 화면에 출력할 수 있어야 한다.

package day08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountingBook {
    public static Scanner sc = new Scanner(System.in);
    private static Map<String, String> userList = new HashMap<>();
    private final String fileSavePath = "/Users/shion/Desktop/";
    private final String userDataDirPath = "/Users/shion/Desktop/user_data/";

    public static void main(String[] args) {
        AccountingBook accountingBook = new AccountingBook();
        accountingBook.showMain();
    }

    public void showMain() {
        System.out.println("┌-------------┐");
        System.out.println("|    가계부     |");
        System.out.println("┌---------------------------┐");
        System.out.println("| (1) 사용자 입력 (2) 사용자 등록 |");
        System.out.println("└---------------------------┘");
        System.out.print(" >> ");
        choiceSignInOrSignUp();

    }

    public void choiceSignInOrSignUp() {
        int input = sc.nextInt();
        sc.nextLine(); // 버퍼비우기
        if (input == Membership.SIGN_IN.getIndex()) {

        }
        if (input == Membership.SIGN_UP.getIndex()) {
            signUp();
        }
    }

    // 중복확인 기능 추가하기
    public void signUp() {
        System.out.println("┌---------------------------┐");
        System.out.println("| 사용자와 비밀번호를 입력해주세요. |");
        System.out.println("└---------------------------┘");
        System.out.print(" 사용자 >> ");
        String userName = sc.nextLine();
        System.out.print(" 비밀번호 >> ");
        String userPassword = sc.nextLine();
        System.out.println("[ 사용자(" + userName + ") 등록되었습니다. ]");

        addUserToFile(userName + " " + userPassword);
        showMain();
    }

    public void addUserToFile(String userNameAndPassword) {
        File file = createUserListFile();
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write(userNameAndPassword + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        createUserDataFile(userNameAndPassword.split(" ")[0]);
    }

    public File createUserListFile() {
        String fileName = "user_list.txt";
        File file = null;
        try {
            file = new File(fileSavePath + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public void createUserDataDir() {
        File userDataDir = null;
        try {
            userDataDir = new File(userDataDirPath);
            if (!userDataDir.exists() || !userDataDir.isDirectory()) {
                userDataDir.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createUserDataFile(String userName) {
        createUserDataDir();
        try {
            File userData = new File(userDataDirPath + userName);
            if (!userData.exists() || !userData.isFile()) {
                userData.createNewFile();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
