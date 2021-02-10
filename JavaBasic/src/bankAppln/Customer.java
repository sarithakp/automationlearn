package bankAppln;

import java.util.ArrayList;

public class Customer {
	
	private String customerName;
	private ArrayList<Double> custTrans;
	
	public Customer(String customerName, Double TransAmount) {
		this.customerName = customerName;
		this.custTrans = new ArrayList<Double>();
		addTransaction(TransAmount);
	}
	public String getCustomerName() {
		return customerName;
	}
	public ArrayList<Double> getCustTrans() {
		return custTrans;
	}
	
	public void printTransaction(String name) {
		System.out.println("Customer Name: "+name);
		for (int i=0;i<custTrans.size();i++) {
			System.out.println("Transaction: "+custTrans.get(i));
		}
	}
	public void addTransaction(Double amount) {
		custTrans.add(amount);
		
	}
	

}
