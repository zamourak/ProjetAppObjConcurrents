package core;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Achat {
	private String codeAchat;
	private float prixTotal;
	private HashMap<Element, Integer> elem;
	private Calendar dateAchat;
	private Calendar dateLivraisonPrevu;
	private Calendar dateLivraisonEffective;
	
	public Achat(String codeAchat, float prixTotal,
			Calendar dateLivraisonPrevu) {
		this.codeAchat = codeAchat;
		this.prixTotal = prixTotal;
		this.elem = new HashMap<Element, Integer> ();
		this.dateAchat = new GregorianCalendar();
		this.dateLivraisonPrevu = dateLivraisonPrevu;
		this.dateLivraisonEffective = null;
	}
	
	public void ajouterElementPourAchat(Element elem, int quantitee) {
		this.elem.put(elem, quantitee);
	}
	public void EnleverElementPourAchat(Element elem) {
		this.elem.remove(elem);
	}
	public void changerquantiteePourAchat(Element elem, int quantitee) {
		this.ajouterElementPourAchat(elem, quantitee);
	}
	
	
	
	
}
