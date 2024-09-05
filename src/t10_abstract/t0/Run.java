package t10_abstract.t0;

public class Run {
	public static void main(String[] args) {
//		new Animal();	//	추상클래스는 생성 불가능
		Dog dog = new Dog("멍멍");
		
		dog.sound();
		System.out.println();
		dog.work();
		System.out.println();
		
		Cat cat = new Cat();
		
		cat.sound();
		
	}
}
