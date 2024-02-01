package day3;
import java.util.Scanner;

public class seasonCheck {
    public static void main(String[] args) {
    //
    Scanner sc = new Scanner(System.in);
    String seasonCheck = sc.nextLine();
    switch(seasonCheck){
      case "January":
      case "February":
        System.out.println("Winter Season");
        break;
      case "March":
      case "April":
        System.out.println("Spring");
        break;
      case "May":
      case "June":
      case "July":
        System.out.println("Summer");
        break;
      case "August":
      case "September":
        System.out.println("Rainy Season");
        break;
      case "October":
      case "November":
        System.out.println("Autumn Season");
        break;
      
      case "December":
        System.out.println("Winter Season");
        break;
      default:
        System.out.println("Invalid");
    }
  }
}
