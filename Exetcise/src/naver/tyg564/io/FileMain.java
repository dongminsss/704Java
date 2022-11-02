package naver.tyg564.io;

import java.io.File;
import java.util.Date;

public class FileMain {
	public static void main(String[] args) {
		try {
			
			//파일 인스턴스 생성
			File file = new File("C:\\Users\\user\\Desktop\\새 텍스트 문서.txt");
			//파일의 존재 여부 확인
			System.out.println(file.exists());
			//마지막 수정 날짜
			System.out.println(file.lastModified());
			System.out.println(new Date(file.lastModified()));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
}
