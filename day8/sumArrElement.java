package day8;

import java.util.Scanner;

public class sumArrElement {
  public static void sumArrElements(int[] arr, int num) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println(sum);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      arr[i] = sc.nextInt();
    }
    sumArrElements(arr, num);
  }
}
