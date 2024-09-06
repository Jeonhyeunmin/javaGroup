package t11_interface.t02;

public class Airplane implements Toy {
	private int age = 16;	// 숙제에 활용

	@Override
	public void age() {
		System.out.println(age + "세 이상만 사용하실 수 있습니다.");
	}

	@Override
	public void moving() {}

	@Override
	public void fire() {}

	@Override
	public void missile() {
		System.out.println("미사일 발사 기능이 있습니다.");				
	}

	@Override
	public void possibleAge(int age) {
		
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : " + name);		
	}
}