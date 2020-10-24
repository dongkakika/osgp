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
		//�Է� ���ڵ� ������ �� �˾����� ��Ŭ���� ��ü ���� 
		//FileInputStream fin = new FileInputStream(fName);
		//InputStreamReader isr = new InputStreamReader(f, "MS949");
		//BufferedReader br = new BufferedReader(isr);
		
		try {
			// ���� ��ĳ�� 
			Scanner fs = new Scanner(new FileReader(f));
			// ������ ���پ� �б� 
			while(fs.hasNext()) {
				// ���� �� �� �а�,
				String line = fs.nextLine();
				// �� ������ ���Ϳ� ����
				lineV.add(line);  
			}
			fs.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	 // word�� ���Ե� ���� ��ȣ���� '����'�� ���� 
	private Vector<Integer> findWord(String word){
		Vector<Integer> noVector = new Vector<Integer>();
		for(int i=0; i<lineV.size(); i++) {
			// lineV Vector���� �ε����� �ش� �� ��ȯ  
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
		System.out.print("��� ���ϸ� �Է�>> ");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		
		//  ������ ���� ������ ���ͷ� ����
		fileRead(fileName);
		
		while(true) {
			System.out.print("�˻��� �ܾ ����>> ");
			String line = sc.nextLine();
			if(line.equals("�׸�"))
				break;
			// line�� �ܾ �����ϴ� ��� ���� ��ȣ ����
			Vector<Integer> noVector = findWord(line);
			printLines(noVector);
		}
		sc.close();
		System.out.println("���α׷��� ����");
	}
	public static void main(String[] args) {
		findFileWord ffw = new findFileWord();
		ffw.run();
	}
	
}
