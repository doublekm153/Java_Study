package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("학생 수를 입력하세요 : ");
    int num = scanner.nextInt();
    int[][] scores = new int[num][3];
    
    for(int i=0; i<scores.length; i++) {
      System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
      System.out.print("국어 점수 : ");
      int kor = scanner.nextInt();
      scores[i][0] = kor;
      System.out.print("영어 점수 : ");
      int eng = scanner.nextInt();
      scores[i][1] = eng;
      System.out.print("수학 점수 : ");
      int math = scanner.nextInt();
      scores[i][2] = math;
    }
    
    int sum = 0;
    double avg = 0;
    
    for(int i=0; i<scores.length; i++) {
      for(int j = 0; j<scores[i].length; j++) {
        sum = sum + scores[i][j];
        avg = (double) sum / scores[i].length;
      }
      System.out.println((i+1) + "번 학생의 총점: " + sum + ", 평균 : " + avg);
      sum = 0;
      avg = 0;
    }
  }
}
