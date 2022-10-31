package naver.tyg564.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
	
	public static void main(String[] args) {
		//try -resource 구문으로 메모리 해제를 하지 않아도 됨
		try(ServerSocket ss = new ServerSocket(1111)) {
			System.out.println("서버 대기 중");
			
			//클라이언트 요청 대기
			try {
				Socket socket = null;
				while(true) {
					//클라이언트 요청 대기하다가 클라이언트 요청 오면 접속됨
					
					socket = ss.accept();
					//접속자 정보 출력
					System.out.println("접속자 정보" + socket.toString());
					//접속자와 문자열을 읽을 수 있는 스트림 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					
					//한 줄의 메세지 읽기
					String message = br.readLine();
					System.out.println(message);
					
					//메세지를 보낼 수 있는 스트림을 생성
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					pw.flush();
					//정리작업
					pw.close();
					br.close();
					socket.close();
				}
			} catch (Exception e) {

			} finally {}
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
