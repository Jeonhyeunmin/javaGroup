package t16_thread.multiThread3;

public class T02Run {
	public static void main(String[] args) {
		//	자막객체 생성 실행
		Runnable smiThread = new SMIFile2();
		Thread smith1 = new Thread(smiThread);
		smith1.start();
		
		Runnable screenThread = new ScreenFile2();
		Thread screenTh1 = new Thread(screenThread);
		screenTh1.start();
		
	}
}

//	영상을 처리하는 클래스
class ScreenFile2 implements Runnable {
	@Override
	public void run() {
//	#1. 영상프레임 1~5컷
		int screenArray[] = {1, 2, 3, 4, 5};
	
//	#3. 영상출력
		for(int i = 0; i < screenArray.length; i++) {
			System.out.print("영상프레임 : " + screenArray[i]);
		
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}

//	자막을 처리하는 클래스
class SMIFile2 implements Runnable {
	@Override
	public void run() {
//	#2. 각 프레임에 표시될 자막
		String smiArray[] = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(1);} catch (InterruptedException e) {}
//	#3. 각 프레임에 표시될 자막
		for(int i = 0; i < smiArray.length; i++) {
			System.out.println(" - 자막 : " + smiArray[i]);
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		}
	}
}