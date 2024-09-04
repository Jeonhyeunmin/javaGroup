package t03_Constructor;

public class Test2 {
	Test2() {}	// 기본 생성자
	
	Test2(int su1){}
	
	Test2(int su1, int su2){}
	
	Test2(int su1, double su2){}
	
	Test2(double su1, int su2){}
	
//	생성자는 변수 갯수, 변수 타입 등 다른 것이 있어야 만들 수 있음. : 생성자 오버로딩 ★★★
//	생성자 오버로딩 : 하나의 클래스 안에서 여러개의 생성자를 만드는데에 있어
//	그 생성자의 구분을 변수의 타입, 갯수, 순서에 따라서 다 다른 생성자로 구분 한다.
}