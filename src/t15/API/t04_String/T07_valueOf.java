package t15.API.t04_String;

import java.util.HashMap;

public class T07_valueOf {
	public static void main(String[] args) {
//		String.valueOf() : 자료형들을 '문자열'로 변환한다. 
		int su = 1234;
//		double dbIsu = 1234.0;
		
//		형변환? 하려면 int 말고 Integer로 변수 선언 (int를 제외한 나머지는 첫글자만 대문자로 변경하면 됨.)
		Integer intSu = 1234;
		Double dbIsu = 1234.0;
		String strSu = "1234";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println(strSu);
		System.out.println(intSu);
		System.out.println(su);
		System.out.println(strSu.getClass().getName());
		System.out.println(intSu.getClass().getName());
		System.out.println(dbIsu.getClass().getName());
		System.out.println(map.getClass().getName());
		System.out.println();
		
		int intSu2 = 1234;
		System.out.println("1. intSu + 100 : " + (intSu + 100));
//		String strSu2 = (String)intSu2;		//	X
//		String strSu3 = intSu2.String();	//	X
		String strSu2 = intSu2 + "";	//	O
		strSu2 = intSu2 + 100 + "";
		System.out.println(strSu2);
		System.out.println();
		
//		문자열로 변환 : valueOf()
		String strSu3 = String.valueOf(intSu2);
		System.out.println(strSu3.getClass().getName());
		System.out.println(strSu3);
		System.out.println();
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4);
		System.out.println(strSu4.getClass().getName());
		System.out.println(strSu4);
		
		int a1 =100, a2 = 200;
		int res = a1 + a2;
		System.out.println("res : " + res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5);
		System.out.println();
		
//		res = (int)String.valueOf(a1) + String.valueOf(a2);
		res = Integer.parseInt(String.valueOf(a1)) +Integer.parseInt(String.valueOf(a2));
		System.out.println(res);
	}
}
