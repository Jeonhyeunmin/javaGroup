package t15.API.t02_System;

public class Test1 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		for(i = 0; i < 1000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000 이상 일때의 i 값은? " + i);
				break;
			}
		}
		System.out.println("tot : " + tot);
	}
}
