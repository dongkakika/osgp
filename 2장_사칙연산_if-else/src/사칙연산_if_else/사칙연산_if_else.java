package ��Ģ����_if_else;

import java.util.Scanner;

public class ��Ģ����_if_else {
	public static void main(String[] args) {
	   
	      Scanner sc = new Scanner(System.in);
	      
	      double a, c, result;
	      String b; //������
	      System.out.print("����>>");
	      a = sc.nextDouble();
	      b = sc.next();
	      c = sc.nextDouble();
	      
	      // if-else �������� ����
	      if(b.equals("+")) {
	         result = a + c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	      }
	      else if(b.equals("-")) {
	         result = a - c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	      }
	      else if(b.equals("*")) {
	         result = a * c;
	         System.out.print(a+b+c+"�� ��� ����� "+result);
	      }
	      else if(b.equals("/")) {
	         if(c==0) {
	            System.out.print("0���� ���� �� �����ϴ�.");
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"�� ��� ����� "+result);
	         }
	      }
	      sc.close();
	}
}
