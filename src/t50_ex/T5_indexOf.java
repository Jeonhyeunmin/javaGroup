package t50_ex;

import java.util.Scanner;

/*
	단어(문장)을 입력받은 후, 입력받은 글자 중에서 특정 문자가 어디 / 어디에 위치하고 있는지를 출력하시오.
	예) 문장 : Welcome to Korea!
		찾고자하는 알파벳 : o
		o를 포함하고 있는 갯수 : 3
		o가 위치한 곳 : 4 / 9 / 12
*/
public class T5_indexOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String index = "";
		int cnt = 0;
		
		System.out.println("문장을 입력하세요.");
		String msg = sc.nextLine();
		System.out.println("찾을 문자를 입력하세요.");
		char find = sc.next().charAt(0);
		
		char msgArr[] = new char[msg.length()];
		msg.getChars(0, msg.length(), msgArr, 0);
		
		for(int i = 0 ; i < msgArr.length; i++) {
			if(find == msgArr[i]) {
				index += i + " / ";
				cnt++;
			}
		}
		System.out.println(find + "를 포함하고 있는 갯수 : " + cnt + "개");
		System.out.println(find + "가 위치한 곳 : " + index.substring(0,index.length()-2));
		System.out.println();
		sc.close();
	}
}