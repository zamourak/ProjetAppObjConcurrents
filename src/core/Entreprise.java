package core;

import java.util.ArrayList;

public class Entreprise {
	private ArrayList<Achat> listeAchats;
	private ArrayList<Element> listeElements;
	private ArrayList<Stockage> listeStockages;
	private ArrayList<ChaineProduction> listeChaineProduction;
	private ArrayList<Personnel> listePersonnel;
	
	public Entreprise() {
		this.listeAchats = new ArrayList<Achat> ();
		this.listeElements = new ArrayList<Element> ();
		this.listeStockages = new ArrayList<Stockage> ();
		this.listeChaineProduction = new ArrayList<ChaineProduction> ();
		this.listePersonnel = new ArrayList<Personnel> ();
	}

}
