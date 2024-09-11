package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.print("5개의 정수를 입력하세요: ");
    
    for(int i=0; i<numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }
    
    for (int number : numbers) {
      if (number == numbers.length) {
        System.out.print(number);
        break;
      }
      System.out.print(number + ", ");
    }
  }
}
