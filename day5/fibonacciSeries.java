package day5;

import java.util.*;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 1, sum, occurence;
        occurence = sc.nextInt();
        System.out.print(num1 + ", " + num2 + ", ");
        for (int i = 0; i < occurence - 2; i++) {
            sum = num1 + num2;
            System.out.print(sum + ", ");
            num1 = num2;
            num2 = sum;
        }
    }
}
