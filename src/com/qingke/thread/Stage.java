package com.qingke.thread;

/**
 * �����������̨
 * 
 * @author wcd
 *
 */
public class Stage extends Thread {
	public void run() {
		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "���");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "ũ�������");

		armyOfSuiDynasty.start();
		armyOfRevolt.start();

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;

		try {
			armyOfRevolt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stage().start();
	}

}
