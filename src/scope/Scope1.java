package scope;

public class Scope1 {
  
  public static void main(String[] args) {
    
    int m = 10; //m 생존 시작
    if (true) {
      int x = 20; //x 생존 시작
      System.out.println("m = " + m);
      System.out.println("x = " + x);
    } //x 소멸
    System.out.println("m = " + m);
//    System.out.println("x = " + x); //컴파일 오류, x 소멸돼서 사용 불가
  }
}
