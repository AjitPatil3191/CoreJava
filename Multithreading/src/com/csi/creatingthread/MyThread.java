package com.csi.creatingthread;

class Thread1 extends Thread {

	public void run() {
		int i;
		for (i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread is Running");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread is Sleeping");
		}

	}
}

public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		System.out.println("Thread Name is:" + t1.getName());
		System.out.println("Thread State is:" + t1.isAlive());
		t1.start();
		t1.setName("FirstThread");
		System.out.println("Now Thread Name is:" + t1.getName());

	}

}
