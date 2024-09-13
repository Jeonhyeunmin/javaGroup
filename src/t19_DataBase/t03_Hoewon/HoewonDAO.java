package t19_DataBase.t03_Hoewon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class HoewonDAO {
//	Statement stmt = null;
	private PreparedStatement pstmt = null;
	private Connection conn = null;
	private ResultSet rs = null;
	HoewonVO vo = null;
	
	private String sql = "";
	
	
	public HoewonDAO() {	//	데이터베이스 연동
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/javagroup";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패" + e.getMessage());
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		}
	}
	
//	conn 닫기
	public void connClose() {	//	연결 끊기
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		}
	}
	
//	pstmt 닫기
	public void pstmtClose() {	//	연결 끊기
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		}
	}
	
//	rs 닫기
	public void rsClose() {	//	연결 끊기
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			pstmtClose();
		}
	}

//	회원 자료 등록
	public int setInput(HoewonVO vo) {
		int res = 0;
		try {
			/*	statement 객체 사용 시
			sql = "insert into hoewon values (default,'"+vo.getName()+"',"+vo.getAge()+",'"+vo.getGender()+"','"+vo.getJoinday()+"','"+vo.getAddress()+"')";
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);	// sql = select면 executeQuery / 나머지는 executeUpdate
			*/
			
			sql = "insert into hoewon values (default, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			pstmt.setString(4, vo.getJoinday());
			pstmt.setString(5, vo.getAddress());
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

//	전체 회원 검색
	public ArrayList<HoewonVO> getList() {
		ArrayList<HoewonVO> vos = new ArrayList<HoewonVO>();
		try {
			sql = "select * from hoewon order by name";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
			vo = new HoewonVO();
			vo.setIdx(rs.getInt("idx"));
			vo.setName(rs.getString("name"));
			vo.setAge(rs.getInt("age"));
			vo.setGender(rs.getString("gender"));
			vo.setJoinday(rs.getString("joinday"));
			vo.setAddress(rs.getString("address"));
			
			vos.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			rsClose();
		}
		return vos;
	}

	public HoewonVO getSearch(String name) {
		HoewonVO vo = new HoewonVO();
		try {
			sql = "select * from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo.setIdx(rs.getInt("idx"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setGender(rs.getString("gender"));
				vo.setJoinday(rs.getString("joinday"));
				vo.setAddress(rs.getString("address"));
			}
			
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			rsClose();
		}
		return vo;
	}

	public int setDelete(String name) {
		int res = 0;
		try {
			sql = "delete from hoewon where name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			pstmtClose();
		}
		return res;
	}

	public int setUpdate(int idx, int choice, String content) {
		int res = 0;
		try {
			if(choice == 1) {
				sql = "update hoewon set name = ? where idx = ?";
			}
			else if(choice == 2) {
				sql = "update hoewon set age = ? where idx = ?";
			}
			else if(choice == 3) {
				sql = "update hoewon set gender = ? where idx = ?";
			}
			else if(choice == 4) {
				sql = "update hoewon set joinday = ? where idx = ?";
			}
			else if(choice == 5) {
				sql = "update hoewon set address = ? where idx = ?";
			}
			
			pstmt = conn.prepareStatement(sql);
			
			if(choice == 2) {
				pstmt.setInt(1, Integer.parseInt(content));
			}
			else {
				pstmt.setString(1, content);
			}
			pstmt.setInt(2, idx);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("데이터베이스 연동 실패" + e.getMessage());
		} finally {
			pstmtClose();
		}
		
		return res;
	}
}