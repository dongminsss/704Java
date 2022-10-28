package naver.tyg564.fileinformation;

import java.io.File;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		//파일에 대한 정보 확인
		
		try {
			//file 인스턴스 생성
			//windows에서는 디렉토리 구분 기호 \
			//프로그래밍에서는 \가 오고 하나의 문자가 오면 제어문자로 인식
			//\를 입력하고자 할 때는 \\ 이렇게 해야 한다.
			File f = new File("C:\\Users\\user\\Desktop\\앳코더 링크.txt");
			//파일의 존재 여부 확인
			System.out.println(f.exists());
			//마지막 수정 날짜
			System.out.println(f.lastModified());
			System.out.println(new Date(f.lastModified()));
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}
}
