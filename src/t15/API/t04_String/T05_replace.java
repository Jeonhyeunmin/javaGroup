package t15.API.t04_String;

public class T05_replace {
	public static void main(String[] args) {
//	 								 0					1				 2
//	 								 012345678901234567890
			String msg1 = "Welcome to Korea!!!";
//	 							 0					1				 2
//	 							 01234567890123456789012
		String msg2 = "한국을 방문하신 것을 환영합니다.";
		
		System.out.println("msg1 : " + msg1);
		System.out.println("msg2 : " + msg2);
		
//		replace() : 치환 - 특정문자(열)을 지정한 문자(열)로 (모두)변경처리한다. 단, 대소문자는 구별한다.
		System.out.println("1. 'Korea'를 'USA'로 치환 - " + msg1.replace("Korea", "USA"));
		System.out.println("2. '한국'을 '미국'으로 치환 - " + msg2.replace("한국", "미국"));
		

		System.out.println("3. 'o'를 'O'로 변경하세요 - " + msg1.replace("o", "O"));
		System.out.println("4. 'o'를 'O'로 변경하세요 - " + msg1.replaceAll("o", "O"));	//	'정규식' 사용시
		System.out.println("4. 'o'를 'O'로 변경하세요 - " + msg1.replaceAll("o", "O"));	//	'정규식' 사용시
		System.out.println();
		
		String msg3 = " ! H e l l o ! ";
		System.out.println("msg3:" + msg3);
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3 + msg2);
		
//		msg3번에 포함된 앞/뒤 공백 무시 후 결합.
//		.trim() : 맨 앞과 맨 뒤에 불필요한 공백을 제거해줌.
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3.trim() + msg2);
		
//		msg3번에 포함된 모든 공백을 삭제 후 결합
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3.replace(" ", "") + msg2);
		
//		msg3 안에 영문자를 모두 소문자로 변경 후 결합
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3.toLowerCase() + msg2);
		
//		msg3 안에 영문자를 모두 대문자로 변경 후 결합
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3.toUpperCase() + msg2);
		
//		msg3 안에 모든 공백을 없애고, 영문자를 모두 대문자로 변경 후 결합
		System.out.println("msg1 + msg3+msg2 : " + msg1 + msg3.replace(" ", "").toUpperCase() + msg2);
		
//		포함유무 : contains()
//		msg3안에 공백을 포함하고 있느냐? 있으면 true / 없으면 false
		System.out.println(msg3.contains(" "));
		
//		문자열로 결합 - "+" or concat()
		System.out.println(msg1.concat(msg3).concat(msg2));
		
//		지정 문자열 반복 : repeat() : java 10 이후 버전에서 처리 가능.
//		System.out.println("=".repeat(50));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
