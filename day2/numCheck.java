package day2;
import java.util.*;
public class numCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To check if a number is positive, zero, or negative
        int num = sc.nextInt();
        if ( num == 0){
          System.out.println("The number is zero");
        }
        else {
          if( num > 0) {
            System.out.println("Positive Number");
          }
          else {
            System.out.println("Negative Number");
          }
        }
      }
}
