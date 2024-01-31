package day2;
import java.util.*;
public class gradeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if( grade >= 90  && grade <=100){
          System.out.println("A Grade");
        }
        else if( grade >= 80  && grade <= 69){
          System.out.println("B Grade");
        }
        else if( grade >= 70  && grade <= 79){
          System.out.println("C Grade");
        }
        else if( grade >= 60  && grade <=69){
          System.out.println("D Grade");
        }
        else {
          System.out.println("F grade");
        }
      }
}
