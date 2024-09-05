package t10_abstract.t2;

import java.util.Scanner;

public class BunsikRun2 {
	public static void main(String[] args) {
		Bonsa bonsa[] = {new WangjaBunsik(), new WoojuBunsik(), new SeoulBunsik()};
		
		for(int i = 0; i < bonsa.length; i++) {
			bonsa[i].getShopName();
			bonsa[i].kimchi();
			bonsa[i].budae();
			bonsa[i].bibim();
			bonsa[i].sundae();
			bonsa[i].konggi();
			System.out.println();
		}
		
		
	}
}