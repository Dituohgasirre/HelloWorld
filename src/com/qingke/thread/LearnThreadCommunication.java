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
						System.out.println("Producer: Box是满的，等待");
						box.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				box.boxValue = i;
				System.out.println("Producer: Box中放入了" + i + ",并通知其他等待者");
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
						System.out.println("Consumer: Box是空的，等待");
						box.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				box.boxValue = 0;
				System.out.println("Consumer: Box中取出了" + i + ",并通知供应者");
				box.notify();
			}
		}
	}
}
