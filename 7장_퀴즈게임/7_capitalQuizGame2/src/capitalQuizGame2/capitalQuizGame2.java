package capitalQuizGame2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

public class capitalQuizGame2 {
	private HashMap<String, String> map = new HashMap<String, String>();
	private Scanner sc = new Scanner(System.in);
	
	public capitalQuizGame2() {
		// default 10개를 입력 및 초기화 
		map.put("한국", "서울");
		map.put("중국", "베이징");
		map.put("미국", "워싱턴");
		map.put("일본", "도쿄");
		map.put("캐나다", "오타와");
		map.put("독일", "베를린");
		map.put("스위스", "베른");
		map.put("영국", "런던");
		map.put("인도", "뉴델리");
		map.put("스페인", "마드리드");
	}
	
	public void gameStart() {
		System.out.println("***** 수도 맞추기 게임을 시작 *****");
		while(true) {
			System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: quiz(); break;
			case 3: System.out.println("게임 종료"); return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
	}
	private void input() {
		int size = map.size();
		System.out.println("현재 " + size + "개 나라와 수도가 입력되어 있습니다.");
		size++;
		while(true) {
			System.out.print("나라와 수도 입력" + size + ">> ");
			String countryName = sc.next();
			if(countryName.equals("그만")) {
				break;
			}
			String countryCapital = sc.next();
			if(map.containsKey(countryName)) {
				System.out.println(countryName + "은(는) 이미 있습니다.");
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
			
			System.out.print(q + "의 수도는?");
			
			String answerFromUser = sc.next();
			if(answerFromUser.equals("그만")) break;
			if(answerFromUser.equals(a)) System.out.println("정답!");
			else
				System.out.println("아닙니다!");
		}
	}
	
	public static void main(String[] args) {
		capitalQuizGame2 game = new capitalQuizGame2();
		game.gameStart();
	}
}
