package array;

public class EnhancedFor1 {
  
  public static void main(String[] args) {
    
    int[] numbers = {1,2,3,4,5,6};
    
//    일반 for문
    for(int i=0; i<numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    
//    향상된 for문
    for(int number : numbers) {
      System.out.print(number + " ");
    }
  }
}
