package backmoonsuk;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
	
	public static void main(String[] args) {
		//현재 시간을 갖는 Date 인스턴스 생성
		Date currentTime = new Date();
		//출력
		System.out.println(currentTime);
		
		//원하는 날짜 가지고 생성
		//현재 시간을 갖는 Date 인스턴스 생성 - 1986년 5월 5일 13: 00 :00로 설정
		Date firstMeetingTime = new Date(86,4,5,13,0,0);
		//출력
	    System.out.println(firstMeetingTime);
	    
	    //년도만 추출해서 출력
	    Date yearTime = new Date();
	    System.out.println(yearTime.getYear()+1900);
	    
	    //원하는 포맷으로 출력
	    //1986년 5월 5일 ?요일이라고 출력
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
	    System.out.println(sdf.format(firstMeetingTime));
	    
	    //연습해볼만 과제 - 년월일을 비교해서 년월일 같으면 시간과 분을 그렇지 않으면 년월일을 출력
	    
	    
	    
				
		
	}
}
