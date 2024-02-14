package day8;

import java.util.Scanner;

public class votingCheck {
    public static void ageCheck(int age) {
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        ageCheck(age);
    }
}
