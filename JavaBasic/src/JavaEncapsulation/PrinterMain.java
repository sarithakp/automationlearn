package JavaEncapsulation;

public class PrinterMain {

	public static void main(String[] args) {
		
		Printer printer=new Printer(20,true);
		printer.getTonerLevel();
		int toner=printer.fillTonerLevel(90);
		System.out.println("The new toner is "+toner);
		int pages =printer.printPages(2);
		System.out.println("Pages printed .. "+pages+" Total pages printed: "+printer.getPagesPrinted());
		
		Printer printer1=new Printer(20,false);
		pages =printer1.printPages(5);
		System.out.println("Pages printed .. "+pages+"  Total pages printed.."+printer1.getPagesPrinted());
		
		pages =printer.printPages(7);
		System.out.println("Pages printed .. "+pages+"  Total Pages Printed  ..:"+printer.getPagesPrinted());
	}

}
