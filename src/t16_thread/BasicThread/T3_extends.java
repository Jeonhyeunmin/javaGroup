package t16_thread.BasicThread;

//	Thread 클래스를 상속받아서 클래스를 정의한다.
public class T3_extends {
	public static void main(String[] args) {
		System.out.println("현재 실행중인 스레드 명 : " + Thread.currentThread().getName());
		MyThread1 mt1 = new MyThread1();	//	3. 스레드 객체를 상속받은 객체를 생성
		mt1.start();	// 4. start 메소드 안에 run메소드 호출하는 내용이 들어있으니 start() 메소드를 호출!
	}
}

class MyThread1 extends Thread {	//	1. Thread 클래스를 상속한 클래스 정의
	@Override
	public void run() {	//	2. run메소드를 오버라이드하여 스레드 처리에 필요한 코드를 작성.
		System.out.println("스레드 명 : " + this.getName());	//	실행되는 스레드의 이름은 자동적으로 JVM Thread-0,1,.. 붙여줌
		System.out.println();
	}
}