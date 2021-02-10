package ClassChallenge;

import java.util.Scanner;

public class ArrayMain {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int[] array=getIntegers(10);
		sortArray(array);
		printArray(array);
		

	}
	
	public static int[] getIntegers(int n) {
		
		int[] array= new int[n];
		System.out.println("Enter Integers..");
		for (int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
					
		}
		return array;
	}
	public static void printArray(int[] array) {
		
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static int[] sortArray(int[] array) {
		int temp;
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		return array;
		
	}

}
