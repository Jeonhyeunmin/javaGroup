package t50_ex.Child;

public class Child1 implements LunchMenu {
	int total = 0;
	String food = "";
	@Override
	public void rice(int i, String choice) {
		if (i == 0 && choice.toUpperCase().equals("Y")) {
			System.out.println("쌀밥을 주문하셨습니다. 가격은 500원 입니다");
			System.out.println();
			this.total += 500;
			this.food += "쌀밥 ";
		}
	}

	@Override
	public void bulgogi(int i, String choice) {
		if (i == 1 && choice.toUpperCase().equals("Y")) {
			System.out.println("불고기를 주문하셨습니다. 가격은 2000원 입니다");
			System.out.println();
			this.total += 2000;
			this.food += "불고기 ";
		}
	}

	@Override
	public void dubu(int i, String choice) {
		if (i == 2 && choice.toUpperCase().equals("Y")) {
			System.out.println("두부조림을 주문하셨습니다. 가격은 1000원 입니다");
			System.out.println();
			this.total += 1000;
			this.food += "두부조림 ";
		}
	}

	@Override
	public void miyeoggug(int i, String choice) {
		if (i == 3 && choice.toUpperCase().equals("Y")) {
			System.out.println("미역국을 주문하셨습니다. 가격은 1000원 입니다");
			System.out.println();
			this.total += 1000;
			this.food += "미역국 ";
		}
	}

	@Override
	public void yoplait(int i, String choice) {
		if (i == 4 && choice.toUpperCase().equals("Y")) {
			System.out.println("요플레를 주문하셨습니다. 가격은 800원 입니다");
			System.out.println();
			this.total += 800;
			this.food += "요플레 ";
		}
	}

	@Override
	public void bananan(int i, String choice) {
		if (i == 5 && choice.toUpperCase().equals("Y")) {
			System.out.println("바나나를 주문하셨습니다 가격은 500원 입니다.");
			System.out.println();
			this.total += 500;
			this.food += "바나나 ";
		}
	}

	@Override
	public void milk(int i, String choice) {
		if (i == 6 && choice.toUpperCase().equals("Y")) {
			System.out.println("우유를 주문하셨습니다 가격은 500원 입니다.");
			System.out.println();
			this.total += 500;
			this.food += "우유 ";
		}
	}

	@Override
	public void almond(int i, String choice) {
		if (i == 7 && choice.toUpperCase().equals("Y")) {
			System.out.println("아몬드를 주문하셨습니다 가격은 700원 입니다.");
			System.out.println();
			this.total += 700;
			this.food += "아몬드 ";
		}
	}
}
