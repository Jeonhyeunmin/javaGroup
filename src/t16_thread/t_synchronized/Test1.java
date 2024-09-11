package t16_thread.t_synchronized;

//	공유객체
class Mydata{
	int data = 10;

	public void plusMethod() {
		int mydata = data;
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		data = mydata + 1;
	}
}

//	공유객체를 사용하는 스레드
class UseMydata extends Thread{
	Mydata myData = new Mydata();
	
	@Override
	public void run() {
		myData.plusMethod();
		System.out.println(getName() + "실행결과 : " + myData.data);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Thread th1 = new UseMydata();
		th1.start();
		
		Thread th2 = new UseMydata();
		th2.start();
		
		Thread th3 = new UseMydata();
		th3.start();
		
	}
}
