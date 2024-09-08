package t14_exception.t01;

public class T7_NumberFormat {
	public static void main(String[] args) {
		String strNo = "1234";
		String strNo2 = "1234c";
		
// 	문자형식으로 된 숫자를 숫자로 변경해주는 명령어 : Integer.parseInt
		int num = Integer.parseInt(strNo);
		System.out.println(num+1000);
		
		try {
			num = Integer.parseInt(strNo2);
			System.out.println(num+1000);
			System.out.println("정상처리");
		} catch (NumberFormatException e) {
			System.out.println("숫자변환오류 : " + e.getMessage());
		} finally {
		System.out.println("작업끝~");
		}
	}
}