package day8;

import java.util.Scanner;

public class numCheck {
    public static void checkNum(int num) {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");

        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of numbers you want to input");
        int range = sc.nextInt();
        for (int i = 0; i < range; i++) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            checkNum(num);
        }
    }

}
