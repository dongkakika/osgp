package capitalQuizGame;
import java.util.Scanner;
import java.util.Vector;

class countryInfo{
	// variables
	private String countryName;
	private String countryCapital;
	
	// initialize
	public countryInfo(String countryName, String countryCapital) {
		this.countryName = countryName;
		this.countryCapital = countryCapital;
	}
	
	// get function
	public String getCountryName() {
		return countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
}

public class capitalQuizGame {
	private Vector<countryInfo> map = new Vector<countryInfo>();
	private Scanner scanner = new Scanner(System.in);
	
	public capitalQuizGame(){
		// default 10���� �Է� �� �ʱ�ȭ 
		map.add(new countryInfo("�ѱ�", "����"));
		map.add(new countryInfo("�߱�", "����¡"));
		map.add(new countryInfo("�̱�", "������"));
		map.add(new countryInfo("�Ϻ�", "����"));
		map.add(new countryInfo("ĳ����", "��Ÿ��"));
		map.add(new countryInfo("����", "������"));
		map.add(new countryInfo("������", "����"));
		map.add(new countryInfo("����", "����"));
		map.add(new countryInfo("�ε�", "������"));
		map.add(new countryInfo("������", "������"));
	}
	
	// ���� ���� 
	public void gameStart() {
		System.out.println("***** ���� ���߱� ���� ���� *****");
		while(true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int c = scanner.nextInt();
			switch(c) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	// �Է� 
	private void input() {
		int size = map.size();
		int size_temp = size;
		int check = -1;
		
		System.out.println("���� " + size + "���� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print("����� ���� �Է�(" + size + ")>> ");
			
			String countryName = scanner.next(); // ���� �Է� 
			if(countryName.equals("�׸�")) break;
			
			String countryCapital = scanner.next(); // ���� �Է� 
			for(int i=0; i<size_temp; i++) {
				if(map.get(i).getCountryName().equals(countryName)) {
					check = 1;
					break;
				}
			}
			
			if(check == 1) {
				System.out.println(countryName + "�� �̹� �ֽ��ϴ�.");
				continue;
			}
			
			// ���� if�� ����� ���ο� ���� �߰� 
			++size;
			map.add(new countryInfo(countryName, countryCapital));
		}
	}
	
	private void quiz() {
		while(true) {
			// ���� ���� ���� 
			int index = (int)(Math.random()*map.size()); // ���� ��ġ 
			
			countryInfo country = map.get(index);
			String q = country.getCountryName();
			String a = country.getCountryCapital();
			
			// ���� ���� ��� 
			System.out.print(q + "�� ������? ");
			
			String answerFromUser = scanner.next(); // ����� ��� 
			if(answerFromUser.equals("�׸�")) {
				break;
			}
			
			if(answerFromUser.equals(a))
				System.out.println("����!");
			else
				System.out.println("��! ����!");
		}
	}
	
	private void finish() {
		System.out.println("���� ����");
	}
	
	public static void main(String[] args) {
		capitalQuizGame game = new capitalQuizGame();
		game.gameStart();
	}
}
