package t14_texception.t01;

public class T4_Aritgmetic {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 0;
		
		try {
			System.out.println(su1 / su2);
			System.out.println("정상처리");
		} catch (ArithmeticException e) {
			System.out.println("연산오류 : " + e.getMessage());
		}
		System.out.println("작업 끝");
	}
}
