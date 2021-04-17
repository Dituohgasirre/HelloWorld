package com.qingke.thread;

public class LearnThreadCommunication {
	public static void main(String[] args) {
		Box box = new Box();
		Thread producer = new Producer(box);
		Thread consumer = new Consumer(box);
		producer.start();
		consumer.start();

	}
}

class Box {
	public int boxValue = 0;
}

class Producer extends Thread {
	private Box box;

	public Producer(Box box) {
		this.box = box;
	}

	public void run() {
		for (int i = 1; i < 6; i++) {

			synchronized (box) {
				while (box.boxValue != 0) {
					try {
						System.out.println("Producer: Box�����ģ��ȴ�");
						box.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				box.boxValue = i;
				System.out.println("Producer: Box�з�����" + i + ",��֪ͨ�����ȴ���");
				box.notify();
			}
		}
	}
}

class Consumer extends Thread {
	private Box box;

	public Consumer(Box box) {
		this.box = box;
	}

	public void run() {
		for (int i = 1; i < 6; i++) {

			synchronized (box) {
				while (box.boxValue == 0) {
					try {
						System.out.println("Consumer: Box�ǿյģ��ȴ�");
						box.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				box.boxValue = 0;
				System.out.println("Consumer: Box��ȡ����" + i + ",��֪ͨ��Ӧ��");
				box.notify();
			}
		}
	}
}
