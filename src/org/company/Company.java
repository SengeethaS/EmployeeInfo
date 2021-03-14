package org.company;

import org.add.GreensTech;
//Single Inheritance
public class Company extends GreensTech {
	public void Company() {
	System.out.println("Company");
	}
public static void main(String[] args) {
	Company c=new Company();
	c.Company();
	c.greensAdayar();
	c.greensAnnaNagar();
}
}
