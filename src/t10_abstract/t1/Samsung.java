package t10_abstract.t1;

public class Samsung extends Phone{

	public Samsung(String name) {
		super(name + "삼성");
	}

	@Override
	public void function() {
		System.out.println(getName() + "폰은 삼성페이 기능이 우수합니다.");
	}

	@Override
	public void sound() {
		System.out.println(getName() + "폰은 벨소리가 띵 띠리 띵띠리리띠리 띠리리리 리 입니다.");		
	}

	
	@Override
	public void functionSamsung() {
		System.out.println("이번에 추가된 기능은 AI 통역 기능입니다.");
	}
}
