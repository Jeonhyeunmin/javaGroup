package T09_polymorphism.T1;

public class T1Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		//자동타입변환 = 넣는 개념이 아니라 덮어쓴다?
		Bb bb = new Bb();
		
//		Ff ff = new Bb();
		
		Aa a1 = bb;
		System.out.println();
		
		System.out.println(a1.su);
		System.out.println(bb.su);
		System.out.println();
		
		Cc cc = new Cc();
		System.out.println();
		
		Aa a2 = new Cc();
		System.out.println("su : " + a2.su);
		System.out.println();
		
		Dd dd = new Dd();
		System.out.println();
		Bb b1 = new Dd();
		System.out.println("su : " + b1.su);
		System.out.println();
		
		Aa a3 = new Dd();
		System.out.println("su : " + a3.su);
		System.out.println();
	}
}
