package t08_inheritance;

import t08_inheritance.mbc.T111;

public class T05_P extends T111{
	private double pi = 3.14;
	
	void areaCircle(int r) {
		double area = r * r *pi;
		System.out.println("원넓이 : " + area);
	}
	
	
//	final void div(int su1, int su2) { 앞에 final 붙이면 오버라이드 불가능
	void div(int su1, int su2) {
		int res = su1 / su2;
		System.out.println("res : " + res);
	}
}