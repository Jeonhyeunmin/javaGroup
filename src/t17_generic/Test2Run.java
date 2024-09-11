package t17_generic;

public class Test2Run {
	public static void main(String[] args) {
		Test2VO t2vo = new Test2VO();
		
		t2vo.setName("홍길동");
		t2vo.setAge(20);
		t2vo.setGender(true);
		t2vo.setSu(100);
		
		System.out.println(t2vo.getName());
		System.out.println(t2vo.getAge());
		System.out.println(t2vo.isGender() ? "남성" : "여성");
		System.out.println(t2vo.getSu());
	}
}