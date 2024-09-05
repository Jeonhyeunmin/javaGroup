package t10_abstract.t0;

/*
	추상클래스(팀 프로젝트 작업을 위한 작업지시서로서의 역할을 하는 클래스)
	- 만드는 방법 : 클래스명 앞에 'abstract'를 붙여준다.
	- 의미 : 작업지시서로서의 역할을 한다. 따라서 작업에 필요한 공통적인 사항(필드, 메소드)를 정의해준다.
	(추상클래스에서 가져가서 오버라이드 해서 사용하면 됨.)
	즉, 추상메소드만 정의할 뿐 실체 내용(구현내용)은 직접 작성해야함(기술하지 않는다) - 실제로 사용할 코드를 적어주는 중괄호( {} )가 없다.
	- 추상클래스는 생성(new)해서 사용할 수 없다. 즉, 실제로 사용하려면 추상클래스를 상속(extends) 받아서만 사용할 수 있다.
	(이렇게 상속받은 클래스를 실체(구현) 클래스라고 한다.)
*/


public abstract class Animal { // 추상 클래스 : abstract
//	public abstract String talk; // 불가능 실행하는거에만 abstract 붙일 수 있음
	public String talk; //	추상클래스의 필드정의는 이름만 정해주는 역할이다.
	
	public abstract void sound();	//추상 메소드 : 작업 지시를 위해 만드는 메소드로 중괄호가 없음.
	public void move() {
		System.out.println("걸어갑니다");
	}
	public void moving() {
		System.out.println("계속 걸어가는 중입니다");
	}
}