package com.qingke.thread;

public class LeannThread {
	public static void main(String[] args) {
		Thread code = new Code();
		code.setName("编写");
		Print print = new Print();
		Thread pr = new Thread(print, "打印机");
		code.start();
		pr.start();
	}

}

class Code extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(this.getName() + ":" + "小明在写第" + i + "行代码");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("代码写完！");

	}
}

class Print implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + "小明在打印第" + i + "页材料");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("打印完！");
	}

}
