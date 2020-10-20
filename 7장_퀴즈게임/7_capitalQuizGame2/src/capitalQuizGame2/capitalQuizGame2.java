package capitalQuizGame2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class capitalQuizGame2 {
	private HashMap<String, String> map = new HashMap<String, String>();
	private Scanner sc = new Scanner(System.in);
	
	public capitalQuizGame2() {
		// default 10���� �Է� �� �ʱ�ȭ 
		map.put("�ѱ�", "����");
		map.put("�߱�", "����¡");
		map.put("�̱�", "������");
		map.put("�Ϻ�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "������");
		map.put("������", "����");
		map.put("����", "����");
		map.put("�ε�", "������");
		map.put("������", "���帮��");
	}
	
	public void gameStart() {
		System.out.println("***** ���� ���߱� ������ ���� *****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: System.out.println("���� ����"); return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	private void input() {
		int size = map.size();
		System.out.println("���� " + size + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		size++;
		while(true) {
			System.out.print("����� ���� �Է�" + size + ">> ");
			String countryName = sc.next();
			if(countryName.equals("�׸�")) {
				break;
			}
			String countryCapital = sc.next();
			if(map.containsKey(countryName)) {
				System.out.println(countryName + "��(��) �̹� �ֽ��ϴ�.");
				continue;
			}
			map.put(countryName, countryCapital);
			size++;
		}
	}
	
	private void quiz() {
		Set<String> keys = map.keySet();
		Object [] array = (keys.toArray());
		while(true) {
			int index = (int)(Math.random()*array.length);
			
			String q = (String)array[index];
			String a = map.get(q);
			
			System.out.print(q + "�� ������?");
			
			String answerFromUser = sc.next();
			if(answerFromUser.equals("�׸�")) break;
			if(answerFromUser.equals(a)) System.out.println("����!");
			else
				System.out.println("�ƴմϴ�!");
		}
	}
	
	public static void main(String[] args) {
		capitalQuizGame2 game = new capitalQuizGame2();
		game.gameStart();
	}
}
