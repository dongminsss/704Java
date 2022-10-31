package naver.tyg564.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPclient {
	public static void main(String[] args) {
		//자기 컴퓨터에 전송할 분은 127.0.0.1 입니다.
		try (Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),1111);
				Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("보낼 메세지:");
				String message = sc.nextLine();
				PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
				pw.print(message + "\n");
				pw.flush();
				pw.close();
				
				//메세지 받기
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String response = br.readLine();
				System.out.println(response);
				br.close();
				pw.close();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
}
