package t11_interface.t01;

public interface Test1 {
	// 누워서 쓰는 파란색 글자는 상수 (final static이 생략되어 있음)
	/* public final static */ int MAX = 1000000;
	int MIN = 0;
	
	
	/* public abstract */	void data();
	void data1(int su);
	
	
//	인터페이스에서 메소드를 사용하고 싶으면 앞에 default 붙이기	
	default void data2() {
//		실행할 내용을 포함 / 생략
		System.out.println("이곳은 data2 메소드(default)");
	}
	
	
//	인터페이스에서 메소드를 사용하고 싶으면 앞에 static 붙이기	
	static void data3() {
//		실행할 내용을 포함 / 생략
		System.out.println("이곳은 data3 메소드(static)");
	}	
}