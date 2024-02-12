package day7;

import java.util.Scanner;

public class calcFactorial {
    public static void calculateFactorial(int num1){
        int product =1;
        if(num1 ==0)
        {
          System.out.println("Factorial = 1");
          return;
        }
        else if(num1 < 0){
            System.out.println("Invalid Number.");
          return ;
        }
        for(int i = num1;i>=1;i--){
          product= product *i;
        }
        System.out.println("Factorial = "+product);
        return;
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        calculateFactorial(num1);
      }
}
