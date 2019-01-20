package core;

import java.util.Calendar;
import java.util.HashMap;

public class Achat {
	private int codeAchat;
	private float prixTotal;
	private HashMap<Element, Integer> elem;
	private Calendar dateAchat;
	private Calendar dateLivraisonPrevu;
	private Calendar dateLivraisonEffective;
	public Achat(int codeAchat, float prixTotal, Calendar dateAchat,
			Calendar dateLivraisonPrevu, Calendar dateLivraisonEffective) {
		this.codeAchat = codeAchat;
		this.prixTotal = prixTotal;
		this.elem = new HashMap<Element, Integer> ();
		this.dateAchat = dateAchat;
		this.dateLivraisonPrevu = dateLivraisonPrevu;
		this.dateLivraisonEffective = dateLivraisonEffective;
	}

}