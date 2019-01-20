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
}
