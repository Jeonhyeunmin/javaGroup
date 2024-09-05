package T09_polymorphism.T1;

public class T2Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		System.out.println();
		
		
//		Cc cc = a1;	//	처음부터 부모객체가 자식 객체로타입 변환될 수 없다
		
//		부모객체가 자식 객체로 타입 변환 하기 위해서는
//		무조건 자식 객체가 부모타입으로 변환했을때만 가능하다.(강제 casting)
		
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("su : " + bb.su);
		System.out.println();
		
		Aa a1 = bb;
		System.out.println("su : " + a1.su);
		System.out.println();
		
		Bb b1 = (Bb) a1;
		System.out.println("su : " + a1.su);
		System.out.println();
		
		Aa a2 = new Dd();	// a2란 이름으로 Dd 객채를 생성하는데 타입을 Aa로 바꾼다.
		System.out.println();
		
		System.out.println("1. su : " + a2.su);
		System.out.println();
		
		Dd d1 = (Dd) a2;	//	d1이란 이름으로 a2를 생성(a2는 d의 부모 클래스)하는데 Dd 타입으로 다운한다. 
		System.out.println("2. su : " + d1.su);
		System.out.println();
		
		Bb b2 = (Bb) a2;
		System.out.println("3. su : " + b2.su);
		System.out.println();
		
		b2.modAa();
		System.out.println();
		
//		Cc c1 = (Cc) a2;
//		System.out.println("su : " + c1.su); 		//	타입 변환 오류 a2는 Dd 타입으로 변환되었다
//		System.out.println();										//	그래서 Cc 타입으로 다시 변환할 수 없음(Dd 와 Cc는 상속으로 연관이 없음)
		
//		Override 적용 시
//		같은 함수가 있으면 자식 클래스에 있는 함수 사용 아니면 부모클래스 함수 사용
//		a3 라는 이름으로 Bb 객체를 생성하는데 타입은 Aa
		Aa a3 = new Bb();	//	Up Casting
		System.out.println("4. su : " + a3.su);
		a3.modAa();
		System.out.println();
		
//		b3라는 이름으로 a3 객체를 생성하는데 a3는 이미 Aa 객체 (강제캐스팅)
		Bb b3 = (Bb) a3;	//	Down Casting
		System.out.println("5. su : " + b3.su);
		
		b3.modAa();
	}
}