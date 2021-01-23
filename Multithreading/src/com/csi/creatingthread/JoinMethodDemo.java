/**
 * 
 */
package com.csi.creatingthread;

/**
 * @author Ajit
 *
 */
class Thread11 extends Thread {
	int i;

	public void run() {
		for (i = 1; i <= 10; i += 2) {
			System.out.println("Odd Value of I is :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Thread12 implements Runnable {
	int j;

	@Override
	public void run() {
		for (j = 2; j <= 10; j += 2) {
			System.out.println("Even Value of J is :" + j);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class JoinMethodDemo {

	public static void main(String[] args) {
		Thread11 t11 = new Thread11();
		Thread12 t12 = new Thread12();
		Thread tr12 = new Thread(t12);
		System.out.println("Thread t11's State is :" + t11.isAlive());
		System.out.println("Thread tr12's State is :" + tr12.isAlive());
		t11.start();
		tr12.start();
		System.out.println("After start t11 state is :" + t11.isAlive());
		System.out.println("After start tr12 state is :" + tr12.isAlive());

		try {
			t11.join();
			tr12.join();

		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After join t11 state is :" + t11.isAlive());
		System.out.println("After join tr12 state is :" + tr12.isAlive());

	}

}
