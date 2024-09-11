package t18_Collection.t06_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 	Queue : FIFO(First In First Out) - 선입선출
 	예외처리 포함
 */
public class T02_Queue2 {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("1. 크기 : " + queue.size());
		System.out.println("1. 내용 : " + queue);
		System.out.println();
		
		queue.offer(50);
		queue.offer(20);
		queue.offer(21);
		queue.offer(33);
		queue.offer(47);
		System.out.println("2. 크기 : " + queue.size());
		System.out.println("2. 내용 : " + queue);
		System.out.println();
		
//		바로 아래 자료 보기
//		System.out.println(queue.element());
		System.out.println(queue.peek());			//	예외처리에서 오류 발생 가능성이 있음.
		System.out.println();
		
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println("3. 크기 : " + queue.size());
		System.out.println("3. 내용 : " + queue);
		System.out.println();
		queue.poll();
	}
}