package t16_thread.Properties;

//	Jvm은 메인스레드가 끝나도 데몬스레드가 실행중이면 끝날 때까지 기다려준다.
//	데몬스레드를 메인스레드에 종속시켜 작업하게되면 메인스레드가 끝나면 데몬스레든ㄴ 작업량이 남아있어도 강제 종료한다.
//	일반스레드의 setEdamon은 false, setDaemon을 true로 하면 메인스레드에 데몬스레드는 종속적이게 된다.
public class Test4 {
		public static void main(String[] args) {
			Thread myThread3 = new MyThread2();
			myThread3.setDaemon(true);	//	메인스레드에 종속된다.
			myThread3.setName("myThread3");
			myThread3.start();
			
//			메인스레드를 3초간 지연처리 후 종료시켜보자.
			try {Thread.sleep(3000);} catch (InterruptedException e) {}
			System.out.println("main 스레드 종료");
		}
}

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println(getName() + " : " + (isDaemon() ? "데몬스레드" : "일반스레드"));
		for(int i = 0; i < 5; i ++) {
			System.out.println(getName() + " : " + i);
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}