package 사칙연산_switch;

import java.util.Scanner;

public class 사칙연산_switch {
	public static void main(String[] args) {
		  
	      Scanner sc = new Scanner(System.in);
	      
	      double a, b, rst;
	      String op;
	      System.out.print("연산>>");
	      a = sc.nextDouble();
	      op = sc.next();
	      b = sc.nextDouble();
	      
	      // switch 구문으로 구현
	      switch(op) {
	      case "+" :
	         rst = a+b;
	         System.out.print(a+op+b+"의 계산 결과는 "+rst);
	         break;
	      case "-":
	         rst = a-b;
	         System.out.print(a+op+b+"의 계산 결과는 "+rst);
	         break;
	      case "*":
	         rst = a*b;
	         System.out.print(a+op+b+"의 계산 결과는 "+rst);
	         break;
	      case "/":
	         if(b==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	            break;
	         }
	         else {
	            rst = a / b;
	            System.out.print(a+op+b+"의 계산 결과는 "+rst);
	            break;
	         }
	      default:
	         System.out.print("잘못 입력하였습니다.");
	      }
	      
	      sc.close();
	   }
}
