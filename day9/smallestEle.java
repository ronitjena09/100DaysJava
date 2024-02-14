package day9;

import java.util.Scanner;

public class smallestEle {
    public static int smallestElement(int[] arr, int num) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];

            }
        }
        return min;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt(); // Input
        }
        smallestElement(arr, num);

    }
}
