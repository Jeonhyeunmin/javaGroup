package t15.API.t02_System;

public class Test2 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for(i = 0; i < 1000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000 이상 일때의 i 값은? " + i);
//				break;
				return;	//	밑에를 수행하지 않고 바로 끝냄
			}
		}
		System.out.println("tot : " + tot);
	}
}
