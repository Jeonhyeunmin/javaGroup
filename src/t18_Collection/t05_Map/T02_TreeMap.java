package t18_Collection.t05_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 	Map계열 자료구조 : 사진식자료구조, Web에서의 JSON 데이터형식과 같다
 	순서와 관계없다. '키'와 '값'으로 구성된 자료구조이다. 자료검색/삭제/수정 시 전부 '키'를 이용하여 실행
 	중복 = '키'는 중복 불가, '값'은 중복 가능
 */

public class T02_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map =  new TreeMap();
		
		System.out.println("1. 크기 : " + map.size());
		System.out.println("1. 자료 : " + map);
		System.out.println();
		
//		자료삽입 : put
		map.put(11, "홍길동");
		map.put(13, "김말숙");
		map.put(20, "이기자");
		map.put(15, "강감찬");
		map.put(17, "오사랑");
		map.put(19, "고인돌");
		
		System.out.println("2. 크기 : " + map.size());
		System.out.println("2. 자료 : " + map);
		System.out.println();
		
		map.put(13, "김말자");
		map.put(20, "김말자");
		System.out.println("3. 크기 : " + map.size());
		System.out.println("3. 자료 : " + map);
		System.out.println();
		
		System.out.println( "4. 검색 : " + map.get(20));
		System.out.println();
		
		map.put(20, "이사랑");
		System.out.println("5. 크기 : " + map.size());
		System.out.println("5. 자료 : " + map);
		System.out.println();
		
		map.remove(20);
		System.out.println("6. 크기 : " + map.size());
		System.out.println("6. 자료 : " + map);
		System.out.println();
		
//		키 값 검색
		System.out.println("7. 첫번째 키 : " + map.firstKey());
		System.out.println("7. 마지막 키 : " + map.lastKey());
		System.out.println("7. 첫번째 키 와 값 : " + map.firstEntry());
		System.out.println("7. 마지막 키 와 값 : " + map.lastEntry());
		System.out.println("7. 검색키보다 높은 값 : " + map.higherKey(18));
		System.out.println("7. 검색키보다 작은 값 : " + map.lowerKey(18));
		System.out.println("7. 검색키보다 작은 값 : " + map.get(map.higherKey(18)));
		System.out.println();
		
		
		map.clear();
		System.out.println("크기 : " + map.size());
		System.out.println("자료 : " + map);
	}
}
