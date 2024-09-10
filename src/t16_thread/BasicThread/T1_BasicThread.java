package t16_thread.BasicThread;

//	Single Thread
public class T1_BasicThread {
	public static void main(String[] args) {
		System.out.println("모든 실행클래스는 main 스레드 1개를 갖는다.");
		System.out.println("현재 실행중인 스레드 명 : " + Thread.currentThread().getName());
	}
}