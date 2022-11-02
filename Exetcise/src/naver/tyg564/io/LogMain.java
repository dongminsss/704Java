package naver.tyg564.io;

import java.io.BufferedReader;
import java.io.FileReader;

public class LogMain {
	public static void main(String[] args) {
		//파일을 읽어오는 예외처리
		try {
			//바탕화면에 있는 log buffer로 읽어온다
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\log.txt"));
			int sum = 0;//log파일의 트래픽 합계 설정
			while(true) {
				String line = br.readLine();//한줄씩 읽어옴
				if(line == null) break;//마지막까지 읽어올 시 반복문 멈춤
				String[] lineArr = line.split(" ");//트래픽이 마지막에 공백으로 나누어져 있기 때문에 공백으로 나눔
				try {//트래픽이 문자열일시 예외처리
					sum += Integer.parseInt(lineArr[lineArr.length -1]);//문자열 트래픽을 숫자로 변환하고 더함.
				} catch (Exception e) {
					continue;//예외일시 넘어감
				}
			}
			System.out.println("트래픽 합계:" + sum);//트래픽 합계 출력
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//log 파일을 불러와 아이피 검색 중복일시 카운트
		
	}
}
