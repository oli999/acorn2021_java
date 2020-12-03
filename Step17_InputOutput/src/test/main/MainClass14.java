package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		/* 
		 *  c:/myFolder/memo.txt 파일에 저장된 문자열을 읽어와서
		 *  콘솔창에 출력하는 코드를 작성해 보세요.
		 *  
		 *  hint! ->  new FileReader()
		 *  hint! ->  new BufferedReader() 
		 */
		File f=new File("c:/myFolder/memo.txt");
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			//아래의 두줄의 코드를 무한 루프에서 수행을 하다가
			//readLine() 메소드가 null 을 리턴하면 반복문 탈출
			while(true) {
				String line=br.readLine();
				if(line==null) {
					break;
				}
				System.out.println(line);	
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}












