package com.naver.tyg564.datastructor;

import java.io.FileOutputStream;
import java.util.Properties;

public class MainProperties {
	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null이 리턴
		System.out.println(properties.getProperty("name"));
		
		//프로퍼티스에 프로퍼티 저장
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진 축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤 테일", "한국 최초의 자체 3D 엔진 MMORPG");
		
		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git에 연결된 사람은 workspace가 아니고
			//C드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있다.
			properties.store(new FileOutputStream("./myproject.properties"), "텍스트저장");
			properties.storeToXML(new FileOutputStream("./myproject.properties"), "xml로저장");
			
		} catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
}
