package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
  
  public static void main(String[] args) {
    
    int sum = 0;
    int count = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    /*while (true) {
      System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
      int num = scanner.nextInt();
      if(num == -1) {
        break;
      }
      sum += num;
      count++;
    }*/
    int num;
    while ((num = scanner.nextInt()) != -1) {
      sum += num;
      count++;
    }
    double avg = (double) sum / count;
    System.out.println("합계: " + sum);
    System.out.println("평균: " + avg);
  }
}
