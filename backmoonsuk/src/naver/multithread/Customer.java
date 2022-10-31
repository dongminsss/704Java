package naver.multithread;

public class Customer extends Thread {
	public Product myList;
	
	public Customer(Product myList) {
		this.myList = myList;
	}
	@Override
	public void run() {
		//출고 작업을 26번 수행
		for(char ch = 'A'; ch<='Z'; ch++ ) {
			myList.get();
		}
	}
}
