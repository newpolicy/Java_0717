package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends Frame {
	public EventWindow() {
		setBounds(1024, 512, 512, 512);//윈도우의 시작 위치좌표, 윈도우의 크기 설정
		setTitle("Event_window");//윈도우의 이름 설정
		
		Button btn1 = new Button("Good Bye");//버튼 생성
		Panel p = new Panel();//여러개의 컴포넌트들을 묶어 줄 패널 생성
		
		p.add(btn1);//패널에 버튼을 추가
		add(p);//패널을 윈도우에 추가
		
		setVisible(true);//윈도우를 화면에 출력
		//버튼을 누를 때 이벤트 처리는 ActionListner인터페이스가 처리합니다.
		ActionListener Act1 = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {//버튼이 눌러지면 호출되는 메소드
				System.exit(0);
				
			}
		};
		btn1.addActionListener(Act1);//버튼과 리스너 연결 시키기, btn1에 ActionEvent가 발생하면 Actl의 메소드를 호출하도록 설정
	}

}
