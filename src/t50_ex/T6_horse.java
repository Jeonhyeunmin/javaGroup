package t50_ex;

import java.util.Random;
import java.util.Scanner;

/*
	1. 말 선택
	2. 배팅
	3. 출발~ 하면 말이 달림
	4. 순위가 나오고
	5. 배팅금에 %로 돌려줌
	1번 말 200 / 2번 말 150 / 3번 말 100 / 4, 5 0	
 */

public class T6_horse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String horseList[] = { "1번말", "2번말", "3번말", "4번말", "5번말" };
		double odds[] = { 0.2, 0.15, 0.1, 0, 0 };
		int totalPrice = 0;
		String horse[] = new String[1];

		System.out.println("배팅하실 말을 선택해주세요");
		System.out.println();
		System.out.println("|	1번말		|		2번말		|	3번말		|		4번말		|		5번말		|");
		System.out.println("|	200%		|		150%		|	100%		|		0%		|		0%		|");
		String choice = sc.next();
		System.out.println("배팅하실 금액을 선택해주세요");
		int money = sc.nextInt();
		System.out.println(
				"============================================================== 시작 ==============================================================");

		Thread horse1 = new Thread(new Runnable() {
			@Override
			public void run() {
				int rand = random.nextInt(10);
				String arr = "";
				for (int i = 0; i < 100; i++) {
					try {Thread.sleep(100);} catch (InterruptedException e) {}
					arr += ">";
					if (rand < i) {
						System.out.print("1번말 : " + rand + "%" + arr + "\n");
						rand += i;
					}
				}
				System.out.println("1번말 : 100%" + arr + "완주");
				if (horse[0] == null) {
					horse[0] = "1번말";
				}
			}
		});

		Thread horse2 = new Thread(new Runnable() {
			@Override
			public void run() {
				int rand = random.nextInt(10);
				String arr = "";
				for (int i = 0; i < 100; i++) {
					try {Thread.sleep(100);} catch (InterruptedException e) {}
					arr += ">";
					if (rand < i) {
						System.out.print("2번말 : " + i + "%" + arr + "\n");
						rand += i;
					}
				}
				System.out.println("2번말 : 100%" + arr + "완주");
				if (horse[0] == null) {
					horse[0] = "2번말";
				}
			}
		});

		Thread horse3 = new Thread(new Runnable() {
			@Override
			public void run() {
				int rand = random.nextInt(10);
				String arr = "";
				for (int i = 0; i < 100; i++) {
					try {Thread.sleep(100);} catch (InterruptedException e) {}
					arr += ">";
					if (rand < i) {
						System.out.print("3번말 : " + i + "%" + arr + "\n");
						rand += i;
					}
				}
				System.out.println("3번말 : 100%" + arr + "완주");
				if (horse[0] == null) {
					horse[0] = "3번말";
				}
			}
		});

		Thread horse4 = new Thread(new Runnable() {
			@Override
			public void run() {
				int rand = random.nextInt(10);
				String arr = "";
				for (int i = 0; i < 100; i++) {
					try {Thread.sleep(100);} catch (InterruptedException e) {}
					arr += ">";
					if (rand < i) {
						System.out.print("4번말 : " + i + "%" + arr + "\n");
						rand += i;
					}
				}
				System.out.println("4번말 : 100%" + arr + "완주");
				if (horse[0] == null) {
					horse[0] = "4번말";
				}
			}
		});

		Thread horse5 = new Thread(new Runnable() {
			@Override
			public void run() {
				int rand = random.nextInt(10);
				String arr = "";
				for (int i = 0; i < 100; i++) {
					try {Thread.sleep(100);} catch (InterruptedException e) {}
					arr += ">";
					if (rand < i) {
						System.out.print("5번말 : " + i + "%" + arr + "\n");
						rand += i;
					}
				}
				System.out.println("5번말 : 100%" + arr + "완주");
				if (horse[0] == null) {
					horse[0] = "5번말";
				}
			}
		});

		horse1.start();
		horse2.start();
		horse3.start();
		horse4.start();
		horse5.start();
		try {Thread.sleep(10500);} catch (InterruptedException e) {}
		
		System.out.println("============================================================== 종료 ==============================================================");
		System.out.println("1등 말은 " + horse[0] + "입니다.");
		if (choice.equals(horse[0])) {
			for (int i = 0; i < horseList.length; i++) {
				if (horseList[i].equals(choice)) {
					totalPrice = (int) (money + (odds[i] * money));
					System.out.println("1등 말을 맞추셨습니다. 돌려받으실 금액은 " + totalPrice + "입니다.");
				}
			}
		} else {
			System.out.println("1등말을 맞추지 못하셨습니다.");
		}
		sc.close();
	}
}