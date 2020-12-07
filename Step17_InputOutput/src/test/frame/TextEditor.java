package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEditor extends JFrame implements ActionListener{
	//필요한 static final 상수 정의하기 
	public static final String COMMAND_NEW="new";
	public static final String COMMAND_OPEN="open";
	public static final String COMMAND_SAVE="save";
	JTextArea area;
	
	//생성자
	public TextEditor(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		//메뉴1
		JMenu menu1=new JMenu("File");
		//메뉴2
		JMenu menu2=new JMenu("Help");
		
		//메뉴바
		JMenuBar mb=new JMenuBar();
		//메뉴바에 메뉴 추가
		mb.add(menu1);
		mb.add(menu2);
		//프레임에 메뉴바 추가
		this.setJMenuBar(mb);
		
		//메뉴 아이템1
		JMenuItem item1=new JMenuItem("New");
		//메뉴 아이템2
		JMenuItem item2=new JMenuItem("Open");
		//메뉴 아이템3
		JMenuItem item3=new JMenuItem("Save");
		
		//메뉴 아이템을 메뉴에 추가하기 
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		
		//아이템에 액션 리스너 등록
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		
		//아이템에 액션 command 지정
		item1.setActionCommand(TextEditor.COMMAND_NEW);
		item2.setActionCommand(TextEditor.COMMAND_OPEN);
		//동일한 클래스에 있는 static 필드를 참조할때는 클래스명 생략 가능
		item3.setActionCommand(COMMAND_SAVE);
		
		//JTextArea
		area=new JTextArea();
		add(area, BorderLayout.CENTER);
		area.setBackground(Color.PINK);
		//일단 안보이게 해놓는다
		area.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션 command 를 읽어온다. 
		String command=e.getActionCommand();
		if(command.equals(COMMAND_NEW)) {
			area.setVisible(true);
			area.grabFocus();//포커스 주기
		}else if(command.equals(COMMAND_OPEN)) {
			area.setVisible(true);
			JFileChooser fc=new JFileChooser("c:/myFolder");
			//파일 확장자가 .txt 인 파일만 선택할수 있도록 필터 설정 
			FileNameExtensionFilter filter=
					new FileNameExtensionFilter("텍스트 파일", "txt");
			fc.setFileFilter(filter);
			int result=fc.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				File selectedFile=fc.getSelectedFile();
				loadFromFile(selectedFile);
			}
		}else if(command.equals(COMMAND_SAVE)) {
			JFileChooser fc=new JFileChooser("c:/myFolder");
			//파일 확장자가 .txt 인 파일만 선택할수 있도록 필터 설정 
			FileNameExtensionFilter filter=
					new FileNameExtensionFilter("텍스트 파일", "txt");
			fc.setFileFilter(filter);
			int result=fc.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION) {
				File selectedFile=fc.getSelectedFile();
				saveToFile(selectedFile);
			}
		}
	}
	//선택된 파일에 저장된 문자열에 있는 내용을 TextArea 에 출력하는 메소드
	public void loadFromFile(File f) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				//읽어들인 문자열을 TextArea 에 누적 시키기
				area.append(line+"\r\n");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}
	
	//TextArea 에 작성된 문자열을 파일에 저장하는 메소드
	public void saveToFile(File f) {
		//1. TextArea 에 작성된 문자열을 읽어와서
		String content=area.getText();
		//2. 저장하기로 선택된 File 객체의 참조값을 얻어와서 텍스트를 저장하다.
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			fw.write(content);
			JOptionPane.showMessageDialog(this, "파일에 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "파일에 저장 실패!");
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TextEditor te=new TextEditor("텍스트 편집기");
		te.setBounds(100, 100, 500, 500);
		te.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		te.setVisible(true);
	}
	
}





