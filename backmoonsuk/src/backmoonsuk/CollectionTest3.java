package backmoonsuk;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	public static void main(String[] args) {
		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성
		
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i = 0; i<100000; i++) {
			a1.add(i);
		}
		
		LinkedList<Integer> a2 = new LinkedList<>();
		for (int i = 0; i<100000; i++) {
			a2.add(i);
		}
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get(인덱스)
		
//		long start = System.currentTimeMillis();
//		for(int i = 0 ; i<100000; i++) {
//			System.out.println(a1.get(i));
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end - start);
		long start2 = System.currentTimeMillis();
		for(int i = 0; i<100000; i++) {
			System.out.println(a2.get(i));
		}
		long end2 = System.currentTimeMillis();
		
		System.out.println(end2 - start2);
		
		
	}
}
