package naver.tyg564.fileinformation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class MainOutput {
	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Random r = new Random();
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\" + UUID.randomUUID() + ".txt");
			
			//기록할 메세지 만들기
			String msg = "안녕하세요\n";
			
			//파일에 기록
			fos.write(msg.getBytes());
			
			
			//파일을 닫기
			fos.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		//앞에서 작성한 파일 읽기
		try {
			FileInputStream fis = new FileInputStream("./2022-10-27.txt");
			//읽어서 저장할 바이트 배열 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인
			System.out.println(new String(b));
			
			fis.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} 
		
	}
}
