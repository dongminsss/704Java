package com.naver.tyg564.datastructor;

import java.util.Date;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 Stack을 생성
		Stack<PersonVO> stack = new Stack<>();
		//Stack에 데이터 저장 - Push
		stack.push(new PersonVO(1, "카리나", new Date(102,3,11), "01022223333" , "서울특별시"));
		stack.push(new PersonVO(2, "윈터", new Date(101,3,11), "01022224444" , "서울특별시"));
		stack.push(new PersonVO(3, "민지", new Date(101,3,11), "01022225555" , "서울특별시"));
		stack.push(new PersonVO(4, "조이", new Date(104,3,11), "01022226666" , "서울특별시"));
		stack.push(new PersonVO(5, "아이린", new Date(105,3,11), "01022227777" , "서울특별시"));
		stack.push(new PersonVO(6, "웬디", new Date(103,3,11), "01022228888" , "서울특별시"));
		
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//Stack의 갯수가 초과되도록 pop을 실행하면 UnderFlow 오류 발생 - 프로그램에서는 예외 발생
		//System.out.println(stack.pop());
		
		
		
		
		
		
	}
}
