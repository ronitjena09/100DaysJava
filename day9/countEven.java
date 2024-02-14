package day9;

import java.util.Scanner;

public class countEven {
    public static void evenArray(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                counter++;
        }
        System.out.println(counter);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt(); // Input
        }
        evenArray(arr);

    }
}
