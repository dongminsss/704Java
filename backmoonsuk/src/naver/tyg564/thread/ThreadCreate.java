package naver.tyg564.thread;
//Thread 클래스로부터 상속받는 클래스를 생성

//Runnable 인터페이스를 구현한 클래스


class ThreadEx extends Thread {
	//public void run 이라는 오버라이딩

	@Override
	//위의 어노테이션은 상위 클래스에서 제공하는 메서드가 아닌 경우 에러를 발생시켜 주는 어노테이션입니다.

	public void run() {
		//스레드로 수행할 내용
		//1초마다 Thread 클래스라는 문장을 10번 출력
		for (int i = 0; i< 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread 클래스");

			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}

		}
	}
}

class RunnableImpl implements Runnable {


	public void run() {
		//스레드로 수행할 내용
		//1초마다 Runnable 인터페이스라는 문장을 10번 출력
		for (int i = 0; i< 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread 클래스");

			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}


public class ThreadCreate {
	public static void main(String[] args) {
		//Thread 클래스로부터 상속받은 클래스를 이용해서 스레드를 생성하고 실행
		Thread th1 = new ThreadEx();
		//start를 호출하면 run 메서드의 내용을 수행
		th1.start();


		//Runnable 인터페이스를 implements 클래스를 이용해서 스레드를 생성하고 실행
		Thread th2 = new Thread(new RunnableImpl());
		th2.start();

		//Anonymous 클래스를 이용해서 사용
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i< 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous");

					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
			}

		});
		th3.start();
		//람다를 이용해서 표현 가능 - 메서드가 1개이기 때문
		Thread th4 = new Thread(()-> {
			for (int i = 0; i< 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("lamda");

				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		th4.start();
	}
}
