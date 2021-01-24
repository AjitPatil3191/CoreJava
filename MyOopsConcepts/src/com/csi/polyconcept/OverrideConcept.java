/**
 * 
 */
package com.csi.polyconcept;

/**
 * @author Ajit
 *
 */

class Bank{
	int rateOfIntrest() {
		return 0;
	}
}
class Icici extends Bank{
	@Override
	int rateOfIntrest() {
		return 13;
	}
}
class Hdfc extends Bank{
	@Override
	int rateOfIntrest() {
		return 17;
	}
}
class Boi extends Bank{
	@Override
	int rateOfIntrest() {
		return 12;
	}
}
public class OverrideConcept {

	public static void main(String[] args) {
    Icici ic=new Icici();
    Hdfc hd=new Hdfc();
    Boi bi=new Boi();
    System.out.println("ICICI bank intrest :"+ic.rateOfIntrest());
    System.out.println("HDFC bank intrest :"+hd.rateOfIntrest());
    System.out.println("BOI bank intrest :"+bi.rateOfIntrest());
	}

}
