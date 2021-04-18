package com.qingke.thread;

public class BankThread {
	public static void main(String[] args) {
		BankAccount count = new BankAccount();
		Thread husband = new BankedThread(count);
		Thread wife = new BankedThread(count);
		husband.start();
		wife.start();
	}

}

class BankAccount {
	private double balance = 1000;

	public/* synchronized */ boolean deposit(double newAdd) {
		if (balance <= 0) {
			return false;
		} else {
			synchronized (this) {
				System.out.println("当前余额为" + balance);

				balance += newAdd;

				System.out.println("当前余额为" + balance);
			}
			return true;
		}
	}
}

class BankedThread extends Thread {
	private BankAccount bankAccount;

	public BankedThread(BankAccount count) {
		bankAccount = count;
	}

	public void run() {
		bankAccount.deposit(200);
	}
}
