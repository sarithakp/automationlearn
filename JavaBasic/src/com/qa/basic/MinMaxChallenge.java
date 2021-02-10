package com.qa.basic;

import java.util.Scanner;

public class MinMaxChallenge {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int counter,maxNum=0,minNum=0;
		int number;
		boolean first=true;
		System.out.println("Enter how many Numbers you want to check : ");
		counter=scanner.nextInt();
		
		while(counter>0) {
			
			System.out.println("Enter the Number # "+counter+" : ");
			boolean hasNextInt=scanner.hasNextInt();
			if (hasNextInt) {
				number=scanner.nextInt();
				if (first) {
					first=false;
					maxNum=number;minNum=number;
				}
				counter--;
				if (number>maxNum) {
					maxNum=number;
				}
				if (number<minNum) {
					minNum=number;
				}
			}else {
				System.out.println("Wrong Input");
				
			}
			scanner.nextLine();
		}
		
		System.out.println("The maximum is : "+maxNum+"  The Minimum is : "+minNum);
		scanner.close();

	}

}
