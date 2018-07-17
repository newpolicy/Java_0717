package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		setBounds(256, 256, 512, 512); //(위치x, 위치y, 크기x, 크기y)
		setTitle("Common Box");
		Panel p = new Panel();
		
		
		FileDialog fd = new FileDialog(this);//FileDialog 인스턴스 생성
		
		String filepath = fd.getDirectory() + fd.getFile(); //선택한 디렉토리와 파일이름 가져오기.
		Label l = new Label(filepath);
		add(l);
		fd.setVisible(true); // 화면 출력
		/*
		FileDialog fd = new FileDialog(this, "perspective"); //파일 대화상자 만들기
		fd.setVisible(true);//파일 대화상자 출력
		fd.setDirectory("C:\\java\\1.8 docs\\docs\\api");
		String fp = fd.getDirectory() +  fd.getFile();
		Label l = new Label(fp);
		add(l);
		*/
	
		//setVisible(true);//화면 출력
	}

}
