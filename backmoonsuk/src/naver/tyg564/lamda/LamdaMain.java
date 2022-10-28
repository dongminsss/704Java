package naver.tyg564.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LamdaMain {
	public static void main(String[] args) {
		//배열의 정렬
		
		String[] arr = {"알리오올리오", "망고빙수", "스테이크", "불고기와퍼" };
		
		//내림차순 정렬
		//Comparator는 메서드가 1개만 존재합니다.
		
		
		Arrays.sort(arr,(o1,o2) ->  o2.compareTo(o1));
		
		System.out.println(Arrays.toString(arr));
		//Comparator 인터페이스는 메서드가 1개 밖에 없으므로 람다로 표현이 가능.
		//람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않음.
		//매개변수의 개수와 리턴 타입만 확인하면 가능.
		//매개변수는 2개이고 리턴 타입은 정수입니다.
		//매개변수가 1개이면 () 생략가능
		//return하는 문장만 존재한다면 {}와 return 생략하는것이 가능
		//메서드의 매개변수로 코드(함수)를 대입한 것 처럼 보이도록 함
		//메서드의 매개변수로 코드(함수)를 대입할 수 있는 방식을 함수형 프로그래밍이라고 함.
		
		Arrays.sort(arr,(o1,o2) -> {return o2.compareTo(o1);});
		
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
