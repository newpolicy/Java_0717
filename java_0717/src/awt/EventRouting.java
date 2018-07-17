package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventRouting extends Frame {
	public EventRouting() {
		setBounds(1024, 512, 512, 512);//윈도우의 시작 위치좌표, 윈도우의 크기 설정
		setTitle("EventRouting");//윈도우의 이름 설정
		Button btn1 = new Button("Choo");
		Button btn2 = new Button("Ryu");
		Button btn3 = new Button("exit");
		Label la = new Label("");
		
		Panel center = new Panel();
		center.add(btn1);
		center.add(btn2);
		center.add(btn3);
		add("Center", center);
		add("South", la);
		
		ActionListener actl = new ActionListener() {//이벤트가 발생한 컴포넌트의 문자열을 가지고 분기
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "Choo":
					la.setText("hit by pitch");
				break;
				case "Ryu" : la.setText("Smoking");
				break;
				case "exit" : System.exit(0);
				break;
			}
		}
		};
		
		btn1.addActionListener(actl);
		btn2.addActionListener(actl);
		btn3.addActionListener(actl);
		/*ActionListener actl1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				la.setText("Good bye~");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
				
			}
		};
		btn3.addActionListener(actl1);
		
ActionListener actl2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				la.setText("hit by pitch ball~");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		};
		btn1.addActionListener(actl2);
ActionListener actl3 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				la.setText("Smoking Time");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		};
		btn2.addActionListener(actl3);*/
		
		setVisible(true);
		
	}
	
}
