package Multiply;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0, m=0;
		int check = 0;
		
		while(check != 1) {
			try {
				System.out.print("곱하고자 하는 두 수 입력>>");
				n = scanner.nextInt();
				m = scanner.nextInt();
				check = 1;
			}
			catch(InputMismatchException e){
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				scanner.next();
			}
		}
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();
	}
		
}