package loop;

public class For2 {
  
  public static void main(String[] args) {
    
    int sum = 0;
    for(int i=1; i<=3; i++) {
      sum += i;
      System.out.println("i : " + i + ", sum : " + sum);
    }
  }
}