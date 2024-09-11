package t18_Collection.t11_ex;

import java.util.HashSet;
import java.util.Random;

public class t02_Lotto {
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		Random random = new Random();
		
		while(true) {
			lotto.add(random.nextInt(45)+1);
			if(lotto.size() == 6) {
				break;
			}
		}
		System.out.println("금주의 로또 번호는?");
		System.out.println(lotto);
		for(int su : lotto){
			System.out.print(su + "/");
		}
//		for(int i = 0; i < 5; i ++) {
//			for(int j = i+1; j <= 6; j++) {
//				if() {
//					
//				}
//			}
//		}
	}
}