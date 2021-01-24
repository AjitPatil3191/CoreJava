/**
 * 
 */
package com.csi.myoopsconcepts;

/**
 * @author Ajit
 *
 */
class Companys {
	String compName;

	public void setName(String companyName) {
		this.compName = companyName;

	}

	public void compShow() {
		System.out.println("\n Company Name is :" + compName);
	}
}

class Department extends Companys {
	String departmentName;

	public void setDepartmentName(String deptName) {
		this.departmentName = deptName;
	}

	public void departmentShow() {
		System.out.println("\n Department Name is :" + departmentName);
	}

}

class Employees extends Department {

	private int empsId;

	private String empsName;

	private double empsSalary;

	private long empsContactNumber;

	public int getEmpsId() {
		return empsId;
	}

	public void setEmpsId(int empsId) {
		this.empsId = empsId;
	}

	public String getEmpsName() {
		return empsName;
	}

	public void setEmpsName(String empsName) {
		this.empsName = empsName;
	}

	public double getEmpsSalary() {
		return empsSalary;
	}

	public void setEmpsSalary(double empsSalary) {
		this.empsSalary = empsSalary;
	}

	public long getEmpsContactNumber() {
		return empsContactNumber;
	}

	public void setEmpsContactNumber(long empsContactNumber) {
		this.empsContactNumber = empsContactNumber;
	}

	void show() {
		System.out.println("\n empsId:" + empsId + "\n empsName:" + empsName + "\n empsSalary:" + empsSalary
				+ "\n empsContactNumber:" + empsContactNumber);
	}
}

public class MyEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e1 = new Employees();
		e1.setEmpsId(555);
		e1.setEmpsName("Bhishma");
		e1.setEmpsContactNumber(9999442233L);
		e1.setEmpsSalary(46.555);
		e1.setName("Crerdit Systems India");
		e1.setDepartmentName("HR");
		e1.departmentShow();
		e1.compShow();
		e1.show();
	}

}
