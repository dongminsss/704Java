package naver.tyg564.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class StreamMain {
	public static void main(String[] args) {
		//바이트 단위로 파일에 기록
		try {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			String file = UUID.randomUUID().toString();
			
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("C:\\Users\\user\\Desktop\\" + file + ".txt",true);
			//기록할 메세지 생성
			String msg = "파일에 덮어쓰기";
			//파일에 기록
			fos.write(msg.getBytes());
			//파일 닫기
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\2022-11-02.txt");
			//읽어서 저장할 바이트 배열 생성
			byte[] b =new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용 확인 - 문자열로 변환
			System.out.println(new String(b));
			System.out.println(Arrays.toString(b));
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
