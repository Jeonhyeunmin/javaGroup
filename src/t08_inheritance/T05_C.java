package t08_inheritance;

public class T05_C extends T05_P {
//	어노테이션
	@Override
	void areaCircle(int r) {
		
	}

	@Override
	void div(int su1, int su2) {
//		super.div(su1, su2);	//	자식메소드 사용하지 않고, 부모메소드 호출
		double res = (double)su1 / su2;
		System.out.println("res : " + res);
	}
	
	

}
//	부모꺼를 재정의 하는 것이 오버라이드
//	재정의 하면 자식꺼 실행시킴