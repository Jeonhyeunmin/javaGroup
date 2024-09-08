package t14_exception.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T2_FileNotFound {
	public static void main(String[] args) {
		

			try {
				FileInputStream fis = new FileInputStream("test.txt");
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
					System.out.println(e.getMessage());
			}
		System.out.println("작업 끝");
	}
}