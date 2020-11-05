package day04;

import java.util.Random;

public class KnuthShuffle {
    private static final int SIZE = 16;
    private static final int[] arr = new int[SIZE];

    KnuthShuffle() {
        for (int i = 0; i < arr.length; i++) { // 배열에 값 담기 1 ~ 16
            arr[i] = i + 1;
        }
        shuffle(arr);
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] : %d%n", i, arr[i]);

        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void shuffle(int[] arr) {
        Random r = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, i, r.nextInt(i));
        }
    }

    public static void main(String[] args) {
        KnuthShuffle ks = new KnuthShuffle();
        ks.print();
    }
}
