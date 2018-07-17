package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemWindow extends Frame {
	public ItemWindow() {
		setBounds(128, 128, 512, 512);
		setTitle("Event Handling");
		boolean i = true;
		Panel p = new Panel();
		
		Checkbox cnchar = new Checkbox("char"); 
		Checkbox cnint = new Checkbox("int");
		Checkbox cnboolean = new Checkbox("boolen");
		Checkbox cnbyte = new Checkbox("byte");
		Checkbox cnlong = new Checkbox("long");
		Checkbox cnfloat = new Checkbox("float");
		Checkbox cndouble = new Checkbox("double");
		Checkbox cnshort = new Checkbox("short");
		
		p.add(cnchar);
		p.add(cnshort);
		p.add(cnboolean);
		p.add(cnbyte);
		p.add(cnfloat);
		p.add(cndouble);
		p.add(cnlong);
		p.add(cnint);
		add("North", p);
		TextArea ta = new TextArea(10, 100);
		add("Center", ta);
		
		//콤보박스 2개 배치, 콤보박스에 배치할 데이터 만들기
		String [] category = {"Korea", "America", "Me", "China"};
		String [][] content = {{"KakaoTalk", "Line" ,"between"}, 
				               {"messenger","Telegram", "Iphone"},
		                       {"LipTalk"},
		                       {"Tencent"}};
		Choice cbca = new Choice();
		for(String im : category) {
			cbca.add(im);
		}
		
		Choice cbcon = new Choice();
		for(String im : content[0]) {
			cbcon.add(im);
		}
		Button btns = new Button("select");
		Button btne = new Button("exit");
		
		Panel p1 = new Panel();
		p1.add(cbca);
		p1.add(cbcon);
		p1.add(btns);
		p1.add(btne);
		
		add("South", p1);
		
		ItemListener ih = new ItemListener() {//체크박스를 눌렀을 때 호출 될 메소드
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// 이벤트가 발생한 인스턴스를 원래의 자료형으로 바꾸고 싶으면 
                //Checkbox로 변환
                //이벤트 처리 메소드에서 e.getSource()는 이벤트가 발생한 인스턴스의 주소를 리턴 
                Checkbox cb = (Checkbox)(e.getSource());
                String label = cb.getLabel();//체크박스에 입력된 텍스트 가져오기
                boolean b = cb.getState();//체크박스 선택 여부 가져오기
				//ta.append(e.getSource().toString()+"를 클릭함 \n");  
				ta.append(label + " " + b +"로 변경 \n");
			}
		};
		cnboolean.addItemListener(ih);//체크박스를 눌렀을 때 호출될 인스턴스 설정
		cnbyte.addItemListener(ih);
		cnlong.addItemListener(ih);
		cndouble.addItemListener(ih);
		cnint.addItemListener(ih);
		cnchar.addItemListener(ih);
		cnfloat.addItemListener(ih);
		cnshort.addItemListener(ih);
		
		//카테고리 콤보 박스의 선택이 변경 되었을 때 호출될 메소드를 가진 Listener = ItemListener가 처리한다.
		ItemListener ih2 = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				int row = cbca.getSelectedIndex();
				cbcon.removeAll();//cbcontent의 내용을 전부 삭제
				for(String temp : content[row]) {
					cbcon.add(temp);
				}
				
			}
		};
		cbca.addItemListener(ih2);
		
		
		ActionListener acl1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int caNum = cbca.getSelectedIndex();
				int coNum = cbcon.getSelectedIndex();
				String categoryText = category[caNum];
				String conText = content[caNum][coNum];
				ta.append(categoryText + ": " +conText+"\n");
			}
		};
		ActionListener acl2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}			
		};
		btne.addActionListener(acl2);
		btns.addActionListener(acl1);
		setVisible(i);
	}
}
















