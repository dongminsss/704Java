package naver.tyg564.generic;
//어떤 종류의 데이터든지 생성자에서 개수에 상관없이 받아서 처리하는 제네릭스
public class Generic<T> {
	private T[] data;
	//...은 variable args로 개수로 상관없이 매개변수를 받고사 할 때 사용
	//받은 매개변수들은 배열로 만들어짐.
	public Generic(T...n) {
		this.data = n;
	}
	
	//배열의 데이터를 순차적으로 접근
	public void display() {
		for(T args : data) {
			System.out.println(args);
		}
	}
}
