package backmoonsuk;

import java.util.Arrays;

public class CollectionTest1 {
	public static void main(String[] args) {
		String[] arr = {"List", "Set" , "Map"};
		//배열의 데이터를 수정하는 것은 가능
		arr[2] = "HashTable" ;
		System.out.println(Arrays.toString(arr));
		
		//arr배열에 데이터를 추가
		//arr배열보다 한개 더 큰 배열 생성
		String[] brr = new String[arr.length+1];
		//arr의 내용을 복사
		for(int i = 0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		//brr의 마지막에 데이터 추가
		brr[brr.length-1] = "properties";
		System.out.println(Arrays.toString(brr));
		
		
		//연습: set을 삭제하기
		
		
	}
}
