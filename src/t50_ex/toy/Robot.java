package t50_ex.toy;

public class Robot implements Toy {
	private int age = 8;	// 숙제에 활용

	@Override
	public void age() {
		System.out.println(age + "세 이상만 사용하실 수 있습니다.");
	}

	@Override
	public void moving() {
		System.out.println("팔 / 다리가 모두 움직일 수 있습니다.");
	}

	@Override
	public void fire() {
		System.out.println("레이저빔 발사 기능이 있습니다.");		
	}

	@Override
	public void missile() {}

	@Override
	public int possibleAge(int age) {
		return age;
	}

	@Override
	public void product(String name) {
		System.out.println("장난감 이름 : " + name);		
	}
}