package t15.API.t07_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class T04_LocalDate {
	public static void main(String[] args) {
//	 날짜 : LocalDate 객체		
		LocalDate currendate = LocalDate.now();
		System.out.println("오늘 날짜 : " + currendate);
		System.out.println("오늘 날짜 : " + LocalDate.now());
		
//		날짜 지정 세팅
		currendate = LocalDate.of(2024, 12, 25);
		System.out.println("지정날짜 : " + currendate);
		
//		시스템 시간 : LocalTime
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재시간 : " + currentTime);
		System.out.println("현재시간(뒤에 상세 초는 빼기) : " + currentTime.toString().substring(0, 8));
		
//		날짜 / 시간 : LocalDateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 / 시간 : " + currentDateTime.toString().replace("T", " / "));
		
		String strDateTime[] = LocalDateTime.now().toString().split("T");
		System.out.println("현재 날짜 : " + strDateTime[0]);
//		substring(시작위치, 출력할 위치까지) : substring(0, subDateTime[1].lastIndexOf("."))) 0부터 .위치까지 출력
		System.out.println("현재 시간 : " + strDateTime[1].substring(0, strDateTime[1].lastIndexOf(".")));
		
//		날짜 연산 : plusYears(), minusYears()
		LocalDateTime addYear = currentDateTime.plusYears(1);
		System.out.println("오늘 날짜에 1년을 더하면 ? " + addYear.toString().substring(0,4));
		
		LocalDateTime res = currentDateTime.minusDays(7);
		System.out.println("오늘 날짜 일에서 7일을 빼면 ? " + res.toString().substring(8,10));
	}
}