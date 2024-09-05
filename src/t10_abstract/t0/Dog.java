package t10_abstract.t0;

public class Dog extends Animal{
	public String talk = "멍멍 크르르르르릉 캉!";
	
	public Dog(String talk) {
		this.talk = talk;
	}
	
	void cry() {
		
	}

	@Override
	public void sound() {
		System.out.println("강아지 울음소리는 " + talk);		
	}
	
	public void work() {
		sound();
		move();
	}
}