package t08_inheritance;

//	부모
public class T01_P extends T01_J{
	int moeny = 1000;
	
	void mod1(String temp) {
		System.out.println("temp : " + temp);
	}
	
//	절대값 메소드
	int absMod(int su) {
		int res = (su > 0) ? su : su * (-1) ;
		return res;
	}
}
