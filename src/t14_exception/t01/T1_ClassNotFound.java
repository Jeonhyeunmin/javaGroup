package t14_exception.t01;

public class T1_ClassNotFound {
	public static void main(String[] args) {
		
		try {
//		클래스를 찾는 클래스 : Class.forName("java.lang.Object2")
			Class.forName("java.lang.Object2");	// 이 클래스가 있으면 try로 가고 없으면 catch문으로 감
			System.out.println("찾는 파일이 존재합니다.");
//		} catch (Exception e) {
		} catch (ClassNotFoundException e) {
//			System.out.println("찾는 파일이 없습니다.");
			e.printStackTrace();
//			System.out.println(e.getMessage());	오류 문구를 간소화하여 오류 내역을 표시해줌 : getMessage()
			System.out.println("파일검색 실패 : " + e.getMessage());
		} finally {
			System.out.println("작업 끝~");
		}
	}
}