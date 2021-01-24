/**
 * 
 */
package com.csi.MyInheritanceConcept;

import java.util.Scanner;

/**
 * @author Ajit
 *
 */
class Vehicle {
	public int wheelsNo;
	public String companyName;

	public int getWheelsNo(int vNo) {

		return vNo;
	}

	public String getCompanyName(String cName) {
		return cName;

	}

}

class Details extends Vehicle {
	void show(String empName) {
		System.out.println("\n Employee Name: " + empName);
	}
}

public class Customer {

	public static void main(String[] args) {
		Details c = new Details();
		System.out.println("\n Please enter Vehicle No, Company Name, Employee Name: ");
		Scanner sc = new Scanner(System.in);
		int vehicleNo = sc.nextInt();
		String cName = sc.next();
		String eName = sc.next();
		System.out.println("\n Vehicle Number: " + c.getWheelsNo(vehicleNo));
		System.out.println("\n Company Name: " + c.getCompanyName(cName));
		c.show(eName);

	}

}
