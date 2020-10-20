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
		// default 10개를 입력 및 초기화 
		map.add(new countryInfo("한국", "서울"));
		map.add(new countryInfo("중국", "베이징"));
		map.add(new countryInfo("미국", "워싱턴"));
		map.add(new countryInfo("일본", "도쿄"));
		map.add(new countryInfo("캐나다", "오타와"));
		map.add(new countryInfo("독일", "베를린"));
		map.add(new countryInfo("스위스", "베른"));
		map.add(new countryInfo("영국", "런던"));
		map.add(new countryInfo("인도", "뉴델리"));
		map.add(new countryInfo("스페인", "리스본"));
	}
	
	// 게임 시작 
	public void gameStart() {
		System.out.println("***** 수도 맞추기 게임 시작 *****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int c = scanner.nextInt();
			switch(c) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: finish(); break;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	// 입력 
	private void input() {
		int size = map.size();
		int size_temp = size;
		int check = -1;
		
		System.out.println("현재 " + size + "개의 나라와 수도가 입력되어 있습니다.");
		
		while(true) {
			System.out.print("나라와 수도 입력(" + size + ")>> ");
			
			String countryName = scanner.next(); // 국가 입력 
			if(countryName.equals("그만")) break;
			
			String countryCapital = scanner.next(); // 수도 입력 
			for(int i=0; i<size_temp; i++) {
				if(map.get(i).getCountryName().equals(countryName)) {
					check = 1;
					break;
				}
			}
			
			if(check == 1) {
				System.out.println(countryName + "는 이미 있습니다.");
				continue;
			}
			
			// 상위 if문 통과시 새로운 국가 추가 
			++size;
			map.add(new countryInfo(countryName, countryCapital));
		}
	}
	
	private void quiz() {
		while(true) {
			// 문제 출제 시작 
			int index = (int)(Math.random()*map.size()); // 랜덤 위치 
			
			countryInfo country = map.get(index);
			String q = country.getCountryName();
			String a = country.getCountryCapital();
			
			// 출제 문제 출력 
			System.out.print(q + "의 수도는? ");
			
			String answerFromUser = scanner.next(); // 사용자 답안 
			if(answerFromUser.equals("그만")) {
				break;
			}
			
			if(answerFromUser.equals(a))
				System.out.println("정답!");
			else
				System.out.println("땡! 오답!");
		}
	}
	
	private void finish() {
		System.out.println("게임 종료");
	}
	
	public static void main(String[] args) {
		capitalQuizGame game = new capitalQuizGame();
		game.gameStart();
	}
}
