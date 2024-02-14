package day8;

import java.util.Scanner;

public class gcdCalc {
    public static void calcGCD(int num1, int num2) {
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println("GCD is " + num2);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        calcGCD(num, exp);
    }
}
