package t11_interface.t05;

public class Test2Run {
	public static void main(String[] args) {
		
//	원래 인터페이스는 생성을 못하지만 아래같은 방식으로 생성할 수 있음.		
		Test2 t22 = new Test2() {
			int atom = 20;
			
//		추상클래스에서 만든 클래스는 오버라이딩 할 때 public을 적어줘야함
			@Override
			public void abc() {
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t22익명 객체의 abc() 메소드 입니다.");
				System.out.println("AA : " + AA + " / atom : " + atom + " / temp : " + temp);
			}
		};
		Test2 t23 = new Test2() {
			int atom = 40;
			
//		추상클래스에서 만든 클래스는 오버라이딩 할 때 public을 적어줘야함
			@Override
			public void abc() {
				int temp = atom;
				System.out.println("이곳은 Test2Run 클래스의 t23익명 객체의 abc() 메소드 입니다.");
				System.out.println("AA : " + AA + " / atom : " + atom + " / temp : " + temp);
			}
		};
		
		
		
//		익명 객체 안에 메소드 접근(호출)하기
//		인터페이스 변수로 익명 객체안에 필드와 일반 변수는 접근 불가이다.
//		t22.atom;	<< 불가능
		t22.abc();
		System.out.println();
		t23.abc();
		
		if(t22 == t23) {
			System.out.println("같은 객체");
		}
		else{
			System.out.println("같은 객체");
		}
	}
}
