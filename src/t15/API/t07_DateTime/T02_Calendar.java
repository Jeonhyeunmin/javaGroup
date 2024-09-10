package t15.API.t07_DateTime;

import java.util.Calendar;

public class T02_Calendar {
	public static void main(String[] args) {
		Calendar cal =  Calendar.getInstance();
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시(12시간제) : " + cal.get(Calendar.HOUR));
		System.out.println("시(24시간제) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("AM / PM : " + cal.get(Calendar.AM_PM));	//	0 : AM / 1 : PM
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오늘은 무슨 요일입니까? " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println();
		
		int amPm = cal .get(Calendar.AM_PM);
		String strAmPm = amPm == 0 ? "오전" : "오후";
		System.out.println("지금은 " + strAmPm + "입니다" );
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		
		switch (week) {
			case 1: strWeek = "일"; break;
			case 2: strWeek = "월"; break;
			case 3: strWeek = "화"; break;
			case 4: strWeek = "수"; break;
			case 5: strWeek = "목"; break;
			case 6: strWeek = "금"; break;
			case 7: strWeek = "토"; break;
		}
		System.out.println("오늘은 " + strWeek + "요일 입니다.");
	}
}