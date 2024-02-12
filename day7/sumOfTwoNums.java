package day7;

import java.util.Scanner;

public class sumOfTwoNums {
     public static int calculateSum(int num1, int num2){
    int sum = num1 + num2;
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int sum = calculateSum(num1, num2);
    System.out.println("Sum = "+sum);
  }
}
