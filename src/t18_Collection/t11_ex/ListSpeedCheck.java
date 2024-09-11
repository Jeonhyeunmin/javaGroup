package t18_Collection.t11_ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSpeedCheck {
	public static void main(String[] args) {
		List<String> vos1 = new Vector<String>();
		List<String> vos2 = new ArrayList<String>();
		List<String> vos3 = new LinkedList<String>();
		
		int su = 100000;
		long startTime, endTime;
		
		System.out.println("0번 인덱스에 자료추가하기.");
		
//		Vector
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
			vos1.add(0, "홍길동" + i);
		}
		endTime = System.nanoTime();
		System.out.println("Vector의 수행시간은? \t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
//		ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
			vos2.add(0, "홍길동" + i);
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList의 수행시간은? \t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
		
//		LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i < su; i++) {
			vos3.add(0, "홍길동" + i);
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList의 수행시간은? \t\t\t\t\t" + (endTime - startTime) + "ns");
		System.out.println();
	}
}