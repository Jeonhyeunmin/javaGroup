package t17_generic;

import java.util.ArrayList;

class Myclass<T>{
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class Test1 {
	public static void main(String[] args) {
		Myclass<String> mc1 = new Myclass<>();
		mc1.setT("안녕하세요");
		System.out.println("mc1 : " + mc1.getT());
		System.out.println();
		
		Myclass<Integer> mc2 = new Myclass();
		mc2.setT(100);
		System.out.println("mc2 : "  + mc2.getT());
		
//		ArrayList<E>
	}
}

