package loop.ex;

public class ForEx2 {
  
  public static void main(String[] args) {
    
    int num = 2;
    for(int i=0; i<20; i++) {
      if(num % 2 == 0) {
        System.out.println(num);
      }
      num++;
    }
  }
}
