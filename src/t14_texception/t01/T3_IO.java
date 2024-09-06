package t14_texception.t01;

import java.io.IOException;
import java.io.InputStreamReader;

public class T3_IO {
	public static void main(String[] args) {
		
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			
			while(true) {
			System.out.println("업로드할 파일명을 입력하세요.(종료시 0번 입력)");
			char ch = (char) is.read();
			if(ch == '0') {
				break;
			}
			int intCh = ch;
			System.out.println(ch + ": 파일을 정상적으로 읽었습니다. intCh = " + intCh);
			}
		} catch (IOException e) {
			System.out.println("파일 읽기 실패.");
			e.printStackTrace();
		}
		System.out.println("작업 종료");
	}
}