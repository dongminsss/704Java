package naver.tyg564.generic;

public class TemmplateProgramming {
	public static void main(String[] args) {
		//제네릭이 적용된 클래스의 인스턴스 만들기
		Generic<String> generic = new Generic<>("kazuha","itadakimas","dangdang");
		generic.display();
		Generic<Integer> generic2 = new Generic<>(1,2,3,4,4,5);
		generic2.display();
		
	}
}
