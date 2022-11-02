package naver.tyg564.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Buffer {
	public static void main(String[] args) {
		try {
			//버퍼를 이용해서 출력하는 스트림 만들기
			PrintStream ps = new PrintStream(new FileOutputStream("C:\\Users\\user\\Desktop\\2022-11-02.txt"));
			ps.print("문자열을 버퍼를 이용해서 출력");
			ps.flush();
			ps.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
