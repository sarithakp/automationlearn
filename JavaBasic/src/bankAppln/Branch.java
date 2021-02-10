package bankAppln;

import java.util.ArrayList;

public class Branch {
	
	private String branchName;
	private ArrayList<Customer> customer;

	public Branch(String branchName) {
	
		this.branchName = branchName;
		this.customer=new ArrayList<Customer>();
			
	}

	public String getBranchName() {
		return branchName;
	}
	public ArrayList<Customer> getCustomer() {
		return customer;
	}
		
	public boolean addCustomer(String custName,Double initialAmount) {
		if(findCustomer(custName)==null) {
			this.customer.add(new Customer(custName,initialAmount));
			return true;
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String custname,Double amount) {
		Customer existingCustomer=findCustomer(custname);
		if (existingCustomer!=null) {
			
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
		
	}
	private Customer findCustomer(String custName) {
	
		for (int i=0;i<customer.size();i++) {
			if (customer.get(i).getCustomerName().equals(custName)) {
				return this.customer.get(i);
			}
		}
		return null;
	}
	

}
