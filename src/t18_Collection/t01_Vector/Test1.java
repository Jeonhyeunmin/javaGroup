package t18_Collection.t01_Vector;

import java.util.List;
import java.util.Vector;

/*
	Vector : List 계열, List 자료구조의 특징을 모두 갖는다.
	인덱스로 관리, 순차처리, 앞에서부터 자료를 기억, 자료의 삽입/삭제시 많은 시간 소요될 수 있음
	'멀티스레드'의 동기화(synchronizen)작업에 유리, ArrayList에 비해서 안정적임.
 */

public class Test1 {
	public static void main(String[] args) {
//		Vector vector = new Vector();
//		Vector<String> vector = new Vector<String>();
		Vector<String> vector = new Vector<>();
//		List<String> vector = new Vector<>();
		
		System.out.println("1. vector 용량 : " + vector.capacity());
		System.out.println("1. vector 크기 : " + vector.size());
		System.out.println("1. vector 크기 : " + vector);
		System.out.println();
		
		vector.add("홍길동");
		vector.add("김말숙");
		vector.add("이기자");
		vector.add("오하늘");
		vector.add("고인돌");
		vector.add("소나무");
		System.out.println("2. vector 용량 : " + vector.capacity());
		System.out.println("2. vector 크기 : " + vector.size());
		System.out.println("2. vector 크기 : " + vector);
		System.out.println();
		
		vector.add("홍길동3");
		vector.add("김말숙3");
		vector.add("이기자3");
		vector.add("오하늘3");
		vector.add("고인돌3");
		vector.add("소나무3");
		System.out.println("3. vector 용량 : " + vector.capacity());
		System.out.println("3. vector 크기 : " + vector.size());
		System.out.println("3. vector 크기 : " + vector);
		System.out.println();
		
		System.out.println("4.vector.get(1) : " + vector.get(1));
		System.out.println("4.vector.get(5) : " + vector.get(5));
		System.out.println("4.vector.get(vector.size()-1) : " + vector.get(vector.size()-1));
		System.out.println();
		
//		자료수정
		vector.set(1, "강감찬");
		System.out.println("3. vector 크기 : " + vector);
		System.out.println("3. vector 크기 : " + vector.size());
		System.out.println();
		
//		자료삭제
		vector.remove(1);
		vector.remove(3);
		vector.remove(5);
		System.out.println("4. vector 크기 : " + vector);
		System.out.println("4. vector 크기 : " + vector.size());
		System.out.println();
		
//		자료삽입
		vector.add(1, "그린");
		System.out.println("5. vector 크기 : " + vector);
		System.out.println("5. vector 크기 : " + vector.size());
		System.out.println();
		
//		전체 비우기
		vector.clear();
		System.out.println("6. vector 크기 : " + vector);
		System.out.println("6. vector 크기 : " + vector.size());
	}
}