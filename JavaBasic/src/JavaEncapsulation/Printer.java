package JavaEncapsulation;

public class Printer {
	
	private int pagesPrinted;
	private int tonerLevel=100;
	private boolean duplex;
	public Printer(int tonerLevel, boolean duplex) {
	
		this.pagesPrinted = 0;
		if (tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;
		}
		else {
			tonerLevel=-1;
		}
		
		this.duplex = duplex;
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	public int printPages(int pages){
		int pagesToPrint;
	
		if (this.duplex) {
			System.out.println("Prinitng in Duplex..");
			pagesToPrint=(pages/2)+(pages%2);
			this.pagesPrinted+=pagesToPrint;
			return pagesToPrint;
		}
		else {
			pagesToPrint=pages;
			this.pagesPrinted+=pages;
			return pagesToPrint;
		}
		
		
	}
	public int getTonerLevel() {
		return tonerLevel;
	}
	public boolean isDuplex() {
		return duplex;
	}
	
	public int fillTonerLevel(int fillLevel) {
		if (fillLevel>0 && fillLevel<=100) {
			int newToner=tonerLevel+fillLevel;
			if (newToner>100) {
				System.out.println("Invalid Toner Level");
				return -1;
			}
			else 
				return newToner;
		}
		else 
			return -1;
	}

}
