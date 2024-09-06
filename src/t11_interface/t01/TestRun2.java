package t11_interface.t01;

public class TestRun2 {
	public static void main(String[] args) {
		
//		new Test1();	인터페이스는 생성할 수 없다.
		Seoul seoul = new Seoul();
		seoul.data();
		seoul.data2();
		System.out.println();
		
		Test1.data3();
		System.out.println();
		
		Busan busan = new Busan();
		busan.data();
		busan.data1(500);
		busan.data1(5000000);
		busan.data1(-500);
	}
}
