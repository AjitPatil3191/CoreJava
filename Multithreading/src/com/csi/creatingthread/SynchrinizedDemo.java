/**
 * 
 */
package com.csi.creatingthread;

/**
 * @author Ajit
 *
 */
class Account {
	private int bal = 0;

	synchronized void deposit(int amount) {
		bal = bal + amount;
		System.out.println("Current Balance is :" + bal);
	}

	int getBal() {
		return (bal);
	}
}

class Customer extends Thread {
	Account ac;// HAS-A Relationship

	Customer(Account ac) {
		this.ac = ac;
	}

	public void run() {
		ac.deposit(10);
	}
}

public class SynchrinizedDemo {
	public static final int numberOfCustomer = 5;

	public static void main(String[] args) {
		Account ac = new Account();
		Customer cust[] = new Customer[numberOfCustomer];
		for (int i = 0; i < numberOfCustomer; i++) {
			cust[i] = new Customer(ac);
		}
		for (int i = 0; i < numberOfCustomer; i++) {
			cust[i].start();
		}
		for (int i = 0; i < numberOfCustomer; i++) {
			System.out.println("Customer number  :" + i+"  " + "Status is :" + cust[i].isAlive());
		}
		for (int i = 0; i < numberOfCustomer; i++) {
			try {
				cust[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i < numberOfCustomer; i++) {
			System.out.println("Customer number :" + i + "  "+"Status is :" + cust[i].isAlive());
		}
		System.out.println("Total Balance is :" + ac.getBal());

	}

}
