package t50_ex;

public class Ex20_Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Ex20_Account() {}
	
	public Ex20_Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOnwer() {
		return owner;
	}

	public void setOnwer(String onwer) {
		this.owner = onwer;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}