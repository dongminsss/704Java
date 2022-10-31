package naver.tyg564.list;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		String[] arr = {"카리나","조이","윈터"};
		//배열의 데이터를 수정하는 것 가능
		arr[1] = "킨더조이";
		System.out.println(Arrays.toString(arr));
		
		//배열의 데이터를 추가
		//배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String[] brr = new String[arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			brr[i] = arr[i];
		}
		brr[brr.length-1] = "웬디";
		//brr이 가리키는 곳을 arr로 바꿈
		arr = brr;
		System.out.println(Arrays.toString(arr));
		
		//배열의 데이터 제거
		String[] crr = new String[arr.length-1];
		for(int i = 0; i<crr.length; i++) {
			crr[i] = arr[i];
		}
		//crr이 가리키는 곳을 arr로 바꿈
		arr = crr;
		System.out.println(Arrays.toString(arr));
	}
}
