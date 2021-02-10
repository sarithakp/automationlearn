package bankAppln;

import java.util.ArrayList;

public class BankMain {
	
	private String bankName;
	private ArrayList<Branch> branches;

	public BankMain(String bankName) {
	
		this.bankName = bankName;
		this.branches=new ArrayList<Branch>();
	}
	public boolean addBranch(String branch) {
		if (findBranch(branch)==null) {
			this.branches.add(new Branch(branch));
			return true;
		}
		else 
			return false;
	}
	public boolean addCustomer(String branchName,String CustomerName,Double initialAmount) {
		Branch branch=findBranch(branchName);
		if (branch!=null) {
			return branch.addCustomer(CustomerName, initialAmount);
		}
		return false;
	}
	public boolean addCustTransaction(String branchName,String CustName,Double amount) {
		Branch branch=findBranch(branchName);
		if (branch!=null) {
			return branch.addCustomerTransaction(CustName, amount);
		}
		else return false;
	}
	private Branch findBranch(String branchName) {
		
		for (int i=0;i<branches.size();i++) {
			if (branches.get(i).getBranchName().equals(branchName)) {
				return this.branches.get(i);
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName,boolean showTransactions) {
		Branch branch =findBranch(branchName);
		if (branch!=null) {
			System.out.println("List of Customers for Branch: "+branchName);
			ArrayList<Customer> branchCustomers=branch.getCustomer();
			for (int i=0;i<branchCustomers.size();i++) {
				Customer brCustomer=branchCustomers.get(i);
				System.out.println("Customer : "+brCustomer.getCustomerName()+" ["+(i+1)+"]");
				if (showTransactions) {
					System.out.println(" Transactions");
					ArrayList <Double> transactions=brCustomer.getCustTrans();
					for (int j=0;j<transactions.size();i++) {
						System.out.println("["+ j+1+"] Amount"+transactions.get(j) );
					}
				}
				else return true;
			}
			
		}
		return false;
	}

}
