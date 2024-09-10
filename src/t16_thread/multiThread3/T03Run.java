package t16_thread.multiThread3;

public class T03Run {
	public static void main(String[] args) {
		Thread screenTh1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//			#1. 영상프레임 1~5컷
				int screenArray[] = {1, 2, 3, 4, 5};
				
//			#3. 영상출력
				for(int i = 0; i < screenArray.length; i++) {
					System.out.print("영상프레임 : " + screenArray[i]);
					
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
			}
		});
		
		//	자막을 출력하는 스레드를 '익명이너클래스'로 구현한다
		Thread smiTh1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
//			#2. 각 프레임에 표시될 자막
				String smiArray[] = {"하나", "둘", "셋", "넷", "다섯"};
				try {Thread.sleep(1);} catch (InterruptedException e) {}
//			#3. 각 프레임에 표시될 자막
				for(int i = 0; i < smiArray.length; i++) {
					System.out.println(" - 자막 : " + smiArray[i]);
					try {Thread.sleep(500);} catch (InterruptedException e) {}
				}
			}
		});
		
		
		
		screenTh1.start();
		smiTh1.start();
	}
}