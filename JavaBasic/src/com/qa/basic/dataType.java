package com.qa.basic;

public class dataType {

	public static void main(String[] args) {
		
		int myInt=10000;
		int intMin=Integer.MIN_VALUE;
		int intMax=Integer.MAX_VALUE;
		
		System.out.println("This is min and Max: "+intMin+"   "+intMax);
		System.out.println("Busted Max value"+(intMin+1)+"   Min Value : "+(intMin-1));
		
		byte newByte=126;
		short newShort=32500;
		
		int newInt=500000;
		long newLong=(newByte+newShort+newInt)*10+50000;
		
		System.out.println("The New long value is : "+newLong);
		
		newShort=(short) ((newByte+newShort+newInt)*10+50000);
		newInt=(newByte+newShort+newInt)*10+50000;
		System.out.println("The New short value is : "+newShort);
		System.out.println("The New int value is : "+newInt);
		
		float floatMin=Float.MIN_VALUE;
		float floatMax=Float.MAX_VALUE;
		
		System.out.println(" Min Float : "+floatMin+"  Max Value : "+floatMax);
		
		double doubleMin=Double.MIN_VALUE;
		double doubleMax=Double.MAX_VALUE;
		
		System.out.println(" Min Double : "+doubleMin+"  Max Value : "+doubleMax);


		float myFloat=(float)5.25;
		
	}

}
