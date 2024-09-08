package t50_ex.Child;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Child1 child = new Child1();
		String menu[] = { "쌀밥", "불고기", "두부조림", "미역국", "요플레", "바나나", "우유", "아몬드" };

		System.out.println("아래 음식 중 주문하고 싶으신 메뉴를 골라주세요");
		System.out.println("\"쌀밥\"과 \"불고기\"는 기본메뉴입니다.");
		child.total += 2500;

		for (int i = 0; i < menu.length; i++) {
			System.out.print(i + 1 + "." + menu[i] + " ");
		}

		System.out.println();
		System.out.println("==========================================================");

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i] + "(을)를 주문하시겠습니까? (Y / N)");
			String choice = sc.next();
			child.rice(i, choice);
			child.bulgogi(i, choice);
			child.dubu(i, choice);
			child.miyeoggug(i, choice);
			child.yoplait(i, choice);
			child.bananan(i, choice);
			child.milk(i, choice);
			child.almond(i, choice);
		}
		System.out.println();
		System.out.println("쌀밥 불고기 " + child.food + "를 주문하셨습니다.");
		System.out.println("총 금액은 " + child.total + "원 입니다.");

	}
}
