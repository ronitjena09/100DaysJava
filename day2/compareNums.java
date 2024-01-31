package day2;
import java.util.*;
public class compareNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // To compare 2 nums
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if ( num1 == num2){
          System.out.println("The numbers are equal");
        }
        else if( num1 > num2) {
            System.out.println(num1 + "is larger than " +num2);
          }
          else {
            System.out.println(num1 + "is smaller than " +num2);
            
          }
        }
      }
