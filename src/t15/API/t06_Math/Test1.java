package t15.API.t06_Math;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int su1 = 100;
		int su2 = -100;
		
		// 절대값 : Math.abs()
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		System.out.println("Math.abs(su2) : " + Math.abs(su2));
		
		double d1 = 1234.5678;
		double d2 = -1234.5678;
		
		//	반올림 : Math.round() - 무조건 정수형 반올림
		
		System.out.println("d1" + d1);
		System.out.println("d2" + d2);
		System.out.println("Math.round(d1)" + Math.round(d1));
		System.out.println("Math.round(d2)" + Math.round(d2));
		
		// 소수 첫째 자리에서의 반올림 : 1234.567 + 0.5 = (int)1235.067 = 1235
		// 소수 둘째 자리에서의 반올림 : 1234.567 + 0.05 = 1234.617 * 10 = (int)12346.17 = 12346 / 10 = 1234.6
		System.out.println("소수 둘째 자리에서의 반올림 : " + (Math.round(d1*10))/10.0);
		System.out.println("소수 셋째 자리에서의 반올림" + (Math.round(d1*100))/100.0);
		System.out.println();
		
		// String.format("%.nf", 실수);
		System.out.println(String.format("%.0f", d1));
		System.out.println(String.format("%.1f", d1));
		System.out.println(String.format("%.2f", d1));
		
		//	소수부 무조건 올림 : Math.ceil()
		System.out.println("1. cell()" + Math.ceil(d1));
		double d3 = 123.45;
		System.out.println("2. cell()" + Math.ceil(d3));
		//	소수이하 둘째자리에서 무조건 올림
		System.out.println("3. cell() * 10 / 10" + Math.ceil(d1 * 10) / 10);
		System.out.println();
		
		// 소수부 무조건 내림 : floor()
		System.out.println("1.floor() : " + Math.floor(d1));
		System.out.println("2.floor() : " + Math.floor(d3));
		//소수이하 둘째자리에서 무조건 올림
		System.out.println("3.floor() * 10 / 10 : " + Math.floor(d1 * 10) / 10);
		
		//최대값(max()), 최소값(min())
		double d4 = 345.678;
		System.out.println("max() : " + Math.max(d3, d4));
		System.out.println("min() : " + Math.min(d3, d4));
		System.out.println();
		
		//	난수 : Math.random() : 0 ~ 1 미만의 실수형 난수, (int)(Math.random() * (끝 + 1 - 시작) + 시작)
		
		System.out.println("0~1미만의 실수형 난수 : " + Math.random());
		System.out.println("1~100까지의 정수형 난수 : " + (int)((Math.random()*100)+1));
		System.out.println("5~10까지의 정수형 난수 : " + (int)((Math.random()*(10+1-5))+5));
		
	}
}