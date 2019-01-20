package core;

import java.util.HashMap;

public class ChaineProduction {
	private int codeChaineProduction;
	private String nom;
	private int niveauActivitee;
	private int temps;
	
	private HashMap<Element, Integer> entree;
	private HashMap<ProduitsFinis, Integer> sortie;
	
	public ChaineProduction(int codeChaineProduction, String nom, int niveauActivitee, int temps) {
		this.codeChaineProduction = codeChaineProduction;
		this.nom = nom;
		this.niveauActivitee = niveauActivitee;
		this.temps = temps;
		this.entree = new HashMap<Element, Integer> ();
		this.sortie = new HashMap<ProduitsFinis, Integer> ();
	}
	
}
