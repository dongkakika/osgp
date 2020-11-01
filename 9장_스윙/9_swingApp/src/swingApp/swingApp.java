package swingApp;
import javax.swing.*;
import java.awt.*;

// 상단 패널 영역 
class northPanel extends JPanel{
	public northPanel() {
		setBackground(Color.GRAY);
		setLayout(new FlowLayout());
		String btnNames[] = {"Open", "Read", "Close"};
		for(int i=0; i<btnNames.length; i++) add(new JButton(btnNames[i]));
	}
}

// 중간 패널 영역 
class middlePanel extends JPanel{
	public middlePanel() {
		// 배치 관리자 삭제 
		setLayout(null);
		JLabel helloLabel = new JLabel("Hello");
		JLabel javaLabel = new JLabel("Java");
		JLabel loveLabel = new JLabel("Love");
		
		helloLabel.setBounds(100, 10, 50, 20);
		javaLabel.setBounds(30, 180, 50, 20);
		loveLabel.setBounds(200, 130, 50, 10);
		
		add(helloLabel); add(javaLabel); add(loveLabel);
	}
}

public class swingApp extends JFrame {
	swingApp(){
		setTitle("Swing Application");
		setSize(300, 300);
		// 종료 조건 - 이벤트 스레드 단위임에 유의 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		northPanel northPan = new northPanel();
		middlePanel middlePan = new middlePanel();
		
		add(northPan, BorderLayout.NORTH);
		add(middlePan, BorderLayout.CENTER); // center로 작명하는 것이 나은 옵션 
		
		// 화면에 윈도우 출력 
		setVisible(true);
	}
	public static void main(String[] args) {
		new swingApp();
	}
}
