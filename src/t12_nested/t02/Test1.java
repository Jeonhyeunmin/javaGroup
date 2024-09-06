package t12_nested.t02;


//	중첩클래스 : 정적 멤버 클래스
public class Test1 {
	int su = 300;
	
	public Test1() {
		System.out.println("이곳은 Test1 클래스 입니다.");
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1 클래스의 modTest1() 메소드입니다 입니다.");		
	}
	
	public static class Aa{
		int suA = 400;
		static int suB = 450;
		
		public Aa() {
			System.out.println("이곳은 Test1의 중첩클래스 Aa의 기본 생성자입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Test1의 중첩클래스의 monTest1A() 메소드입니다.");
		}
		
		public static void modTest1B() {
			System.out.println("이곳은 Test1의 중첩클래스의 monTest1B() 메소드입니다.");
		}
	}
	
	public class Bb{
		
	}
}

class Aa{
	public Aa() {
		System.out.println("이곳은 Aa 클래스 입니다.");
	}
}