package t16_thread.Properties;

//	스레드 우선 순위
public class Test2 {
	public static void main(String[] args) {
//		CPU core 수 가져오기
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + ". 번째");
			Thread thread = new MyThread();
			thread.start();
		}
		System.out.println("===========================================");
		
		//	스레드 우선 순위 지정(변경) - 우선 순위 숫자가 높을 수록 우선 순위가 더 빠르다 '높다/빠르다' 10번이 최고 빠름.
		for(int i = 0; i < 15; i++) {
			System.out.println(i + "번째");
			Thread thread = new MyThread();
			if(i == 7) {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
		
		System.out.println("main Thread 작업 끝");
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		try {Thread.sleep(400);} catch (Exception e) {}
		System.out.println(getName() + "우선 순위 : " + getPriority());	//	기본 우선순위는 모두 5이다.
		System.out.println();
	}
}