package naver.tyg564.list;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("3");
		stack.add("2");
		stack.add("5");
		stack.add("1");
		
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
	}
}
