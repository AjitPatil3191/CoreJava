/**
 * 
 */
package com.csi.polyconcept;

/**
 * @author Ajit
 *
 */

interface Departments {
	void get(int deptId, String deptName);

	static void set() {
		System.out.println("\n Hi I am from Static Method Departments class");
	}

	default void net() {
		System.out.println("\n Hi I am from Default method of Departments class");
	}

}

interface Employees extends Departments {
	void show(int empId, String empName);

}

abstract class Product {
	void push(int productId, String productName, long productPrice) {
		System.out.println("\n ProductId is:" + productId + "\n ProductName is :" + productName + "\n ProducrPrice is :"
				+ productPrice);
	}

	abstract void display(String productCode);

}

class Company extends Product implements Departments, Employees {

	@Override
	public void get(int deptId, String deptName) {
		System.out.println("\n DeptId is:" + deptId + "\n DeptName is :" + deptName);

	}

	@Override
	void display(String productCode) {
		System.out.println("\n ProductCode is:" + productCode);

	}

	@Override
	public void show(int empId, String empName) {
		System.out.println("\n EmpId is:" + empId + "\n EmpName is :" + empName);

	}

}

public class InterfaceAndAbstractClass {

	public static void main(String[] args) {
		Company cc = new Company();
		cc.get(111, "HR");
		cc.show(222, "Bhishma");
		cc.push(7565, "SAMSUNG LED", 90000L);
		cc.display("GSM800");
		Departments.set();
		cc.net();

	}

}
