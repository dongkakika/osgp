package ��Ģ����_switch;

import java.util.Scanner;

public class ��Ģ����_switch {
	public static void main(String[] args) {
		  
	      Scanner sc = new Scanner(System.in);
	      
	      double a, b, rst;
	      String op;
	      System.out.print("����>>");
	      a = sc.nextDouble();
	      op = sc.next();
	      b = sc.nextDouble();
	      
	      // switch �������� ����
	      switch(op) {
	      case "+" :
	         rst = a+b;
	         System.out.print(a+op+b+"�� ��� ����� "+rst);
	         break;
	      case "-":
	         rst = a-b;
	         System.out.print(a+op+b+"�� ��� ����� "+rst);
	         break;
	      case "*":
	         rst = a*b;
	         System.out.print(a+op+b+"�� ��� ����� "+rst);
	         break;
	      case "/":
	         if(b==0) {
	            System.out.print("0���� ���� �� �����ϴ�.");
	            break;
	         }
	         else {
	            rst = a / b;
	            System.out.print(a+op+b+"�� ��� ����� "+rst);
	            break;
	         }
	      default:
	         System.out.print("�߸� �Է��Ͽ����ϴ�.");
	      }
	      
	      sc.close();
	   }
}
