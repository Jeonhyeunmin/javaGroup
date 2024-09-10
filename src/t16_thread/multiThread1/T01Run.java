package t16_thread.multiThread1;

public class T01Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스 명 : T01Run");
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
		System.out.println();
		
		Thread t1 = new T01();
		t1.start();
		
		try {
			Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("--------------------------------------------------");
		System.out.println("현재 클래스 명 : T01Run");
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
		System.out.println("--------------------------------------------------");
	}
}

class T01 extends Thread {
	@Override
	public void run() {
		System.out.println("1. 현재 클래스명 : T01");
		System.out.println("1. 현재 실행중인 스레드명? " + Thread.currentThread().getName());
		
//		for(long i = 0; i < 10000000000L; i++) {}
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		System.out.println("2. 현재 클래스명 : T01");
		System.out.println("2. 현재 실행중인 스레드명? " + Thread.currentThread().getName());
		System.out.println("2. 현재 실행중인 스레드명? " + Thread.currentThread().getName() + "스레드가 종료됩니다.");
	}
}