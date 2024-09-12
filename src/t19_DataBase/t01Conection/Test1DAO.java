package t19_DataBase.t01Conection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1DAO {
	public Test1DAO() {
		try {
			//	1. JDBC 드라이버 검색
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("여기 있삼. / 성공했삼");
			
			//	2. DB서버에 연결(연동) 후 데이터 베이스 사용준비 작업
			//	주소, 계정, 비밀번호가 일치되어야함 - 인증
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
			String password = "1234";
			DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스 연결 성공했삼");
		} catch (ClassNotFoundException e) {
			System.out.println("없삼. / 실패했삼 / " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패했삼 / " + e.getMessage());			
		}
	}
}