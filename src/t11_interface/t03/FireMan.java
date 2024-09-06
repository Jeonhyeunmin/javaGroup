package t11_interface.t03;

public class FireMan implements Action{

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {
		System.out.println("불을 꺼요");
	}

	@Override
	public void rescue() {
		System.out.println("인명구조를 해요");
	}

	@Override
	public void pizza() {}

	@Override
	public void pasta() {}

}
