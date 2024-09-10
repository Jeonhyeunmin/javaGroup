package t16_thread.multiThread1;

public class T02Run {
	public static void main(String[] args) {
		System.out.println("현재 클래스 명 : T02Run");
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
		System.out.println();
		
		Runnable th2 = new T02();
		Thread thread = new Thread(th2);
		thread.start();
		
		try {
			Thread.sleep(2000);} catch (InterruptedException e) {}
		System.out.println("--------------------------------------------------");
		System.out.println("현재 클래스 명 : T01Run");
		System.out.println("현재 스레드 명 : " + Thread.currentThread().getName());
		System.out.println("--------------------------------------------------");
		
	}
}

class T02 implements Runnable{

	@Override
	public void run() {
		System.out.println("1. 현재 클래스명 : T02");
		System.out.println("1. 현재 실행중인 스레드명? " + Thread.currentThread().getName());
		
		for(int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
		System.out.println("2. 현재 클래스명 : T02");
		System.out.println("2. 현재 실행중인 스레드명? " + Thread.currentThread().getName());
		System.out.println("2. 현재 실행중인 스레드명? " + Thread.currentThread().getName() + "스레드가 종료됩니다.");
	}
	
}