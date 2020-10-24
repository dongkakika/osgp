package fineFileWord;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;

public class findFileWord {
	private File f = null;
	Vector<String> lineV = new Vector<String>();
	
	public findFileWord() {}
	
	private void fileRead(String fName) {
		
		f = new File(fName);
		//입력 인코딩 문제인 줄 알았으나 이클립스 자체 문제 
		//FileInputStream fin = new FileInputStream(fName);
		//InputStreamReader isr = new InputStreamReader(f, "MS949");
		//BufferedReader br = new BufferedReader(isr);
		
		try {
			// 파일 스캐너 
			Scanner fs = new Scanner(new FileReader(f));
			// 파일을 한줄씩 읽기 
			while(fs.hasNext()) {
				// 라인 한 줄 읽고,
				String line = fs.nextLine();
				// 한 라인을 벡터에 저장
				lineV.add(line);  
			}
			fs.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	 // word가 포함된 라인 번호들을 '벡터'로 리턴 
	private Vector<Integer> findWord(String word){
		Vector<Integer> noVector = new Vector<Integer>();
		for(int i=0; i<lineV.size(); i++) {
			// lineV Vector에서 인덱스의 해당 값 반환  
			String line = lineV.get(i);
			if(line.indexOf(word) != -1)
				noVector.add(i);
		}
		return noVector;
	}
	
	private void printLines(Vector<Integer> noVector) {
		for (int i=0; i<noVector.size(); i++) {
			int lineNo = noVector.get(i);
			String line = lineV.get(lineNo);
			//String printStr = lineNo + ":" + line;
			//byte ms949_printStr[] = printStr.getBytes("ms949");
			System.out.println(lineNo + ":" + line);
		}
	}
	
	public void run() {
		System.out.print("대상 파일명 입력>> ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		
		//  파일을 라인 단위로 벡터로 읽음
		fileRead(fileName);
		
		while(true) {
			System.out.print("검색할 단어나 문장>> ");
			String line = sc.nextLine();
			if(line.equals("그만"))
				break;
			// line의 단어를 포함하는 모든 라인 번호 리턴
			Vector<Integer> noVector = findWord(line);
			printLines(noVector);
		}
		sc.close();
		System.out.println("프로그램을 종료");
	}
	public static void main(String[] args) {
		findFileWord ffw = new findFileWord();
		ffw.run();
	}
	
}
