package day9;

import java.util.Scanner;

public class largestEle {
    public static int largestElement(int[] arr, int num) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];

            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt(); // Input
        }
        largestElement(arr, num);

    }
}
