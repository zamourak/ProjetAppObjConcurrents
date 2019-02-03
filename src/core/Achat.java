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
	
        /**
         * Constructeur permettant d'instancier un Achat.
         * @param codeAchat
         *  Le code identifiant un Achat
         * @param dateLivraisonPrevu 
         *  La date d'arrivee prevu de la livraison
         */
	public Achat(String codeAchat,
			Calendar dateLivraisonPrevu) {
		this.codeAchat = codeAchat;
		this.prixTotal = 0;
		this.elem = new HashMap<Element, Integer> ();
		this.dateAchat = new GregorianCalendar();
		this.dateLivraisonPrevu = dateLivraisonPrevu;
		this.dateLivraisonEffective = null;
	}
	
        /**
         * Ajoute un Element dans la liste d'Achat avec une quantite associee
         * @param elem
         *  L'element que l'on ajoute dans la liste
         * @param quantitee 
         *  La quantitee de l'element que l'on ajoute
         */
	public void ajouterElementPourAchat(Element elem, int quantitee) {
		this.elem.put(elem, quantitee);
	}
        
        /**
         * Enleve un Element de la liste d'achat
         * @param elem 
         */
	public void EnleverElementPourAchat(Element elem) {
		this.elem.remove(elem);
	}
        
        /**
         * Change la quantitee d'un élément dans la commande
         * @param elem
         *  L'element concerné par la modification de quantitee
         * @param quantitee 
         *  La nouvelle quantitee
         */
	public void changerquantiteePourAchat(Element elem, int quantitee) {
		this.ajouterElementPourAchat(elem, quantitee);
	}
	
	
	
	
}
