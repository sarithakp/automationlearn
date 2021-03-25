package com.demoQA.pages;

class test implements Runnable{
	
private Thread t;
private String tname;

		test(String thred){
			this.tname=thred;
		}	
			
		public void run() {
			while(true) {
				System.out.println((tname));
			}
		}
		public void start() {
			if(t==null) {
				t=new Thread(this.tname);
				t.start();
			}
		}
	

}

