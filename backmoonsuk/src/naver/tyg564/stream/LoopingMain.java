package naver.tyg564.stream;

import java.util.ArrayList;

public class LoopingMain {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("불고기 와퍼");
		list.add("삼겹살");
		list.add("망고빙수");
		list.add("아이스황도");
		list.add("비타500");
		list.add("생맥주");
		
		//전체 데이터 출력 - 실행속도는 가장 빠르지만 list의 데이터 개수가 변경되면 
		//수정을 해야 함
		
		System.out.println(list.get(0)); //반복
		
		//반복문 이용
		//list의 데이터 개수를 이용해서 순회를 하면 list의 데이터 개수가 변경되도 수정할 필요 없음
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		//위의 반복문은 size 메서드를 반복할때 마다 여러번 부르게 됨 - 자원낭비
		//그래서 변수에 대입하고 반복문에 한번만 실행될 수 있도록 하는게 나음
		int len = list.size();
		for(int i = 0; i<len; i++) {
			System.out.println(list.get(i));
		}
		
		//모든 데이터를 순회하는 경우라면 빠른 열거를 이용하는 것이 효율적
		for(String arr : list) {
			System.out.println(arr);
		}
		//빠른 열거는 반복자를 외부에 만들어서 사용하는데 Stream API는 내부 반복자를 사용함 
		//훨씬 효율적일 때가 많음 - 데이터가 많을 때 
		list.stream().forEach(arr -> {
			System.out.println(arr);
		});
		
		
		
		
	}
}
