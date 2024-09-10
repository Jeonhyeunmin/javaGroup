package t15.API.t08_pattern;

import java.util.regex.Pattern;

//	영문자와 숫자? ^[\\w]*$,^[a-zA-Z0-9]*$
public class Test2 {
	public static void main(String[] args) {
		String regEx1 = "^[\\w]*$";						//	영문자와 숫자체크
		String regEx2 = "^[a-zA-Z0-9]*$";			//	영문자와 숫자체크
		String regEx3 = "^[a-zA-Z가-힣]*$";		//	영문자와 한글체크
		String resEx4 = "^[\\s]*$";						//	공백체크
		String regEx5 = "^[a-zA-Z가-힣	]*$";		//	영문자와 한글과 공백
		String resEx6 = "^[a-zA-Z가-힣0-9 _-]*$";	//	영문자/한글/공백/숫자/밑줄/하이폰 만이 포함된 글자만을 허용
		
		String str1 = "hello";
		String str2 = "hello1234";
		String str3 = "hello12!!";
		String str4 = "hello  ";
		String str5 = "안녕";
		String str5_2 = "안	녕";
		String str6 = "   ";
		String str7 = "	";
		String str8 = "	".trim();
		String str9 = "";
		String str10 = "한글 abc - _";
		String str11 = "한글 abc - _!";
		
//		regEx1
		if (Pattern.matches(regEx1, str1)) {
			System.out.println("1. 영문자와 숫자로만 구성되어 있다.");
		}
		else {
			System.out.println("1. 영문자와 숫자가 아닌 구성문자가 포함되어 있다.");			
		}
		System.out.println("2. : " + Pattern.matches(regEx1, str2));			
		System.out.println("3. : " + Pattern.matches(regEx1, str3));			
		System.out.println("4. : " + Pattern.matches(regEx1, str4));			
		System.out.println("5. : " + Pattern.matches(regEx1, str5));
		
		System.out.println("==================================================================");
		
		
//		regEx2		
		if (Pattern.matches(regEx2, str1)) {
			System.out.println("2. 영문자와 숫자로만 구성되어 있다.");
		}
		else {
			System.out.println("2. 영문자와 숫자가 아닌 구성문자가 포함되어 있다.");			
		}
		System.out.println("2. : " + Pattern.matches(regEx2, str2));			
		System.out.println("3. : " + Pattern.matches(regEx2, str3));			
		System.out.println("4. : " + Pattern.matches(regEx2, str4));			
		System.out.println("5. : " + Pattern.matches(regEx2, str5));
		
		System.out.println("==================================================================");
		
//		regEx3
		if (Pattern.matches(regEx3, str1)) {
			System.out.println("3. 이름이 영문과 한글로만 구성되어 있다");			
		}
		else {
			System.out.println("3. 이름이 영문과 한글아닌 구성문자가 포함되어 있다");			
		}
		System.out.println("2. : " + Pattern.matches(regEx3, str2));			
		System.out.println("3. : " + Pattern.matches(regEx3, str3));			
		System.out.println("4. : " + Pattern.matches(regEx3, str4));			
		System.out.println("5. : " + Pattern.matches(regEx3, str5));
		System.out.println("5_2. : " + Pattern.matches(regEx3, str5_2));
		System.out.println("5_3. : " + Pattern.matches(regEx5, str5_2));
		
		System.out.println("==================================================================");
		
//		regEx4
		if (Pattern.matches(resEx4, str1)) {
			System.out.println("4. 이름이 영문과 한글로만 구성되어 있다");			
		}
		else {
			System.out.println("4. 이름이 영문과 한글아닌 구성문자가 포함되어 있다");			
		}
		System.out.println("2. : " + Pattern.matches(resEx4, str2));			
		System.out.println("3. : " + Pattern.matches(resEx4, str3));			
		System.out.println("4. : " + Pattern.matches(resEx4, str4));			
		System.out.println("5. : " + Pattern.matches(resEx4, str5));
		System.out.println("5. : " + Pattern.matches(resEx4, str6));
		System.out.println("5. : " + Pattern.matches(resEx4, str7));
		
		System.out.println("==================================================================");
		
//		regEx5
		if (Pattern.matches(resEx4, str1)) {
			System.out.println("4. 공백이 문자만 있습니다.");			
		}
		else {
			System.out.println("4. 공백이 아닌 문자가 있습니다");			
		}
		System.out.println("2. : " + Pattern.matches(resEx4, str2));			
		System.out.println("3. : " + Pattern.matches(resEx4, str3));			
		System.out.println("4. : " + Pattern.matches(resEx4, str4));			
		System.out.println("5. : " + Pattern.matches(resEx4, str5));
		System.out.println("6. : " + Pattern.matches(resEx4, str6));
		System.out.println("7. : " + Pattern.matches(resEx4, str7));
		System.out.println("8. : " + Pattern.matches(resEx4, str8));
		System.out.println("9. : " + Pattern.matches(resEx4, str9));
		
		System.out.println("==================================================================");
		
//		regEx6
		System.out.println("10. : " + Pattern.matches(resEx6, str10));
		System.out.println("11. : " + Pattern.matches(resEx6, str11));
		
	}
}