package core;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Achat {
	private int codeAchat;
	private float prixTotal;
	private HashMap<Element, Integer> elem;
	private Calendar dateAchat;
	private Calendar dateLivraisonPrevu;
	private Calendar dateLivraisonEffective;
	public Achat(int codeAchat, float prixTotal,
			Calendar dateLivraisonPrevu) {
		this.codeAchat = codeAchat;
		this.prixTotal = prixTotal;
		this.elem = new HashMap<Element, Integer> ();
		this.dateAchat = new GregorianCalendar();
		this.dateLivraisonPrevu = dateLivraisonPrevu;
		this.dateLivraisonEffective = null;
	}	
}
