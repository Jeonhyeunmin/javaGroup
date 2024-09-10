package t15.API.t08_pattern;

import java.util.regex.Pattern;


//	글자수 : {시작글자수, 종료슬자수} - (종료글자수는 생략가능)
public class Test3 {
	public static void main(String[] args) {
//	0개 한개 이상 : *	/ 최소 한개 이상 : + / [] 안에는 조건? 선택사항 /  
		String regEx1 = "^[a-zA-Z0-9_]+@[a-zA-Z0-9_-]+.[a-z]+$";
		String regEx2 = "^[a-zA-Z0-9_]{3,}+@[a-zA-Z0-9_-]+.[a-z]+$";
		String regEx3 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]+.[a-z]+$";
		String regEx4 = "^[a-zA-Z0-9_]{3,12}+@[a-zA-Z0-9_-]{1,8}+.[a-z]{2,4}+$";
		String regEx5 = "^\\w{3,}+@[a-zA-Z0-9_-]{1,8}\\.[a-z]{2,4}$";
//		String regEx6 = "\\w{3,}+@[a-zA-Z0-9_-]{1,8}\\.[a-z]{2,4}\\.[a-z]{2,4}";	//	atom@naver.co.kr
		String regEx6 = "\\w{3,}+@[a-zA-Z0-9_-]+(\\.[a-z]+)+$";	//	atom@naver.co.kr
		
		String str00 = "";
		String str01 = "atom@naver.com";
		String str02 = "atom1234@naver.com";
		String str03 = "atom!1234@naver.com";
		String str04 = "atom 1234@naver.com";
		String str05 = "atom1234567890@naver.com";
		String str06 = "atom1234567890@navernaver.com";
		String str07 = "at@navernaver.com";
		String str08 = "atom@navernaver.comcom";
		String str09 = "atom@naver.co.kr";
		
		System.out.println("1:00 = " + Pattern.matches(regEx1, str00));
		System.out.println("1:01 = " + Pattern.matches(regEx1, str01));
		System.out.println("1:02 = " + Pattern.matches(regEx1, str02));
		System.out.println("1:03 = " + Pattern.matches(regEx1, str03));
		System.out.println("1:04 = " + Pattern.matches(regEx1, str04));
		System.out.println();
		
		System.out.println("2:00 = " + Pattern.matches(regEx2, str00));
		System.out.println("2:01 = " + Pattern.matches(regEx2, str01));
		System.out.println("2:02 = " + Pattern.matches(regEx2, str02));
		System.out.println("2:03 = " + Pattern.matches(regEx2, str03));
		System.out.println("2:04 = " + Pattern.matches(regEx2, str04));
		System.out.println();
		
		System.out.println("3:00 = " + Pattern.matches(regEx3, str00));
		System.out.println("3:01 = " + Pattern.matches(regEx3, str01));
		System.out.println("3:02 = " + Pattern.matches(regEx3, str02));
		System.out.println("3:03 = " + Pattern.matches(regEx3, str03));
		System.out.println("3:04 = " + Pattern.matches(regEx3, str04));
		System.out.println("3:05 = " + Pattern.matches(regEx3, str05));
		System.out.println();
		
		System.out.println("4:00 = " + Pattern.matches(regEx4, str00));
		System.out.println("4:01 = " + Pattern.matches(regEx4, str01));
		System.out.println("4:02 = " + Pattern.matches(regEx4, str02));
		System.out.println("4:03 = " + Pattern.matches(regEx4, str03));
		System.out.println("4:04 = " + Pattern.matches(regEx4, str04));
		System.out.println("4:05 = " + Pattern.matches(regEx4, str05));
		System.out.println("4:06 = " + Pattern.matches(regEx4, str06));
		System.out.println();
		
		System.out.println("5:00 = " + Pattern.matches(regEx5, str00));
		System.out.println("5:01 = " + Pattern.matches(regEx5, str01));
		System.out.println("5:02 = " + Pattern.matches(regEx5, str02));
		System.out.println("5:03 = " + Pattern.matches(regEx5, str03));
		System.out.println("5:04 = " + Pattern.matches(regEx5, str04));
		System.out.println("5:05 = " + Pattern.matches(regEx5, str05));
		System.out.println("5:06 = " + Pattern.matches(regEx5, str06));
		System.out.println("5:07 = " + Pattern.matches(regEx5, str07));
		System.out.println("5:08 = " + Pattern.matches(regEx5, str08));
		System.out.println("5:09 = " + Pattern.matches(regEx5, str09));
		System.out.println();
		
		System.out.println("6:07 = " + Pattern.matches(regEx6, str07));
		System.out.println("6:08 = " + Pattern.matches(regEx6, str08));
		System.out.println("6:09 = " + Pattern.matches(regEx6, str09));
	}
}