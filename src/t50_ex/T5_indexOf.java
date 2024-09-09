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
		String index = "";
		int cnt = 0;
		String msg = "Welcome to Korea!";
		char msgArr[] = new char[msg.length()];
		msg.getChars(0, msg.length(), msgArr, 0);
		
		for(int i = 0 ; i < msgArr.length; i++) {
			if(msgArr[i] == 'o') {
				index += i + " / ";
				cnt++;
			}
		}
		System.out.println("'o'을 포함하고 있는 갯수 : " + cnt + "개");
		System.out.println("'o'가 위치한 곳 : " + index.substring(0,index.length()-2));
	}
}