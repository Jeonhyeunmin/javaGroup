package t18_Collection.t06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 	Queue : FIFO(First In First Out) - 선입선출
 	예외처리 미포함
 */
public class T02_Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("1. 크기 : " + queue.size());
		System.out.println("1. 내용 : " + queue);
		System.out.println();
		
		queue.add(50);
		queue.add(20);
		queue.add(21);
		queue.add(33);
		queue.add(47);
		System.out.println("2. 크기 : " + queue.size());
		System.out.println("2. 내용 : " + queue);
		System.out.println();
		
//		바로 아래 자료 보기
//		System.out.println(queue.element());	//	예외처리했을 때의 사용
		System.out.println(queue.peek());			
		System.out.println();
		
		
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();
		System.out.println("3. 크기 : " + queue.size());
		System.out.println("3. 내용 : " + queue);
		System.out.println();
//		System.out.println(queue.element());
		System.out.println(queue.peek());
//		queue.remove();
	}
}