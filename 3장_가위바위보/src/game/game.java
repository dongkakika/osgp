package game;
import java.util.Scanner;

public class game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String User = sc.next();
			
			int rd = (int)(Math.random()*10 / 3);
			
			if(User.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}
			else if(str[rd].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(str[rd].equals("����")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
			}
			else if(str[rd].equals("��")) {
				if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
				else if(User.equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(User.equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
				}
			}
		}
	}
}
