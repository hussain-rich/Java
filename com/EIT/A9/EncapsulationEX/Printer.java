package com.EIT.A9.EncapsulationEX;

public class Printer {
	private int tonerLevel,pagesPrinted;
	private boolean duplex;
	public Printer(int tonerLevel, boolean dublex) {
		if(tonerLevel>-1 && tonerLevel<=100) {
			this.tonerLevel = tonerLevel;	
		}else {
			this.tonerLevel=-1;
		}
		this.pagesPrinted=0;
		this.duplex = duplex;
	}
	public int addToner(int tonerAmount) {
		if(tonerAmount>0 && tonerAmount<=100) {
			if((tonerLevel+tonerAmount)>100) {
				return -1;
			}
			tonerLevel+=tonerAmount;
			return tonerLevel;
		}else {
			return -1;
		}
		
	}
	public int printPages(int pages) {
		int pagesToPrint=pages;
		if(duplex) {
			pagesToPrint=((pages/1)/2);
		}
			pagesPrinted+=pagesToPrint;
			return pagesToPrint;	
		
	}
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println(printer.addToner(50));
		System.out.println("initial page count = " +printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
		pagesPrinted = printer.printPages(2);
		System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
	}
	
	

}
