package condition.ex;

public class ExhangeRateEx {
  
  public static void main(String[] args) {
    
    int dollar = 0;
    int won = dollar * 1300;
    
    if(dollar < 0) {
      System.out.println("잘못된 금액입니다");
    }
    else if(dollar == 0) {
      System.out.println("환전할 금액이 없습니다");
    }
    else {
      System.out.println("환전 금액은 " + won + "원 입니다");
    }
  }
}
