package loop.ex;

public class WhileEx2 {
  
  public static void main(String[] args) {
    
    int num = 2;
    while(num <= 20) {
      if(num % 2 == 0) {
        System.out.println(num);
      }
      num++;
    }
  }
}
