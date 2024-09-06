package t12_nested.t03;

//	중첩클래스 : 로컬 클래스(메소드 안에 생성되는 클래스)
public class Test1 {
	public int su = 100;
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1() 메소드입니다.");
	}
	
	public void modClass() {
		int atom = 900;
		System.out.println("이곳은 Test1 클래스의 modClass() 메소드입니다., atom : " + atom);
		
		class Aa {
			int suA = 550;
			
			public Aa() {
				System.out.println("이곳은 Test1클래스 안에 modClass() 메소드 안에 Aa 클래스입니다.");
			}
			
			public void modTest1A() {
				System.out.println("이곳은 Test1클래스 안에 modClass() 메소드 안에 modTest1A 메소드 입니다.");
			}
		}
//		로컬 클래스는 메도스 안에서 생성되기에, 메소드 안에서만 사용 가능하다. 메소드를 벗어나면 클래스는 소멸된다.
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		Aa aa = new Aa();
		System.out.println("중첩클래스(로컬클래스)안에 suA : " + aa.suA);
		aa.modTest1A();
	}
}