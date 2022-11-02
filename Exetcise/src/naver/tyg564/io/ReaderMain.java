package naver.tyg564.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReaderMain {
	public static void main(String[] args) {
		//파일에 문자단위로 기록하고 읽어오기
		try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 인스턴스 사용
			//한번 기록하고 두번째 기록할 때 이어서 기록하는 인스턴스
			//true를 생략하고 false를 설정하면 파일의 내용을 항상 새록 작성
			PrintWriter pw = new PrintWriter(new FileWriter("2022-11-02.txt",true));
			
			//문자열을 기록
			//문자열을 기록할 때 ,나 공백 및 탭 등으로 구분 가능
			//이렇게 만들어진 텍스트를 csv라고 함
			//이 방식은 변하지 않는 고정적인 데이터를 기록할 때 주로 사용
			pw.print("조이,걸그룹");
			pw.print("웬디,걸그룹");
			pw.print("아이린,걸그룹");
			
			//버퍼의 내용 전부 출력
			pw.flush();
			
			pw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		//파일의 문자열을 문자 단위로 읽어오기: FileReader와 BufferedReader 이용
		
		//문자 데이터를 줄 단위로 읽을 수 있는 인스턴스 생성
		try {
			BufferedReader br = new BufferedReader(new FileReader("./2022-11-02.txt"));
			//줄 단위로 읽어서 출력하기
			while(true) {
				//한 줄 읽기
				String line = br.readLine();
				//읽을 데이터가 없으면 종료
				if(line == null) break;
				//읽은 데이터 출력
				System.out.println(line);
				
				//읽은 문자열에서 , 기준으로 앞의 데이터만 출력
				String[] arr = line.split(",");
				System.out.println(arr[0]);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
