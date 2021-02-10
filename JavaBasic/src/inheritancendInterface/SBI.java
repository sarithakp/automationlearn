package inheritancendInterface;


/* Inheritance - Method Overriding
 * Parent p=new Parent() -- Base class methods are accessed
 * Parent p=new Child() -- Child class method are accessed as it overrides
 * Child c=new Child() -- Child class methods are accessed
 * 
 * Invalid - Child c=new Parent()
 * 
 * Interface - Implements parent interface methods
 * 
 * Parent p=new Child() -- Implements Child Class Methods
 * Child c=new Child() -- Implements Child class methods
 * 
 * Invalid -- Cannot create object of Parent interface and Child cannot hold Parent object
 * 
 */

public class SBI extends RBI implements Loan{
	

	public static void main(String[] args) {
		
		SBI sbi=new SBI();
		sbi.homeLoan();
		sbi.Loan();
		
		RBI sbi1=new SBI();
		sbi1.homeLoan();
		
		RBI sbi2=new RBI();
		sbi2.homeLoan();
		
		Loan sbiloan=new SBI();
		sbiloan.Loan();

	}
	public void homeLoan() {
		System.out.println("This is SBI loan is 10%");
	}
	@Override
	public void Loan() {
		System.out.println("Loan from SBI");
		
	}

}
