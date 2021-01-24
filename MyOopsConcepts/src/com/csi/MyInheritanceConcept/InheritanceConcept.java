/**
 * 
 */
package com.csi.MyInheritanceConcept;

import java.util.Scanner;

/**
 * @author Ajit
 *
 */
class Diagram {
	double area;
	public int radius, sidelength, sideheight;
	public double pi = 3.14159265;

}

class AreaRectangle extends Diagram {
	public void set(int side, int length) {
		this.sideheight = side;
		this.sidelength = length;
	}

	void areaRect(int sidelength, int sideheight) {
		area = sidelength * sideheight;
		System.out.println("Area of Rectangle is:" + area);
	}
}

class AreaCircle extends Diagram {
	void areaCirc(int radius) {
		area = 2 * pi * radius * radius;
		System.out.println("Area of Circle is:" + area);
	}
}

public class InheritanceConcept {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Pls Enter side and length of Rectangle :");
		AreaRectangle arrect = new AreaRectangle();

		int height = sc.nextInt();
		int side = sc.nextInt();
		arrect.set(side, height);
		AreaCircle ac = new AreaCircle();
		arrect.areaRect(side, height);
		System.out.println("Pls Enter side and length of Rectangle :");
		int radius = sc.nextInt();
		ac.areaCirc(radius);

	}

}
