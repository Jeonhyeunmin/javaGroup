package t18_Collection.t11_ex;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class t02_Lotto2 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<Integer>();
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
	}
}