package day7;

import java.util.Scanner;

public class returnProduct {
     public static int calculateProduct(int num1, int num2){
    int product = num1 * num2;
    return product;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int product = calculateProduct(num1, num2);
    System.out.println("Product = "+product);
  }
}
