package t05_static;

import t04_method.*;	// * : 와일드 카드

public class Test4Run {
	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.mod1();
		
		new Test6();
		new Test5(1);
		new t04_method.Test4();
	}
}

