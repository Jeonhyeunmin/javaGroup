package t18_Collection.t04_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 	Set 계열 : 집합자료구조 - HashSet / TreeSet
 	인덱스 정보가 없다. 비순서 자료구조, 자료을 허용하지 않는다.
 */

public class t01_HashSet {
	public static void main(String[] args) {
//		HashSet<String> hash = new HashSet<String>();
		HashSet<String> hash = new HashSet<>();
//		Set<String> hash = new HashSet<>();
		
		System.out.println("1. hash 크기 : " + hash.size());
		System.out.println("1. hash 내용 : " + hash);
		System.out.println();
		
//		자료의 추가
		hash.add("메롱");
		hash.add("길동");
		hash.add("말숙");
		hash.add("기자");
		hash.add("나무");
		hash.add("감찬");
		System.out.println("2. hash 크기 : " + hash.size());
		System.out.println("2. hash 내용 : " + hash);
		System.out.println();
		
		hash.add("감찬");
		System.out.println("3. hash 크기 : " + hash.size());
		System.out.println("3. hash 내용 : " + hash);
		System.out.println();
		
		hash.add(new String("길동"));
		System.out.println("4. hash 크기 : " + hash.size());
		System.out.println("4. hash 내용 : " + hash);
		System.out.println();
		
//		제거
		hash.remove("길동");
		System.out.println("5. hash 크기 : " + hash.size());
		System.out.println("5. hash 내용 : " + hash);
		System.out.println();
		
//		추가
		hash.add("오하늘");
		System.out.println("6. hash 크기 : " + hash.size());
		System.out.println("6. hash 내용 : " + hash);
		System.out.println();
		
		System.out.println("7. '말' 포함유무? : " + hash.contains("말숙"));
		System.out.println();
		
//	향상된 for문을 이용한 자료의 출력
		for(String s : hash) {
			System.out.print(s + "/");
		}
		System.out.println("\n");
		
//		람다식 표현(함수식 표현)
		hash.forEach(name -> {
			System.out.println("값 : " + name);
		});
		System.out.println();
		
//		전체삭제
		hash.clear();
		System.out.println("8. hash 크기 : " + hash.size());
		System.out.println("8. hash 내용 : " + hash);
		System.out.println();
		
//		비어있는지의 유무
		
		System.out.println("9. hash 크기 : " + hash.isEmpty());
		System.out.println("9. hash 내용 : " + hash);
		System.out.println();
	}
}