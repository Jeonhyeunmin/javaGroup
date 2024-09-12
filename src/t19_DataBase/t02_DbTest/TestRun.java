package t19_DataBase.t02_DbTest;

public class TestRun {
	public static void main(String[] args) {
		TestDAO dao = new TestDAO();
		
		//	test 테이블에 전체자료 조회
		dao.getList();
		
		dao.dbClose();
	}
}
