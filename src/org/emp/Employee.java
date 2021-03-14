package org.emp;

import java.util.Scanner;

import org.company.Company;
//Multilevel Inheritence-From GreehTech-Company-Employee

public class Employee extends Company {
	private void empDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmpName- ");
		String EName=sc.next();
		System.out.println("Emplaoyee name added as-"+EName);
		
		System.out.println("Enter the Emp ID-");
		int EId=sc.nextInt();
		System.out.println("Employee ID ia added as- "+EId);
		
	//Pls clarify-Why the print command has not fully displayed, also why the pointer is not pointing rightly after the execution?
		//Please enter the Employee Name-
		//Haran
		//Employer Name-Haran
		//Enter your Employee ID-
		//100
		//Employer ID-100

	}
	public static void main(String[] args) {
		Employee Emp=new Employee();
		Emp.empDetails();
		Emp.Company();
		Emp.greensAdayar();
	}
	
	
}
