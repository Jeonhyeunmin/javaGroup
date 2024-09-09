package t15.API.t04_String;

import java.io.UnsupportedEncodingException;

public class t02_getBytes {
	public static void main(String[] args) {
//		아스키코드	:	영문 1글자를 1Byte, 한글은 2Byte
//		EUC-KR	:	영문 1글자를 1Byte, 한글은 2Byte
//		유니코드	:	UTF-8 영문 1글자를 1Byte, 한글은 3Byte
		String str1 = "Hello!";
		String str2 = "안녕하세요!";
		
		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length());
		System.out.println();
		
		byte b1[] = str1.getBytes();
		System.out.println("b1의 길이 : " + b1.length);
		
		byte b2[] = str2.getBytes();
		System.out.println("b2의 길이 : " + b2.length);
		System.out.println();
		
//		인코딩 / 디코딩
//		인코딩 : 영상자료를 외부로 보내려면 변환하는 과정
//		디코딩 : 인코딩을 한 것을 복구시켜주는 과정
//		모뎀 : 인코딩/디코딩하는 장치
		
//		EUC-KR 인코딩 <--> 디코딩
		try {
			byte b3[] = str2.getBytes("EUC-KR");	//	인코딩
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString());
			System.out.println("b3[0] : " + b3[0] + b3[1] + b3[2]);
			System.out.println("------전송중------");
			String str3 = new String(b3, "EUC-KR");	//	디코딩
			System.out.println("str3 : " + str3);
			System.out.println();
			
			byte b4[] = str2.getBytes("UTF-8");	//	인코딩
			System.out.println("b3의 길이 : " + b4.length);
			System.out.println("b4 : " + b4.toString());
			System.out.println("b4[0] : " + b4[0] + b4[1] + b4[2]);
			System.out.println("------전송중------");
			String str4 = new String(b4, "UTF-8");	//	디코딩
			System.out.println("str4 : " + str4);
			System.out.println();
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}