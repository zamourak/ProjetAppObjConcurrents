package core;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Production {
	private int niveauProduction;
	private Calendar dateProduction;
	public Production(int niveauProduction, Calendar dateProduction) {
		this.niveauProduction = niveauProduction;
		this.dateProduction = dateProduction;
	}
	
	public Production(int niveauProduction) {
		this(niveauProduction, new GregorianCalendar());
	}



	public Calendar getDateProduction() {
		return dateProduction;
	}
}
