package t14_texception.t01;

public class T6_NullPoint {
	public static void main(String[] args) {
		
	String str = "Seoul";
	String str2 = null;
	
	System.out.println(".charAt(2) : " + str.charAt(2));
		try {
			System.out.println(".charAt(2) : " + str2.charAt(2));	//	str2는 null 값이기 때문이지이이~		
			System.out.println("정상처리");
		} catch (NullPointerException e) {
			System.out.println("Null 값 오류 : " + e.getMessage());
		}	finally {
			System.out.println("작업끝~");		
		}
	}
}