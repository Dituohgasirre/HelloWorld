package com.qingke.thread;

public class LeannThread {
	public static void main(String[] args) {
		Thread code = new Code();
		code.setName("��д");
		Print print = new Print();
		Thread pr = new Thread(print, "��ӡ��");
		code.start();
		pr.start();
	}

}

class Code extends Thread {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(this.getName() + ":" + "С����д��" + i + "�д���");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("����д�꣡");

	}
}

class Print implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 15; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + "С���ڴ�ӡ��" + i + "ҳ����");

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("��ӡ�꣡");
	}

}
