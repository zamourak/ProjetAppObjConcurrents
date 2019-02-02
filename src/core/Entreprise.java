package core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class Entreprise {
	private ArrayList<Achat> listeAchats;
	private ArrayList<Element> listeElements;
	private ArrayList<ChaineProduction> listeChaineProduction;
	private ArrayList<Personnel> listePersonnel;
	public static Entreprise enteprise;
	
	public Entreprise() {
		this.listeAchats = new ArrayList<Achat> ();
		this.listeElements = new ArrayList<Element> ();
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
	public void retirerChaineProductionDansEntreprise(ChaineProduction chaineproduction) {
		this.listeChaineProduction.remove(chaineproduction);
	}
	public void retirerPersonnelDansEntrepise(Personnel personnel) {
		this.listePersonnel.remove(personnel);
	}	

	public Element rechercherElement(String code) {
		for(Element e : this.listeElements) {
			if(e.CodeCorrect(code)) {
				return e;
			}
		}
		return null;
	}

	public ArrayList<ChaineProduction> getListeChaineProduction() {
		return listeChaineProduction;
	}
	
	public ArrayList<Element> getListeElement() {
		return this.listeElements;
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
	
	public ArrayList<ChaineProduction> chainesProductionActive(){
		ArrayList<ChaineProduction> chainesProductionActive = new ArrayList<ChaineProduction>();
		for(ChaineProduction cp: this.listeChaineProduction) {
			if (cp.peutProduire()) {
				chainesProductionActive.add(cp);
			}
		}
		return chainesProductionActive;
	}
	public ArrayList<ChaineProduction> chainesProductionActive(ArrayList<ChaineProduction> chaineproduction){
		ArrayList<ChaineProduction> chainesProductionActive = new ArrayList<ChaineProduction>();
		for(ChaineProduction cp: chaineproduction) {
			if (cp.peutProduire()) {
				chainesProductionActive.add(cp);
			}
		}
		return chainesProductionActive;
	}
	
	public void Prevision() {
		ArrayList<ChaineProduction> chainesProductionActive = this.chainesProductionActive();
		while(chainesProductionActive.size()>0) {
			Iterator it = chainesProductionActive.iterator();
			ChaineProduction cpfirst = (ChaineProduction)it.next();
			Calendar calmin = cpfirst.getFinDeProduction();
			calmin.add(Calendar.MINUTE, cpfirst.getTemps());
			while(it.hasNext()) {
				ChaineProduction cp = (ChaineProduction) it.next();
				Calendar cal = cp.getFinDeProduction();
				cal.add(Calendar.MINUTE, cp.getTemps());
				if(calmin.after(cal)) {
					calmin=cal;
					cpfirst=cp;
				}
			}
			cpfirst.produire();
			chainesProductionActive=this.chainesProductionActive();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
