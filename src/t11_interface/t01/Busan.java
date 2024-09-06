package t11_interface.t01;

//	부산 가고 싶다
public class Busan implements Test1{

	@Override
	public void data() {
		 System.out.println("이곳은 Busan 클래스의 data 메소드 입니다.");
	}

	@Override
	public void data1(int su) {
		System.out.println("이곳은 Busan 클래스의 data1 메소드 입니다.");
		int sound = 0;
		if(su > MAX) {
			sound = MAX;
		}
		else if (su < MIN) {
			sound = MIN;
		}
		System.out.println("sound : " + sound);
	}
}
