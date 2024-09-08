package t50_ex.t1;

public class chef implements Action{

	@Override
	public void catching() {}

	@Override
	public void search() {}

	@Override
	public void fire() {}

	@Override
	public void rescue() {}

	@Override
	public void pizza() {
		System.out.println("피자를 굽습니다.");				
	}

	@Override
	public void pasta() {
		System.out.println("스파게티 요리를 합니다.");		
	}
}
