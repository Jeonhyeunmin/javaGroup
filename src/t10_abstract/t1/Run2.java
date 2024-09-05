package t10_abstract.t1;

public class Run2 {
	public static void main(String[] args) {
		Phone samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();	
		samsungPhone.powerOff();
		System.out.println();
		
		Phone LGPhone = new LG("김말숙");	// LG에 김말숙 들어감
		LGPhone.powerOn();	// 추상클래스에 있음
		LGPhone.sound();	// 오버라이드
		LGPhone.function();	// 오버라이드
		LGPhone.functionLG();	// 오버라이드	
		LGPhone.powerOff();	// 추상클래스에 있음
		System.out.println();
	}
}
