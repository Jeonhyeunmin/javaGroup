package t14_texception.t01;

public class T5_IndexOutOfBound {
	public static void main(String[] args) {
		int array [] = {1, 2, 3};
		
		try {
			for(int i = 0; i <= array.length; i++) {
				System.out.println("i = " + i + " : " + array[i]);
			}			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자 오류 : " + e.getMessage());
		}
		System.out.println("작업끄으으으으으읕");
	}
}
