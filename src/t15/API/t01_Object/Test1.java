package t15.API.t01_Object;

import java.util.HashMap;

//	HashCode
public class Test1 {
	public static void main(String[] args) {
//			HashMap : Collection FrameWork의 한 종류 - 키(key)와 value(값)으로 데이터를 표현
//			Generic : 하위 타입을 정의
//			레퍼 클래스? - 박싱 : 포장 / 언박싱 : 기본타입으로 돌아감 (int를 박싱하면 Integer)
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "데이터1");
		map.put(1, "데이터2");
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2 = new HashMap<Aa, String>();
		map2.put(new Aa("첫번째"), "홍길동");
		map2.put(new Aa("첫번째"), "김말숙");
		map2.put(new Aa("두번째"), "이기자");
		System.out.println(map2);
//		출력 결과 : 객체주소(HashCode)를 통한 자료의 저장 / 처리
//		==(같다) /  ===(값과 객체 타입 모두 비교)
	}
}




class Aa {
	String name = "";
	public Aa(String name) {
		this.name = name;
	}
}

class Bb{
	String name = "";
	public Bb(String name) {
		this.name = name;
	}
}