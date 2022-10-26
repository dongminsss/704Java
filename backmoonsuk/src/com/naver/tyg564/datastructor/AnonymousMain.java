package com.naver.tyg564.datastructor;

//인터페이스 
interface Starcraft {
	public void attack();
}

//인터페이스를 구현한 클래스 생성
class Protoss implements Starcraft {

	public void attack() {
		System.out.println("질럿의 공격");
		
	}
	
}
public class AnonymousMain {
	public static void main(String[] args) {
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss p = new Protoss();
		p.attack();
		
		//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		Starcraft z = new Starcraft() {

			@Override
			public void attack() {
					System.out.println("저그의 공격");
			}};
			z.attack();
			
			//변수도 만들지 않고 인스턴스만 생성해서 메서드 호출
			new Starcraft() {

				public void attack() {
					System.out.println("테란의 공격");
				}
				
			}.attack();
		
		
	}
}
