package day3;

import java.util.Scanner;

public class gradeCheck {
    //To specify grade basis on the marks
    public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    int gradeCheck = sc.nextInt();
    switch(gradeCheck/10){
      case 9:
      case 8:
        System.out.println("Grade A");
        break;
      case 7:
        System.out.println("Grade B");
        break;
      case 6:
        System.out.println("Grade C");
        break;
      case 5:
        System.out.println("Grade D");
        break;
      case 4:
      case 3:
      case 2:
      case 1:
      case 0:
        System.out.println("Grade F");
        break;
      default:
        System.out.println("Wrong Coice");
    }
  }
}
