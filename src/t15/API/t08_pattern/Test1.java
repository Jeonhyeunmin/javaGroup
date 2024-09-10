package t15.API.t08_pattern;

import java.util.regex.Pattern;

/*
	정규식은 Pattern클래스 사용
	1. 정규식을 만들고 메소드와 함께 사용.
*/


public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";				
		String str2 = "1A234";				
		
//		정규식 만들기
		String regEx = "^[\\d]*$";
		
//		1번 방법
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find();
		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
		System.out.println("1 : " + pattern1);
		System.out.println("2 : " + pattern2);
		
//		2번 방법
		Boolean pattern3 = Pattern.matches(regEx, str1);
		Boolean pattern4 = Pattern.matches(regEx, str2);
		System.out.println("3 : " + pattern1);
		System.out.println("4 : " + pattern2);
		
		System.out.println("5 : " + Pattern.matches(regEx, str1));
		System.out.println("6 : " + Pattern.matches(regEx, str2));
		
//		프로그램 적용 시
		if(Pattern.matches(regEx, str1)){
			System.out.println("str1은 숫자가 맞습니다.");
		}
		System.out.println("str1은 숫자가 아닙니다.");
	}
}
