package day4;

import java.util.*;

public class primeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int c = 0;
        if (num == 0 || num == 1) {
            System.out.println("not a prime Number");
        } else if (num == 2) {
            System.out.println("Prime Number");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    c++;
                }
            }
            if (c == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a Prime Number");

            }
        }
    }
}
