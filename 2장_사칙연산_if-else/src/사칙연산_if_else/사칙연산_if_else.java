package 사칙연산_if_else;

import java.util.Scanner;

public class 사칙연산_if_else {
	public static void main(String[] args) {
	   
	      Scanner sc = new Scanner(System.in);
	      
	      double a, c, result;
	      String b; //연산자
	      System.out.print("연산>>");
	      a = sc.nextDouble();
	      b = sc.next();
	      c = sc.nextDouble();
	      
	      // if-else 구문으로 구현
	      if(b.equals("+")) {
	         result = a + c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("-")) {
	         result = a - c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("*")) {
	         result = a * c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("/")) {
	         if(c==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"의 계산 결과는 "+result);
	         }
	      }
	      sc.close();
	}
}
