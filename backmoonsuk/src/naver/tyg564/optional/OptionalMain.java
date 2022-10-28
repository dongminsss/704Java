package naver.tyg564.optional;

import java.util.ArrayList;

public class OptionalMain {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("1");
		arr.add("7");
		arr.add("4");
		arr.add("3");
		arr.add("9");
		arr.add("54");
		arr.stream().map(e -> Integer.parseInt(e)).sorted().forEach(e -> System.out.println(e));
		
	}
}
