package day4;

import java.util.*;

public class sumOfUserInputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("The sum of numbers is: " + sum);
    }

}
