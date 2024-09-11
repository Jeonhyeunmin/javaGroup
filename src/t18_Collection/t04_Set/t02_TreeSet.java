package t18_Collection.t04_Set;

import java.util.TreeSet;

/*
 	TreeSet : Set계열, 집합자료구조, HashSet의 역할과 같은데, 차이점은 꺼낼 때 자료가 자동으로 오름차순 정렬되어있다
 */

public class t02_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(8);
		treeSet.add(2);
		treeSet.add(2);
		
		System.out.println("1.크기 : " + treeSet.size());
		System.out.println("1.크기 : " + treeSet);
		
		System.out.println("2.first() : " + treeSet.first());
		System.out.println("3.last() : " + treeSet.last());
		System.out.println("4.lower() : " + treeSet.lower(11));
		System.out.println("5.higher() : " + treeSet.higher(11));
		System.out.println("6.higher() : " + treeSet.higher(10));
	}
}