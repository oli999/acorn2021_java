package test.mypac;
/*
 *  새로운 작업단위(스레드) 를 만드는 방법 2
 *  
 *  1. Runnable 인터페이스를 구현한 클래스를 정의한다 
 *  
 *  2. Runnable 인터페이스의 추상메소드 run() 메소드를 오버라이드 한다.
 *  
 *  3. 해당클래스로 생성한 객체의 참조값을 Thread객체를 생성하면서 생성자의 인자로 전달한다.
 *  
 *  4. 생성된 Thread 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다. 
 *     새로운 작업단위에서 할 작업은 run() 메소드 안에 코딩하면 됩니다.
 */
public class DownloadTask implements Runnable{

	@Override
	public void run() {
		System.out.println("다운로드를 시작 합니다...");
		try {
			for(int i=1; i<=100; i++) {
				System.out.println(i+" % ");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("다운로드를 완료 했습니다...");
	}

}




