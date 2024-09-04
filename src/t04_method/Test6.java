package t04_method;

public class Test6 {
	int su;
	
	public Test6() {}

	public void mod1() {
		System.out.println("이곳은 Test6 클래스의 mod1 메소드 입니다.");
		mod2(su);
	}

	private void mod2(int su2) {
		System.out.println("이곳은 Test6 클래스의 mod2 메소드 입니다. su = " + this.su);
	}

	String integerCheck(int su) {
		String check = "";
		if(su > 0) {
			check = "양수";
		}
		else if (su < 0) {
			check = "음수";
		}
		else {
			check = "0";
		}
		return check;
	}
}