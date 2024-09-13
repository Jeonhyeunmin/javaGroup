package t19_DataBase.t03_Hoewon;

import java.util.Scanner;

public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HoewonDAO dao = new HoewonDAO();
		HoewonService service = new HoewonService();
		
		
		String name = "";
		boolean run = true;
		
		while(run) {
			System.out.print("\n1. 회원등록 2.전체조회 3.개별조회 4.수정 5.삭제 6.종료 ==> ");
			int choice = scanner.nextInt();
			System.out.println();
			
			switch (choice) {
				case 1:
					service.setInput(dao);	//	회원 자료 등록
					break;
				case 2:
					service.getList(dao);	//	회원 자료 전체조회
					break;
				case 3:
					System.out.print("검색하실 성명을 입력하세요. ");
					name = scanner.next();
					service.getSearch(dao, name);	//	회원 자료 개별 조회
					break;
				case 4:
					System.out.print("수정하실 성명을 입력하세요. ");
					name = scanner.next();
					service.setUpdate(dao, name);	//	회원 자료 수정
					break;
				case 5:
					System.out.print("삭제하실 성명을 입력하세요. ");
					name = scanner.next();
					service.setDelete(dao, name);	//	회원 자료 삭제
					break;
				default:
					run = false;
			}
		}
		System.out.println("수고하셨습니당.");
		dao.connClose();
		scanner.close();
	}
}
