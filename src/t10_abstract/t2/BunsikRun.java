package t10_abstract.t2;

import java.util.Scanner;

public class BunsikRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("분식점을 선택하세요");
			System.out.println("1. 왕자분식 | 2. 서울분식 | 3. 우주분식");
			int choice = sc.nextInt();
			
			if(choice < 1 || choice > 3) {
				break;
			}
			
			switch (choice) {
				case 1:
					WangjaBunsik wangja = new WangjaBunsik();
					wangja.getShopName();
					wangja.kimchi();
					wangja.budae();
					wangja.bibim();
					wangja.sundae();
					wangja.konggi();
					break;
				case 2:
					SeoulBunsik seoul = new SeoulBunsik();
					seoul.getShopName();
					seoul.kimchi();
					seoul.budae();
					seoul.bibim();
					seoul.sundae();
					seoul.konggi();
					break;
				case 3:
					WoojuBunsik wooju = new WoojuBunsik();
					wooju.getShopName();
					wooju.kimchi();
					wooju.budae();
					wooju.bibim();
					wooju.sundae();
					wooju.konggi();
					break;
			}
			System.out.println();
		}
		System.out.println("작업 끝");
		sc.close();
	}
}
//		while(true) {
//			System.out.println("분식점을 선택하세요");
//			System.out.println("1. 왕자분식 | 2. 서울분식 | 3. 우주분식");
//			String choice = sc.next();
//			
//			if(choice.equals("왕자분식")) {			
//				WangjaBunsik wangja = new WangjaBunsik();
//			}
//			else if(choice.equals("우주분식")) {			
//				WoojuBunsik wooju = new WoojuBunsik();
//				
//			}
//			else if(choice.equals("서울분식")) {			
//				SeoulBunsik seoul = new SeoulBunsik();			
//			}
//			else {
//				break;
//			}
//		}