package naver.tyg564.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		try(//인스턴스 단위로 파일에 기록할 수 있는 객체를 생성 - AutoCloseable 
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));) {
			//기록할 인스턴스 생성
			StudentDTO dto1 = new StudentDTO ( 1, "조이" , new Date());
			StudentDTO dto2 = new StudentDTO ( 2, "벨벳" , new Date());
			
			//기록할 인스턴스가 여러개 이므로 하나의 List로 묶어준다.
			ArrayList<StudentDTO> list = new ArrayList<>();
			
			list.add(dto1);
			list.add(dto2);
			
			//기록
			oos.writeObject(list);
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			//인스턴스 단위로 파일에 읽을 수 있는 객체를 생성
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("multiobject.txt"));
			
			//기록할 때 List를 사용했으므로 읽어올 때 List로 읽어와야 함
			ArrayList list = (ArrayList)ois.readObject();
			for(Object obj: list) {
				System.out.println(obj);
			}
			ois.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
