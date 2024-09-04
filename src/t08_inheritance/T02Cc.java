package t08_inheritance;

public class T02Cc extends T02Bb{
//	매개변수(flag)에 1이 오면 사각형 처리, 2가 오면 원을 처리.
	void prn(int r, String ans, int res, double res2) {
		String str;
		if(ans.equals("a")) {
			str = "넓이";
		}
		else {
			str = "둘레";
		}
		if(r == 1) {
			System.out.println("사각형의 " + str + "는(은)" + res + "입니다.");
		}
		if(r == 2) {
			System.out.println("원의 " + str + "는(은)" + res2 + "입니다.");
		}
	}
}