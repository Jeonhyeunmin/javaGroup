package t10_abstract.t1;

public class Run3 {
	public static void main(String[] args) {
//		Phone samsungPhone = new Samsung("홍길동");
//		samsungPhone.powerOn();
//		samsungPhone.sound();
//		samsungPhone.function();
//		samsungPhone.functionSamsung();	
//		samsungPhone.powerOff();
//		System.out.println();
//		
//		Phone LGPhone = new LG("김말숙");	// LG에 김말숙 들어감
//		LGPhone.powerOn();	// 추상클래스에 있음
//		LGPhone.sound();	// 오버라이드
//		LGPhone.function();	// 오버라이드
//		LGPhone.functionLG();	// 오버라이드	
//		LGPhone.powerOff();	// 추상클래스에 있음
//		System.out.println();
		
		Phone phone[] = {new Samsung("홍길동"), new LG("김말숙")};
		for(int i = 0; i < phone.length; i++) {
			phone[i].powerOn();
			phone[i].sound();
			phone[i].function();
			phone[i].powerOff();
			System.out.println();
		}
	}
}
