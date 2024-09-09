package t15.API.t06_Math;

import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		System.out.println();
		
//		(random.nextInt(끝값 + 1 - 시작값) + 시작값));
		System.out.println("0~9 정수 : " + random.nextInt(10));
		System.out.println("1~10 정수 : " + (random.nextInt(10)+1));
		System.out.println("5~10 정수 : " + (random.nextInt(10+1-5)+5));
		System.out.println();
		
		Random rnd = new Random();
		for(int i = 0; i < 6; i++) {
			System.out.print(rnd.nextInt(45)+1 + " ");
		}
	}
}