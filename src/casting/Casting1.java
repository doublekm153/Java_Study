package casting;

public class Casting1 {
  
  public static void main(String[] args) {
    
    int intValue = 10;
    long LongValue ;
    double doubleValue;
    
    LongValue = intValue; //int -> long
    System.out.println("LongValue = " + LongValue);
    
    doubleValue = intValue; //int -> double
    System.out.println("doubleValue = " + doubleValue);
    
    doubleValue = 20L; //long -> double
    System.out.println("doubleValue = " + doubleValue);
  }
}
