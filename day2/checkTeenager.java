package day2;
import java.util.*;
public class checkTeenager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if( age <= 20){
          System.out.println("You are a teenager");
          
        }
        else {
          System.out.println("You are not a teenager");
          
        }
        // efficient way
       
          // Scanner sc = new Scanner(System.in);
          // int num = sc.nextInt();
          // String evenOrOdd = num % 2 == 0 ? "even" : "odd";
          // System.out.println(evenOrOdd);
        
}
}
