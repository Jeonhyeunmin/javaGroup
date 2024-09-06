package t11_interface.t02;

import java.util.Scanner;

public class ToyRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연령 별 장난감 기능 현황");		
		
		Toy toy[] = {new Bear(), new Robot(), new Tank(), new Airplane()};
		String title[] = {"곰돌이", "로보트", "탱크", "비행기"};
		
		for(int i = 0; i < toy.length; i++) {
			toy[i].product(title[i]);
			toy[i].age();
			toy[i].moving();
			toy[i].fire();
			toy[i].missile();
			System.out.println();
		}
	}
}
