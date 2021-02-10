package com.qa.basic;

import java.util.Scanner;

public class Basictwo {

	public static void main(String[] args) {
		// convert pounds to kilogram
		//1 lb=0.45359237kg
		
		Scanner scanner=new Scanner(System.in);
		
		int pound = 100;
		
		
		System.out.println("Enter the pounds to convert to Kg: ");
		pound=scanner.nextInt();
		scanner.close();	
		
		
		
		double newKg=pound*0.45359237;
		System.out.println("The Kg value is: "+newKg+"  \u00A9 Saritha");
		

	}

}
