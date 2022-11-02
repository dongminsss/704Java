package naver.tyg564.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class ArrayListMain {
	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList
		List<String> list = new ArrayList<>();
		list.add("현무");
		list.add("천궁");
		list.add("폴란드");
		System.out.println(list);
		list.set(1, "흑표"); //list 수정
		System.out.println(list);
		System.out.println(list.get(2));
		String str = "sdf sfd sdsf";
		
		//1970년 1월 1일 자정부터 지나온 시간
		long start = System.currentTimeMillis();
		//두번째에 데이터 10000개 추가
		for(int i = 0; i<10000; i++) {
			list.add(2, "k2");
		}
		long end = System.currentTimeMillis();
		//걸린시간 확인
		System.out.println(end - start);
		
		//LinkedList
		List<String> list2 = new LinkedList<>();
		list2.add("파인애플");
		list2.add("사과");
		
		long startlist=System.currentTimeMillis();
		for(int i = 0; i< 10000; i++) {
			list2.add(2, "감");
		}
		long endList = System.currentTimeMillis();
		
		System.out.println(endList - startlist);
		//ArrayList조회작업과 LinkedList조회작업
		long start2 = System.currentTimeMillis();
		for(int i = 0; i<10000; i++) {
			System.out.println(list.get(i));
		}
		long end2 = System.currentTimeMillis();
		System.out.println(end2 - start2);
		
		
		long startlist2=System.currentTimeMillis();
		for(int i = 0; i< 10000; i++) {
			System.out.println(list2.get(i));
		}
		long endList2 = System.currentTimeMillis();
		System.out.println(endList2 - startlist2);
		
	}
}
