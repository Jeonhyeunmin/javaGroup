package t10_abstract.t1;

public class LG extends Phone{

	public LG(String name) {
		//	super. : 메소드 호출 / super. : 생성자호출
		super(name + "LG");
	}

	@Override
	public void function() {
		System.out.println(getName() + "폰은 화질이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName() + "폰은 전화벨소리가 따르릉 입니다.");
	}
	
	@Override
	public void functionLG() {
		System.out.println("이번에 새로 추가된 기능은 만보기가 있습니다.");
	}
	
	
	
}