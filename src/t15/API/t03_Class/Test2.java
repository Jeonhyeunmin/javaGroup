package t15.API.t03_Class;

public class Test2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			
//			객체의 정보(Test1.class)알아내서 출력하기
			Class clazz = Test1.class;
			System.out.println("패키지명 + 파일명 : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("simple : " + clazz.getSimpleName());
			
			Class imgPath = Test2.class;
			System.out.println("Test2.class의 경로 : " + clazz.getResource("Test2.class").getPath());
			System.out.println("Test2.class의 경로 : " + imgPath.getResource("Test2.class").getPath());
			System.out.println("그림파일의 경로(1.jpg) : " + imgPath.getResource("1.png").getPath());
			System.out.println("그림파일의 경로(11.jpg) : " + imgPath.getResource("./images/11.png").getPath());
			System.out.println("현재 작업 경로의 루트(/) : " + imgPath.getResource("/").getPath());
			System.out.println();
			
			System.out.println("패키지를 통한 경로 : " + imgPath.getResource("/t15.API/t03_Class/images/12.png"));
			
		} catch (ClassNotFoundException e) {
			System.out.println("String 클래스가 존재하지 않습니다." + e.getMessage());
		}
		System.out.println("작업 끝");
	}
}
