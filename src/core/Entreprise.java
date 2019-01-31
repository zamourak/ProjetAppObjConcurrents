package core;

import java.util.ArrayList;
import java.util.HashMap;

public class Entreprise {
	private ArrayList<Achat> listeAchats;
	private ArrayList<Element> listeElements;
	private ArrayList<Stockage> listeStockages;
	private ArrayList<ChaineProduction> listeChaineProduction;
	private ArrayList<Personnel> listePersonnel;
	public static Entreprise enteprise;
	
	public Entreprise() {
		this.listeAchats = new ArrayList<Achat> ();
		this.listeElements = new ArrayList<Element> ();
		this.listeStockages = new ArrayList<Stockage> ();
		this.listeChaineProduction = new ArrayList<ChaineProduction> ();
		this.listePersonnel = new ArrayList<Personnel> ();
		if(Entreprise.enteprise == null) {
			Entreprise.enteprise = this;
		}
		
	}
	
	public void ajouterElementDansEntreprise(Element elem) {
		this.listeElements.add(elem);
	}
	public void ajouterAchatDansEntreprise(Achat achat) {
		this.listeAchats.add(achat);
	}
	public void ajouterStockageDansEntreprise(Stockage stockage) {
		this.listeStockages.add(stockage);
	}
	public void ajouterChaineProductionDansEntreprise(ChaineProduction chaineproduction) {
		this.listeChaineProduction.add(chaineproduction);
	}
	public void ajouterPersonnelDansEntrepise(Personnel personnel) {
		this.listePersonnel.add(personnel);
	}
	
	public void retirerElementDansEntreprise(Element elem) {
		this.listeElements.remove(elem);
	}
	public void retirerAchatDansEntreprise(Achat achat) {
		this.listeAchats.remove(achat);
	}
	public void retirerStockageDansEntreprise(Stockage stockage) {
		this.listeStockages.remove(stockage);
	}
	public void retirerChaineProductionDansEntreprise(ChaineProduction chaineproduction) {
		this.listeChaineProduction.remove(chaineproduction);
	}
	public void retirerPersonnelDansEntrepise(Personnel personnel) {
		this.listePersonnel.remove(personnel);
	}	

	public Element rechercherElement(String code) {
		Element elem = null;
		for (Element element : this.listeElements) {
			if(element.CodeCorrect(code)) {
				elem = element;
			}
		}
		return elem;
	}

	public ArrayList<Element> getListeElements() {
		return listeElements;
	}

	public ArrayList<ChaineProduction> getListeChaineProduction() {
		return listeChaineProduction;
	}
	
	public HashMap<Element, Float> getEtatDuStockage(Stockage stockage) {
		return stockage.getStockage();
	}
	
	public ArrayList<ChaineProduction> chercherChaineDeProduction(String code, String nom, int temps) {
		ArrayList<ChaineProduction> TempCP = new ArrayList<ChaineProduction>();
		for(ChaineProduction cp : this.listeChaineProduction) {
			if(cp.isChaineDeProduction(code, nom, temps)) {
				TempCP.add(cp);
			}
		}
		return TempCP;
	}

}
