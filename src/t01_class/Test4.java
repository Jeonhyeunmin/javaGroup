package t01_class;

public class Test4 {
	public static void main(String[] args) {
		Test1 t11 = new Test1();
		Test1 t12 = new Test1();
		
		if(t11 == t12) {
			System.out.println("t11번 객체와 t12 객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t11번 객체와 t12 객체는 서로 다른 객체입니다.");			
		}
		
		Test1 t13 = t11;
		
		if(t11 == t13) {
			System.out.println("t11번 객체와 t13 객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t11번 객체와 t13 객체는 서로 다른 객체입니다.");			
		}
		
		if(t12 == t13) {
			System.out.println("t12번 객체와 t13 객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t12번 객체와 t13 객체는 서로 다른 객체입니다.");			
		}
		
		Test1 t14 = null;
		if(t13 == t14) {
			System.out.println("t13번 객체와 t14 객체는 같은 객체입니다.");
		}
		else {
			System.out.println("t13번 객체와 t14 객체는 서로 다른 객체입니다.");			
		}
		
		if(t14 == null) {
			System.out.println("t14번 객체의 초기 값은 null입니다.");
		}
		else {
			System.out.println("t14번 객체의 초기 값은 null이 아닙니다.");			
		}
	
//		null은 비교 불가능.
//		if(t14.equals("null")) {
//		if(t14.equals(null)) {
//			System.out.println("t14번 객체의 초기 값은 null입니다.");
//		}
//		else {
//			System.out.println("t14번 객체의 초기 값은 null이 아닙니다.");			
//		}
		
		
		
	}
}