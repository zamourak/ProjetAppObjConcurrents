package core;

import java.util.ArrayList;
import java.util.HashMap;

public class ChaineProduction {
	private String codeChaineProduction;
	private String nom;
	private int niveauActivitee;
	private int temps;
	
	private HashMap<Element, Integer> entree;
	private HashMap<ProduitsFinis, Integer> sortie;
	
	private ArrayList<Production> listeproduction;
	
	public ChaineProduction(String codeChaineProduction, String nom, int niveauActivitee, int temps) {
		this.codeChaineProduction = codeChaineProduction;
		this.nom = nom;
		this.niveauActivitee = niveauActivitee;
		this.temps = temps;
		this.entree = new HashMap<Element, Integer> ();
		this.sortie = new HashMap<ProduitsFinis, Integer> ();
		this.listeproduction = new ArrayList<Production>();
	}
	
	public void ajouterElementPourDictionnaireDeProductionEnEntree(Element elem, int quantitee) {
		this.entree.put(elem, quantitee);
	}
	public void ajouterElementPourDictionnaireDeProductionEnSortie(ProduitsFinis elem, int quantitee) {
		this.sortie.put(elem, quantitee);
	}
	public void retirerElementPourDictionnaireDeProductionEnEntree(Element elem) {
		this.entree.remove(elem);
	}
	public void retirerElementPourDictionnaireDeProductionEnSortie(ProduitsFinis elem) {
		this.entree.remove(elem);
	}
	public void modifierElementPourDictionnaireDeProductionEnEntree(Element elem, int quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnEntree(elem, quantitee);
	}
	public void modifierElementPourDictionnaireDeProductionEnSorti(Element elem, int quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnEntree(elem, quantitee);
	}
	
	public void ajouterProduction() {
		this.listeproduction.add(new Production(this.niveauActivitee));
	}
	public void retirerProduction(Production production) {
		this.listeproduction.remove(production);
	}
	
	
	
	
	
	
}
