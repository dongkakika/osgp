package gambling;
import java.util.Scanner;

class person{
	private int n1, n2, n3;
	public String name;
	public person(String name) {
		this.name = name;
	}
	public boolean game() {
		n1 = (int)((Math.random()*3)+1);
		n2 = (int)((Math.random()*3)+1);
		n3 = (int)((Math.random()*3)+1);
		System.out.print("\t"+n1+" "+n2+" "+n3+" ");
		
		// n1 == n2 == n3
		if(n1 == n2 && n2 == n3)
			return true;
		else
			return false;
	}
}

public class gambling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String temp = sc.next();
		person person1 = new person(temp);
		
		System.out.print("2번째 선수 이름>>");
		temp = sc.next();
		person person2 = new person(temp);
		
		String buffer = sc.nextLine();
		while(true) {
			System.out.print("[" + person1.name+"]:<Enter>");
			buffer = sc.nextLine();
			
			if(person1.game()) {
				System.out.println(person1.name + "님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
			System.out.println("[" + person2.name + "]:<Enter>");
			buffer = sc.nextLine();
			if(person2.game()) {
				System.out.println(person2.name+"님이 이겼습니다!");
				break;
			}
			System.out.println("아쉽군요!");
		}
		sc.close();
	}
}
