package t15.API.t07_DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class T01_Date {
	public static void main(String[] args) {
//		Date 객체
		Date now = new Date();
		System.out.println("1. 오늘의 날짜(기본형식) : " + now);
		
		String strNow = now.toString();
		System.out.println("2. 오늘의 날짜(문자형식) : " + strNow);
		
//		날짜형식을 사용자 지정에 따른 변경 : SimpleDateFormat()
//		매개변수형식 : 년도(yy, yyyy), 월(M), 일(d), 시(h, H), 분(m), 초(s), 요일(E)
//		1월1일부터 오늘까지의 수(D)		(월은 대문자 M)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1 = sdf.format(now);
		System.out.println("기본 날짜 시간 포멧 : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 : " + strNow1);
		
//		24시간제
		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("hh:mm:ss : " + strNow1);
		
//		12시간제(AM, PM)
		sdf = new SimpleDateFormat("HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("HH:mm:ss : " + strNow1);
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		strNow1 = sdf.format(now);
		System.out.println("오늘은 E요일 : " + strNow1);
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째날");
		strNow1 = sdf.format(now);
		System.out.println("오늘은 올해의 D번째날 : " + strNow1);
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째날");
		strNow1 = sdf.format(now);
		System.out.println("오늘은 이번달의 d번째날 : " + strNow1);
		
		sdf = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("E, d MMM yyyy HH:mm:ss\" : " + strNow1);
		
		sdf = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss", Locale.ENGLISH);
		strNow1 = sdf.format(now);
		System.out.println("E, d MMM yyyy HH:mm:ss\", Locale.ENGLISH : " + strNow1);
		
		
	}
}