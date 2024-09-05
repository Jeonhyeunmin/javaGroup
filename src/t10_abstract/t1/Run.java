package t10_abstract.t1;

public class Run {
	public static void main(String[] args) {
		Samsung samsungPhone = new Samsung("홍길동");
		samsungPhone.powerOn();
		samsungPhone.sound();
		samsungPhone.function();
		samsungPhone.functionSamsung();	
		samsungPhone.powerOff();
		System.out.println();
		
		LG LGPhone = new LG("김말숙");
		LGPhone.powerOn();
		LGPhone.sound();
		LGPhone.function();
		LGPhone.functionSamsung();	
		LGPhone.powerOff();
		System.out.println();
	}
}