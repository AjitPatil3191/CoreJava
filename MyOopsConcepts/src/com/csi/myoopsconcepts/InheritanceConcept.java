/**
 * 
 */
package com.csi.myoopsconcepts;

/**
 * @author Ajit
 */
class Employee {
	int empId;
	String empName;
	String designation;
	long empContact;
	int empSalary;

	void get(int empId, String empName, String designation, long empContact, int empSalary) {
		System.out.println("\n empName:" + empName + "\n empId:" + empId + "\n Designation:" + designation + "\n empContact:"
				+ empContact + "\n empSalary:" + empSalary);
	}

}

class Company extends Employee {
	public String companyName;

	public void comName(String companyName) {
	System.out.println("\n Company Name is:"+companyName);
	}

}

public class InheritanceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company com = new Company();
		com.comName("Credit Systems India");
		com.get(555, "RAM", "Manager", 9999446070L , 40655);
		

	}

}
