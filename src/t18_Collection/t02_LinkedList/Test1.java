package t18_Collection.t02_LinkedList;

import java.util.LinkedList;
import java.util.List;

/*
	LinkedList : List 계열, List 자료구조의 특징을 갖는다.
	인덱스가 없다 따라서 순차처리 개념이 없다. 많은 자료의 순차 검색 시에는 많은 시간이 걸린다
	단, 자료의 삽입/삭제는 처리속도가 빠르다. 따라서 자료의 삽입/삭제가 빈번한 자료구조에서 많이 사용된다.
	'이중링크드리스트(앞주소 - 데이터 - 뒷주소)'의 자료구조로 설계되어있기에, 복구 작업이 가능하다. 
	'멀티스레드'의 동기화(synchronizen)작업에 유리, ArrayList에 비해서 안정적임.
 */

public class Test1 {
	public static void main(String[] args) {
//		linkedList linkedList = new linkedList();
//		linkedList<String> linkedList = new linkedList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
//		List<String> linkedList = new linkedList<>();
		
		System.out.println("1. linkedList 크기 : " + linkedList.size());
		System.out.println("1. linkedList 크기 : " + linkedList);
		System.out.println();
		
		linkedList.add("홍길동");
		linkedList.add("김말숙");
		linkedList.add("이기자");
		linkedList.add("오하늘");
		linkedList.add("고인돌");
		linkedList.add("소나무");
		System.out.println("2. linkedList 크기 : " + linkedList.size());
		System.out.println("2. linkedList 크기 : " + linkedList);
		System.out.println();
		
		linkedList.add("홍길동3");
		linkedList.add("김말숙3");
		linkedList.add("이기자3");
		linkedList.add("오하늘3");
		linkedList.add("고인돌3");
		linkedList.add("소나무3");
		System.out.println("3. linkedList 크기 : " + linkedList.size());
		System.out.println("3. linkedList 크기 : " + linkedList);
		System.out.println();
		
		System.out.println("4.linkedList.get(1) : " + linkedList.get(1));
		System.out.println("4.linkedList.get(5) : " + linkedList.get(5));
		System.out.println("4.linkedList.get(linkedList.size()-1) : " + linkedList.get(linkedList.size()-1));
		System.out.println();
		
//		자료수정
		linkedList.set(1, "강감찬");
		System.out.println("5. linkedList 크기 : " + linkedList);
		System.out.println("5. linkedList 크기 : " + linkedList.size());
		System.out.println();
		
//		자료삭제
		linkedList.remove(1);
		linkedList.remove(3);
		linkedList.remove(5);
		System.out.println("6. linkedList 크기 : " + linkedList);
		System.out.println("6. linkedList 크기 : " + linkedList.size());
		System.out.println();
		
//		자료삽입
		linkedList.add(1, "그린");
		System.out.println("7. linkedList 크기 : " + linkedList);
		System.out.println("7. linkedList 크기 : " + linkedList.size());
		System.out.println();
		
//		전체 비우기
		linkedList.clear();
		System.out.println("8. linkedList 크기 : " + linkedList);
		System.out.println("8. linkedList 크기 : " + linkedList.size());
	}
}