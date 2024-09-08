package t50_ex.t1;

import java.util.Scanner;

//	배역을 입력하면 해당 배역의 역할을 출력하세요.

public class T4_ActionRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Action action[] = {new PoliceMan(), new FireMan(), new chef()};
		String title[] = {"경찰관", "소방관", "요리사"};
		boolean stop = true;
		
		while(stop == true) {
			System.out.println("아래 직업 중 보고 싶은 역할의 직업을 선택하세요. ");
			for(int i = 0; i < title.length; i++) {
				System.out.print(title[i] + "  ");
			}
			System.out.println("| 그만 |");
			String choice = sc.next();
			System.out.println();
			if(choice.equals("그만")) {
				stop = false;
			}
			for(int i = 0; i < title.length; i++) {
				if(choice.equals(title[i])) {
					action(action[i], choice);
				}
			}
		}		
		sc.close();
	}
	static void action(Action action, String choice) {
		action.person(choice);
		action.catching();
		action.search();
		action.fire();
		action.rescue();
		action.pizza();
		action.pasta();
		System.out.println();
	}
}
