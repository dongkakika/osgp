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
				System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
				n = scanner.nextInt();
				m = scanner.nextInt();
				check = 1;
			}
			catch(InputMismatchException e){
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				scanner.next();
			}
		}
		System.out.print(n+"x"+m+"="+n*m);
		scanner.close();
	}
		
}