package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginPhone extends Frame {
	
	public LoginPhone() {//생성자 - 인스턴스를 만들 때 호출하는 메소드
		//크기와 위치 및 타이틀 설정
		setSize(512, 512);
		setLocation(256, 256);
		setTitle("Login");
		
		Panel p = new Panel();//패널을 생성
		
		Label l = new Label("ID");
		TextField txt = new TextField(64);
		p.add(l);
		p.add(txt);
		
		Label l1 = new Label("pw");
		TextField txt1 = new TextField(64);
		txt1.setEchoChar('*');
		p.add(l1);
		p.add(txt1);
		
		TextArea  ta = new TextArea(8, 64);
		p.add(ta);
		
		MenuBar mb = new MenuBar(); //메뉴바 만들기
		Menu file = new Menu("file");//메뉴 생성
		MenuItem send = new MenuItem("Send");
		file.add(send);
		MenuItem save = new MenuItem("Save");
		file.add(save);
		mb.add(file);//메뉴를 메뉴바에 부착
		Menu photo = new Menu("photo");
		MenuItem camera = new MenuItem("Camera");
		mb.add(photo);
		photo.add(camera);
		
		setMenuBar(mb); // 메뉴바를 윈도우에 배치
		
		add(p);//패널을 프레임에 부착
		
		setVisible(true);//화면 출력
		
	}

}
