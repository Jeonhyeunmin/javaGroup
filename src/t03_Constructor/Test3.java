package t03_Constructor;

public class Test3 {
//	기본생성자
	Test3() {}
	
	int atom1 = 30;
	
	/*
	public Test3() {	// 기본 생성자
		System.out.println("atom1 : " + atom1);
	}
	*/
	public Test3(int atom1) {	// 사용자 생성자
		this.atom1 = atom1;
		System.out.println("atom1 : " + atom1);
		System.out.println("this.atom1 : " + this.atom1);
		
		this.atom1 += atom1;
		System.out.println("this.atom1 : " + this.atom1);
	}
	
//	생성자 필드
//	int atom1 = 30;
	int atom2 = 0;
	double atom3;
	
	public Test3(double atom3) {
		this.atom3 = atom3;
		System.out.println("this.atom3 : " + this.atom3);		
	}
}
