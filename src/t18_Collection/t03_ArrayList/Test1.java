package t18_Collection.t03_ArrayList;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) {
//		ArrayList ArrayList = new ArrayList();
//		ArrayList<String> ArrayList = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
//		List<String> ArrayList = new ArrayList<>();
		
		System.out.println("1. arrayList 크기 : " + arrayList.size());
		System.out.println("1. arrayList 크기 : " + arrayList);
		System.out.println();
		
		arrayList.add("홍길동");
		arrayList.add("김말숙");
		arrayList.add("이기자");
		arrayList.add("오하늘");
		arrayList.add("고인돌");
		arrayList.add("소나무");
		System.out.println("2. arrayList 크기 : " + arrayList.size());
		System.out.println("2. arrayList 크기 : " + arrayList);
		System.out.println();
		
		arrayList.add("홍길동3");
		arrayList.add("김말숙3");
		arrayList.add("이기자3");
		arrayList.add("오하늘3");
		arrayList.add("고인돌3");
		arrayList.add("소나무3");
		System.out.println("3. arrayList 크기 : " + arrayList.size());
		System.out.println("3. arrayList 크기 : " + arrayList);
		System.out.println();
		
		System.out.println("4.arrayList.get(1) : " + arrayList.get(1));
		System.out.println("4.arrayList.get(5) : " + arrayList.get(5));
		System.out.println("4.arrayList.get(arrayList.size()-1) : " + arrayList.get(arrayList.size()-1));
		System.out.println();
		
//		자료수정
		arrayList.set(1, "강감찬");
		System.out.println("5. arrayList 크기 : " + arrayList);
		System.out.println("5. arrayList 크기 : " + arrayList.size());
		System.out.println();
		
//		자료삭제
		arrayList.remove(1);
		arrayList.remove(3);
		arrayList.remove(5);
		System.out.println("6. arrayList 크기 : " + arrayList);
		System.out.println("6. arrayList 크기 : " + arrayList.size());
		System.out.println();
		
//	향상된 for문을 이용한 자료의 출력
	for(String s : arrayList) {
		System.out.print(s + "/");
	}
	System.out.println("\n");
		
//		자료삽입
		arrayList.add(1, "그린");
		System.out.println("7. arrayList 크기 : " + arrayList);
		System.out.println("7. arrayList 크기 : " + arrayList.size());
		System.out.println();
		
//		전체 비우기
		arrayList.clear();
		System.out.println("8. arrayList 크기 : " + arrayList);
		System.out.println("8. arrayList 크기 : " + arrayList.size());
	}
}