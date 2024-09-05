package t10_abstract.t0;

public class Cat extends Animal{
	public String talk = "냥 냥 카아아아아아아악 냥!";
	
	void sori() {
		
	}

	@Override
	public void sound() {
		System.out.println("고양이 울음소리는 " + talk);
	}
}