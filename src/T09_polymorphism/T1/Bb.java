package T09_polymorphism.T1;

public class Bb extends Aa{
public int su = 20;
	
	public Bb() {
		System.out.println("이곳은 Bb 기본생성자 입니다.");
	}
			
	private void modBb() {
		System.out.println("이곳은 Bb 클래스의 modBb 메소드 입니다. 입니다.");		
	}
	
	@Override
	public void modAa() {
		System.out.println("이곳은 Bb 클래스의 modAa 메소드 입니다. 입니다.");		
	}
}
