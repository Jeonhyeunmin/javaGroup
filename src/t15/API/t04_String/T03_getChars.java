package t15.API.t04_String;

public class T03_getChars {
	public static void main(String[] args) {
		String str1 = "Hello!";
		
		char strArr[] = new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0);	//	배열복사와 같은 개념.
		System.out.println("strArr : " + strArr);
		
		String temp = "";
		for(char str : strArr) {	//	향상된 for문 : (변수타입 변수명 : 배열) - 변수명에 배열에 넣고 출력한다..?
			temp += str + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0,temp.length()-1));
	}
}