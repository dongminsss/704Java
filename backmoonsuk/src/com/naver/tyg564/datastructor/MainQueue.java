package com.naver.tyg564.datastructor;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

public class MainQueue {
	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬된 순서대로 출력
		
		//정수 저장하는 PriorityQueue를 만들어서 출력
		
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		//데이터 저장
		intQueue.offer(60);
		intQueue.offer(40);		intQueue.offer(100);
		intQueue.offer(90);
		intQueue.offer(700);
		System.out.println(intQueue);
		//데이터 꺼내기 - 정렬되서 나옴
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		
		
		//PersonVO 클래스를 저장하는 우선순위 큐
		//이 상태에서 만들면 PersonVO의 크기 비교를 할 수 없기 때문에 예외 발생
		
//		PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		//personVO 클래스에 Comparable 인터페이스를 implements하고
		//CompareTo라는 메서드를 재정의해서 해결할 수 있고
		
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를
		//구현한 클래스의 인스턴스를 이용해서 생성해도 됨
		
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {

			public int compare(PersonVO o1, PersonVO o2) {

				return o1.getBirthday().compareTo(o2.getBirthday()); // 비교해서 정리하는게 아닌 두 수 비교 후 자리바꿈 형식
			}
			
		});
		persons.offer(new PersonVO(1, "조이", new Date(), "01022223333" , "서울특별시"));
		persons.offer(new PersonVO(2, "아이린", new Date(), "01044443333" , "서울특별시"));
		persons.offer(new PersonVO(3, "카리나", new Date(), "01055553333" , "서울특별시"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
		
	}
}
