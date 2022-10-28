package naver.tyg564.nested;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 1개인 인터페이스
interface Sample{
	//추상 메서드 선언
	public void display();
}
//인터페이스를 구현한 클래스
class SampleImpl implements Sample {
	
	public void display() {
		System.out.println("호롤로로롤");
	}
}

public class AnonymousMain {
	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		//인스턴스를 여러개 만들어야 한다면 효율적
		SampleImpl sample = new SampleImpl();
		sample.display();
		
		//Sample인터페이스를 Anonymous로 구현
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적 - 메모리
		new Sample() {

			@Override
			public void display() {
				System.out.println("클래스를 생성하지 않고 인스턴스 사용");
			}	
		}.display();
		
		//배열의 정렬
		
		String[] arr = {"알리오올리오", "망고빙수", "스테이크", "불고기와퍼" };
		
		//내림차순 정렬
		
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		//배열의 요소를 빠르게 확인 
		System.out.println(Arrays.toString(arr));
		//하나씩 확인
		for(String food : arr) {
			System.out.print(food);
		}
	}
}
