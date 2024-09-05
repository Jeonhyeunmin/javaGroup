package T09_polymorphism.T2;

//	instanceof : 과거에 부모 객체로 타입 변환이 되었는지를 알아보는 연산자(true / false)
public class Run {
	public static void main(String[] args) {
		Aa aa = new Bb();
		
//		Bb bb = (Bb)aa; (O)
		
//		Cc cc = (Cc)aa;	(X)
		
//		Down Casting을 하기 위해서는 반드시 Up Casting이 선행되어있어야한다.
		if(aa instanceof Bb) {
			Bb bb = (Bb)aa;
			System.out.println("1. Down Casting 성공ㅎㅎㅎㅎㅎㅎㅎ");
		}
		else {
		System.out.println("1. Down Casting 실패 ㅜㅜㅜㅜㅜㅜㅜㅜ");
		}
		
		System.out.println();
		
		if(aa instanceof Cc) {
			Cc cc = (Cc)aa;
			System.out.println("2.Down Casting 성공ㅎㅎㅎㅎㅎㅎㅎ");
		}
		else {
			System.out.println("2.Down Casting 실패 ㅜㅜㅜㅜㅜㅜㅜㅜ");
		}
	}
}
