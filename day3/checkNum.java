package day3;

import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
   //
    Scanner sc = new Scanner(System.in);
    int checkNum = sc.nextInt();
    if (checkNum == 1) {
      System.out.println("Hello");
    }
    else if(checkNum == 2){
      System.out.println("Namaste");
    }
    else if(checkNum == 3){
      System.out.println("Bonjour");
    }
    else {
      System.out.println("Invalid Choice");
    }
  }
}
