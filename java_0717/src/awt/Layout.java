package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Layout extends Frame {
	public Layout() {
		setBounds(1280, 624, 640, 640);//위치와 크기
		setTitle("Practic Layout");
		Panel p = new Panel();
		/*p.setLayout(new FlowLayout());//p의 레이아웃을 설정
		
		for(int i =0; i<10; i++) { //컴포넌트 배치
			Button b = new Button("Button" + i);
			
			p.add(b);
			
		}*/
		/*
		p.setLayout(new BorderLayout());
		Button btn_w = new Button("W");
		p.add("West", btn_w);
		Button btn_e = new Button("E");
		p.add("East", btn_e);
		Button btn_n = new Button("N");
		p.add("North", btn_n);
		Button btn_s = new Button("S");
		p.add("South", btn_s);
		Button btn_c = new Button("c");
		p.add("Center", btn_c);
		*/
		
	  /*p.setLayout(new GridLayout(2, 3, 10, 10));
		for(int i =0; i<10; i ++) {
			Button b = new Button("page" + i);
			p.add(b);
		}*/
		p.setLayout(null);
		Label l= new Label("#");
		add(l);
		l.setBounds(124, 12, 124, 124);
		Button b = new Button("Button");
		Thread th = new Thread() {
			public void run() {
				int s = 1;
				int s1 = 1;
				while(true) {
					try {
						
						Thread.sleep(1);
						int x = l.getLocation().x;
						int y = l.getLocation().y;
						if(x <= 0 || x >= 640) {
							s= -1*s;
						}
						else if(y <= 0 || y >= 512){
							s1= -1*s1;
						}
						else {}
						x= x+(s);
						y= y+(s1);
						
						l.setLocation(x, y);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		};
		th.start();
		
		add(p);
		setResizable(false);
		setVisible(true);//화면 출력
	}

}
