package com.demoQA.pages;

public class TestThread {
	

		
		public static void main(String[] args) {
		
			test t1=new test("A");
			test t2=new test("B");
			
			t2.start();
			t1.start();

		}

	

}
