package day4;

import java.util.*;

public class factorialCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count *= i;
        }
        System.out.println(count);
    }
}
