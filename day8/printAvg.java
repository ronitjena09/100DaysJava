package day8;

import java.util.Scanner;

public class printAvg {
    public static void calculateAvg(int num1, int num2, int num3){
    double average = (num1+num2+num3)/3;
    System.out.println(average);
    return;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    calculateAvg(num1, num2, num3);
  }
}
