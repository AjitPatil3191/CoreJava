/**
 * 
 */
package com.csi.creatingthread;

/**
 * @author Ajit
 *
 */
class Thread2 implements Runnable {

	@Override
	public void run() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("Value of I:" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class UsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable t2 = new Thread2();
		Thread tt = new Thread(t2, "RunnablesThread");
		System.out.println("Thread Name is:" + tt.getName());
		System.out.println("Thread State is:" + tt.isAlive());
		tt.start();
		System.out.println("Thread state after Start is :" + tt.isAlive());

	}

}
