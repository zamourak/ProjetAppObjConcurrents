package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ChaineProduction {
	private String codeChaineProduction;
	private String nom;
	private int niveauActivitee;
	private int temps;
	
	private HashMap<Element, Float> entree;
	private HashMap<Element, Float> sortie;
	
	private ArrayList<Production> listeproduction;
	
	public ChaineProduction(String codeChaineProduction, String nom, int niveauActivitee, int temps) {
		this.codeChaineProduction = codeChaineProduction;
		this.nom = nom;
		this.niveauActivitee = niveauActivitee;
		this.temps = temps;
		this.entree = new HashMap<Element, Float> ();
		this.sortie = new HashMap<Element, Float> ();
		this.listeproduction = new ArrayList<Production>();
	}
	public ChaineProduction(String codeChaineProduction, String nom, int temps) {
		this(codeChaineProduction, nom, 0, temps);
	}
	
	public void ajouterElementPourDictionnaireDeProductionEnEntree(Element elem, float quantitee) {
		this.entree.put(elem, quantitee);
	}
	public void ajouterElementPourDictionnaireDeProductionEnSortie(Element elem, float quantitee) {
		this.sortie.put(elem, quantitee);
	}
	public void retirerElementPourDictionnaireDeProductionEnEntree(Element elem) {
		this.entree.remove(elem);
	}
	public void retirerElementPourDictionnaireDeProductionEnSortie(ProduitsFinis elem) {
		this.entree.remove(elem);
	}
	public void modifierElementPourDictionnaireDeProductionEnEntree(Element elem, float quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnEntree(elem, quantitee);
	}
	public void modifierElementPourDictionnaireDeProductionEnSortie(Element elem, float quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnSortie(elem, quantitee);
	}
	
	public void ajouterProduction() {
		this.listeproduction.add(new Production(this.niveauActivitee));
	}
	public void retirerProduction(Production production) {
		this.listeproduction.remove(production);
	}
	
	
	public String toString() {
		String src = this.codeChaineProduction + " - " + this.nom + " - " + this.temps;
		src += "\nEntrée :\n";
		Iterator it = this.entree.keySet().iterator();
		Element elem;
		Float quantitee;
		while(it.hasNext()) {
			elem = (Element) it.next(); 
			quantitee = this.entree.get(elem); 
			src+="Element : " + elem + " quantitee en entree :" +quantitee + "\n";
		}
		src += "\nSortie :\n";
		it = this.sortie.keySet().iterator();
		while(it.hasNext()) {
			elem = (Element) it.next(); 
			quantitee = this.sortie.get(elem);
			src+="Element : " + elem + " quantitee en sortie :" +quantitee + "\n";
		}
		return src;
		
	}
	
	
	
}
