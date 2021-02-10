package com.qa.basic;

public class OperatorChallenge {

	public static void main(String[] args) {
		// operator challenge
		
		double myDouble=20.00;
		double myDouble1=80.00;
		double doubleTotal=(myDouble+myDouble1)*100;
		
		System.out.println("The Answer is : "+doubleTotal);
		double checkVal=doubleTotal%57.00;
		System.out.println("The Answer is : "+checkVal);
		
		boolean isRemainder=(checkVal==0)?true:false;
			
		if (!isRemainder) {
			System.out.println("Got some reminder: "+checkVal);
		}
	}
}
