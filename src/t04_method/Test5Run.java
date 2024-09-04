package t04_method;

import java.util.Scanner;

public class Test5Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test5 t5 = new Test5(5);

		while (true) {
			if (t5.vol > 0 && t5.vol < 10) {
				System.out.println("볼륨을 설정해주세요 (+ / -, 종료 버튼은 0)");
				String vol = sc.next();
				if (vol.equals("+")) {
					t5.volUp();
				}
				else if (vol.equals("-")) {
					t5.volDown();
				}
				else if(vol.equals("0")) {
					break;
				}
			}
			else {
				break;
			}
		}

		System.out.println("작업 끝");

		sc.close();
	}
}
