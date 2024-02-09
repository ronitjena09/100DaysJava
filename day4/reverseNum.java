package day4;

import java.util.*;

public class reverseNum {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int copy = num;
    int count = 0;
    int replace = 0;
    while(num>0){
      replace = num%10;
      count = count*10 +replace;
      num /= 10;
    }
    System.out.println(count);
}
}