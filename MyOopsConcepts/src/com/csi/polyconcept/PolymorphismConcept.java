/**
 * 
 */
package com.csi.polyconcept;

/**
 * @author Ajit program for method overload (get method is overloaded)
 */
class Department {
	public void get(int deptId, String deptName) {

		System.out.println("\n Department ID is:" + deptId + "\n DepartmentName is:" + deptName);
	}

	public void get(String deptCode) {
		System.out.println("\n Department Code is:" + deptCode);
	}
	static void show() {
		System.out.println("hi i am from Department's show");
	}

}

class Employee extends Department {
	@Override
	public void get(int deptId, String deptName) {

		System.out.println("\n Department ID is:" + deptId + "\n DepartmentName is:" + deptName);
	}

	static void show() {
		System.out.println("hi i am from Employee Show");
	}
}

public class PolymorphismConcept {

	public static void main(String[] args) {
		/*
		 * Department dp=new Department(); dp.get(555, "HR"); dp.get("001"); Employee
		 * emp=new Employee(); emp.get(888, "Development"); emp.get("003"); }
		 */
		/* Department dp=new Employee(); */
		Employee emp = new Employee();
		emp.get(999, "TestingDepartment");
		emp.get("002");
		Employee.show();
		Department.show();
		
	}
}