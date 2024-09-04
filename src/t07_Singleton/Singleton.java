package t07_Singleton;

public class Singleton {
	// 2. 정적 필드(자신의 객체 타입)를 선언하고, 초기값으로 객체를 생성시킨다.
	private static Singleton singleton = new Singleton();
	// 자신의 클래스를 정적필드에 등록하고 private로 다른 클래스에서 접근 못하게 막음
	
	//	1. 객체를 외부에서 생성하지 못하도록 생성자 앞에 접근 제한자를 public > private로 변경
	private Singleton() {}
	//	기본 생성자 호출을 못하게 private로 막음
	
	//	3. 외부에서 호출하여 사용할 수 있는 정적 메소드(Getter)를 만든다.
	static Singleton getInstance() {
		return singleton;
	}
	//	get 함수로만 여기에 접근할 수 있도록 함. 
}