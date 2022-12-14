package naver.multithread;

import java.util.concurrent.Semaphore;

public class MainSemaphore {
	
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(3 );
		Thread th1 = new Thread(new SemaphoreThread("카리나" , semaphore));
		Thread th2 = new Thread(new SemaphoreThread("지젤", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("윈터", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("닝닝", semaphore));
		Thread th5 = new Thread(new SemaphoreThread("아이유", semaphore));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
