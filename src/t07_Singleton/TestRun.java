package t07_Singleton;

public class TestRun {
	public static void main(String[] args) {
//		new Singleton();
//		Singleton.singleton;
		
		Singleton kbs = Singleton.getInstance();
		Singleton mbc = Singleton.getInstance();
		Singleton sbs = Singleton.getInstance();
		
		if(kbs == mbc) {
			System.out.println("kbs와 mbc는 서로 같은 객체를 가르키고 있습니다.");
		}
		else {
			System.out.println("kbs와 mbc는 서로 다른 객체를 가르키고 있습니다.");
		}
		if(mbc == sbs) {
			System.out.println("kbs와 mbc는 서로 같은 객체를 가르키고 있습니다.");
		}
		else {
			System.out.println("kbs와 mbc는 서로 다른 객체를 가르키고 있습니다.");
		} 
	}
}