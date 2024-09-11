package t18_Collection.t06_Stack_Queue;

import java.util.Stack;

/*
 	스택 : LIFO(Last In First Out) - 후입선출
 */

public class T01_Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("1.크기 : " + stack.size());
		System.out.println("1.내용 : " + stack);
		System.out.println();
		
		stack.push(2);
		stack.push(4);
		stack.push(9);
		stack.push(2);
		stack.push(6);
		System.out.println("2.크기 : " + stack.size());
		System.out.println("2.내용 : " + stack);
		System.out.println();
		
//		검색 : search()
		System.out.println("3.검색(9) : " + stack.search(9));
		System.out.println();
		
//		바로 아래 자료 쳐다보기 : peek()
		System.out.println(stack.peek());
		System.out.println();
		
		System.out.println("제거되는 숫자 : " + stack.pop());
		System.out.println("3.크기 : " + stack.size());
		System.out.println("3.내용 : " + stack);
		System.out.println();
		
		stack.remove(2);
		System.out.println("3.크기 : " + stack.size());
		System.out.println("3.내용 : " + stack);
	}
}
