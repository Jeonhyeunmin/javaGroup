package t16_thread.Properties;

public class Test1 {
	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println("1. 현재 스레드 명 : " + thread.getName());
		System.out.println("1. 현재 동작하는 스레드 갯수 : " + thread.activeCount());
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("2. 스레드 명 : " + th.getName());		
		}
		System.out.println("2. 현재 동작하는 스레드 갯수 : " + thread.activeCount());
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			Thread th = new Thread();
			th.setName(i + "번째 스레드");
			th.start();
			System.out.println("3. 스레드 명 : " + th.getName());		
		}
		System.out.println("3. 현재 동작하는 스레드 갯수 : " + thread.activeCount());
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			Thread th = new Thread();
			th.start();
			System.out.println("4. 스레드 명 : " + th.getName());		
		}
		System.out.println("4. 현재 동작하는 스레드 갯수 : " + thread.activeCount());
		System.out.println();
	}
}
