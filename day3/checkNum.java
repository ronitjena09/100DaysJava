package day3;

import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
   //
    Scanner sc = new Scanner(System.in);
    int checkNum = sc.nextInt();
    switch (checkNum){
        case 1:
          System.out.println("Hello");
          break;
        case 2:
          System.out.println("Namaste");
          break;
        case 3:
          System.out.println("Bonjour");
          break;
        default:
          System.out.println("Invalid Choice");
      }
  }
}
