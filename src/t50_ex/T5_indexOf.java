package t50_ex;

/*
	단어(문장)을 입력받은 후, 입력받은 글자 중에서 특정 문자가 어디 / 어디에 위치하고 있는지를 출력하시오.
	예) 문장 : Welcome to Korea!
		찾고자하는 알파벳 : o
		o를 포함하고 있는 갯수 : 3
		o가 위치한 곳 : 4 / 9 / 12

*/
public class T5_indexOf {
	public static void main(String[] args) {
		String msg1 = "Welcome to Korea!";
		
		System.out.println(msg1.indexOf("o"));
		System.out.println(msg1.indexOf("o", msg1.indexOf("o")+1));
		System.out.println(msg1.indexOf("o", msg1.indexOf("o")+msg1.indexOf("o")+2));
		
	}
}
