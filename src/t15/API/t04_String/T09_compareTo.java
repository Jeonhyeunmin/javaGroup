package t15.API.t04_String;

import java.util.Objects;

public class T09_compareTo {
	public static void main(String[] args) {
		String a = "Seoul";
		String b = "seoul";
		String c = a+b;
		
		System.out.println("c : " + c);
		
//		compareTo : 문자열비교(0 : 동일한문자열 , 음수 : 앞의 문자열이 작다, 양수 : 앞의 문자열이 크다.)
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		
//		공백비교 : equals(), isBlank() - java10이상, isEmpty()
		System.out.println("1. C가 공백? " + c.equals(""));
//		System.out.println("2. C가 공백? " + c.isBlank(""));	자바 10이상부터 사용 가능
		System.out.println("3. C가 공백? " + c.isEmpty());
		System.out.println("4. c가 null? " + Objects.isNull(c));
	}
}