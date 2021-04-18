package qingke1;

public class Account {
	private String id;
	private String name;
	private int balance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return id;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		balance += amount;
		return balance;
	}

	public int debit(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");

		}
		return balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= balance) {

			another.balance = another.balance + amount;
			balance = balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}

	public String tpString() {
		return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
