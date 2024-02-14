package day8;

import java.util.Scanner;

public class arrSearch {
    public static void searchNum(int[] arr, int num) {
        for (int i = 0; i < num; i++) {
            if (arr[i] == num) {
                System.out.println(arr[i] + " found at " + i + " position.");
            }
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        searchNum(arr, x);
    }
}
