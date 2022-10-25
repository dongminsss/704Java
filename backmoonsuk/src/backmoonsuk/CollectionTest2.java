package backmoonsuk;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionTest2 {
	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 생성
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("dd");
		a1.add("ddd");
		
		for(int i = 0; i< 100000; i++) {
			a1.add(1, "dxd");
		}
		System.out.println(a1);//인스턴스는 출력문에 자동으로 toString 해줌. 
		
	}
}
