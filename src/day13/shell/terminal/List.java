/**
 * 현재 디렉토리를 읽어서 입출력 연결을 한다.
 * 현재 디렉토리는 /Users/shion 으로 하자.
 * 현재 디렉토리 내에 있는 파일을 읽는다.
 * 이름을 출력한다.
 */

package day13.shell.terminal;

import java.io.File;

public class List implements Runnable {
    public void run() {
        File file = new File(Directory.getCurrentDirectory());
        String[] listOfFiles = file.list();
        int unhiddenIndex = 0;
        for (int i = 0; i < listOfFiles.length; i++) {
            if (new File(listOfFiles[i]).isHidden()) continue;
            unhiddenIndex++;
            if (unhiddenIndex % 3 == 0) System.out.println();
            System.out.printf("%-30s", listOfFiles[i]);
        }
        System.out.println();
    }
}
