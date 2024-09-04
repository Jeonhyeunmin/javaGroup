package t08_inheritance;

import java.util.Scanner;

//	면적을 계산하고자 한다.
//	T02Aa 클래스는 사각형 면적 / 둘레를 구할 수 있고.
//	T02Bb 클래스는 원의 둘레 / 면적을  구할 수 있다.
//	T02Cc 클래스는 출력전담 클래스이다.

public class T02Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T02Cc cc = new T02Cc();
		int choice = 0;
		int w, h, resRect, r;
		double resCircle;
		
		System.out.println("작업할 번호를 입력하세요 ");
		System.out.println("1 : 사각형 넓이 | 2 : 사각형 둘레 | 3 : 원넓이 | 4 : 원둘레 | 0 : 종료");
		choice = sc.nextInt();
		
		while(true) {
			if(choice ==1 || choice == 2) {
				System.out.print("사각형의 폭 : ");
				 w = sc.nextInt();
				 System.out.print("사각형의 높이 : ");
				 h = sc.nextInt();
				 resRect = cc.areaRec(w, h);
				 cc.prn(1, "a", resRect, 0.0);
				 resRect = cc.lenRec(w, h);
				 cc.prn(1, "l", resRect, 0.0);
				 
			}
			else if(choice == 3 || choice == 4) {
				System.out.print("삼각형의 반지름 : ");
				 r = sc.nextInt();
				 resCircle = cc.areaCircle(r);
				 cc.prn(2, "a", 0, resCircle);
				 resCircle = cc.lenCircle(r);
				 cc.prn(2, "l", 0, resCircle);
			}
			else {
				break;
			}
		}
		System.out.println("작업 끄읕~");
//		cc.circle(5);
		
	}
}
