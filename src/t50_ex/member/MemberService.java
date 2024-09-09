package t50_ex.member;

public class MemberService {
	
	boolean login(String id, String passwork) {
		if(id.equals("hong") && passwork.equals("12345")) {
			return true;
		}
		return false;
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
