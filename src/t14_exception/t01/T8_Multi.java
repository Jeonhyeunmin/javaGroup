package t14_exception.t01;

public class T8_Multi {
	public static void main(String[] args) {
//		두개 이상의 오류 발생 시 
		
/*		
		int su1 = Integer.parseInt(args[0]);
		int su2 = Integer.parseInt(args[1]);
		int su3 = Integer.parseInt(args[2]);
*/
		
		try {
			String data0 = args[0];
			String data1 = args[1];
			int res = Integer.parseInt(data0) + Integer.parseInt(data1);
			String data2 = args[2];
			
			res = Integer.parseInt(data0) + Integer.parseInt(data1) + Integer.parseInt(data2);
			System.out.println("res : " + res);
		} catch (NumberFormatException e) {
			System.out.println("숫자 변환 오류 : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 갯수 오류 : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("오류 체크하세요.");
		}
		System.out.println("작업끝");
		
		
		
		
	}
}
