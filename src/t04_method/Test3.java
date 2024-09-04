package t04_method;

public class Test3 {
	int su = 0;
	
	void mod1(int su) {
		this.su = su;
	}
	
	void mod2() {
		System.out.println("su * su = " + (su * su));
	}
}
