package day8;

import java.util.Scanner;

public class Exponentcheck {
    public static void calcExp(int num, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * num;
        }
        System.out.println(result);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int exp = sc.nextInt();
        calcExp(num, exp);
    }
}
