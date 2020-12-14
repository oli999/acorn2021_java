package example5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	
	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		try {
			//5000 번 통신 port 를 열고 클라이언트의 접속을 기다린다.
			serverSocket=new ServerSocket(5000);
			/*
			 *  .accept() 메소드는 클라이언트가 접속을 해야지 리턴하는 메소드이다.
			 *  클라이언트가 접속을 해오면 해당 클라이언트와 연결된 Socket 객체의
			 *  참조값을 리턴한다. 
			 */
			while(true) {
				System.out.println("클라이언트의 Socket 접속을 기다립니다...");
				//1. 클라이언트가 접속을 해오면 
				Socket socket=serverSocket.accept();
				//2. 새로운 스레드를 시작 시킨다. 
				ServerThread t=new ServerThread(socket);
				t.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("ServerMain main 메소드가 종료 됩니다.");
	}
	//스레드 클래스 설계
	static class ServerThread extends Thread{
		//필드 (클라이언트와 연결된 Socket 객체의 참조값을 저장할 필드)
		private Socket socket; 
		
		//생성자
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달받은 Socket 객체의 참조값을 필드에 저장하기 
			this.socket=socket;
		}
		
		@Override
		public void run() {
			try {
				//클라이언트가 전송하는 문자열을 읽어들일 객체 
				BufferedReader br=
					new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
				//클라이언트에게 문자열을 출력할 객체
				BufferedWriter bw=
					new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream()));
				//반복문 돌면서 클라이언트가 전송하는 문자열이 있는지 읽어와 본다.
				while(true) {
					//문자열 한줄이 전송될때 까지 블록킹 되는 메소드 
					String line=br.readLine();
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}





