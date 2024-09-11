package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    String[] productNames = new String[10];
    int[] productPrices = new int[10];
    int productCount = 0;
    
    while (true) {
      System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
      System.out.println("메뉴를 선택하세요: ");
      int menu = scanner.nextInt();

      scanner.nextLine();
      
      switch(menu) {
        case 1:
          if(productCount > 10) {
            System.out.println("더 이상 상품을 등록할 수 없습니다.");
            break;
          }
          System.out.print("상품 이름을 입력하세요 : ");
          productNames[productCount]= scanner.nextLine();
          System.out.print("상품 가격을 입력하세요 : ");
          productPrices[productCount]= scanner.nextInt();
          productCount++;
          break;
        case 2:
          if(productCount == 0) {
            System.out.println("등록된 상품이 없습니다.");
            break;
          }
          for(int i=0; i<productCount; i++) {
            System.out.println(productNames[i] + " : " + productPrices[i] + "원");
          }
          break;
        case 3:
          System.out.println("프로그램을 종료합니다.");
          System.exit(0);
          break;
      }
    }
  }
}