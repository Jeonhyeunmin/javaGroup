package t11_interface.t01;

//implements는 인터페이스를 상속받는다는 느낌
public class Seoul implements Test1{

	
	// 인터페이스에 추상메소드가 한개밖에 없음
	@Override
	public void data() {
		System.out.println("이곳은 Seoul 클래스의 data 메소드 입니다.");
	}

	@Override
	public void data1(int su) {}	
	
}