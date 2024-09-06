package t11_interface.t03;

public class ActionRun {
	public static void main(String[] args) {
		Action actions[] = {new PoliceMan(), new FireMan(), new chef()};
		String title[] = {"경찰관", "소방관", "요리사"};
		
		int cnt = 0;
		for(Action action : actions) {	//	향상된 for문 (Action actions : actions)
			action.person(title[cnt++]);
			action.catching();
			action.search();
			action.fire();
			action.rescue();
			action.pizza();
			action.pasta();
			System.out.println();
		}
	}
}
