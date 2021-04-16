package com.qingke.thread;
//军队线程
//模拟作战双方的行为
public class ArmyRunnable implements Runnable {
	//volatile保证了线程可以正确地读取其他线程写入的值
	volatile boolean keepRunning=true;
	@Override
	public void run() {
		while(keepRunning){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				//让出来处理器时间，下次谁进攻还不一定呢
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗！");

	}

}
