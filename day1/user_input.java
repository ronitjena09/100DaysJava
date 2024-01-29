package day1;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
    // Variables and datatypes
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine(); //For String User input
    int num = sc.nextInt(); //For Integer User input
    Double digit = sc.nextDouble();
    float number = sc.nextFloat();
    char character = sc.next().charAt(0);
    System.out.println(name);
    System.out.println(num);
    System.out.println(digit);
    System.out.println(number);
    System.out.println(character);
    
  }
}
