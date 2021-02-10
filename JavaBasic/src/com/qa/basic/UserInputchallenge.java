package com.qa.basic;

import java.util.Scanner;

public class UserInputchallenge {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int Sum=0,num,count=1;
		do {
			
			System.out.println("Enter an integer# "+count+ ": ");
			boolean hasNextInt=scanner.hasNextInt();
			if(hasNextInt) {
				num=scanner.nextInt();
				Sum=Sum+num;
				count++;
				
			}
			else {
				System.out.println("Wrong input");
				hasNextInt=true;
				
			}
			scanner.nextLine();
			
		}
		while (count<=10);
		scanner.close();
		System.out.println("The sum of numbers is : "+Sum);
		
	}

}
