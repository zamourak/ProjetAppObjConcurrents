package core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;

public class ChaineProduction {
	private String codeChaineProduction;
	private String nom;
	private int niveauActivitee;
	private int temps;
	
	private HashMap<Element, Double> entree;
	private HashMap<Element, Double> sortie;
	
	private ArrayList<Production> listeproduction;
		
	public ChaineProduction(String codeChaineProduction, String nom, int niveauActivitee, int temps) {
		this.codeChaineProduction = codeChaineProduction;
		this.nom = nom;
		this.niveauActivitee = niveauActivitee;
		this.temps = temps;
		this.entree = new HashMap<Element, Double> ();
		this.sortie = new HashMap<Element, Double> ();
		this.listeproduction = new ArrayList<Production>();
	}
	public ChaineProduction(String codeChaineProduction, String nom, int temps) {
		this(codeChaineProduction, nom, 0, temps);
	}
	
	public ChaineProduction(ChaineProduction cc) {
		this(cc.codeChaineProduction, cc.nom, cc.temps);
	}
	public void ajouterElementPourDictionnaireDeProductionEnEntree(Element elem, double quantitee) {
		this.entree.put(elem, quantitee);
	}
	public void ajouterElementPourDictionnaireDeProductionEnSortie(Element elem, double quantitee) {
		this.sortie.put(elem, quantitee);
	}
	public void retirerElementPourDictionnaireDeProductionEnEntree(Element elem) {
		this.entree.remove(elem);
	}
	public void retirerElementPourDictionnaireDeProductionEnSortie(ProduitsFinis elem) {
		this.entree.remove(elem);
	}
	public void modifierElementPourDictionnaireDeProductionEnEntree(Element elem, double quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnEntree(elem, quantitee);
	}
	public void modifierElementPourDictionnaireDeProductionEnSortie(Element elem, double quantitee) {
		this.ajouterElementPourDictionnaireDeProductionEnSortie(elem, quantitee);
	}
	
	public void ajouterProduction() {
		this.listeproduction.add(new Production(this.niveauActivitee));
	}
	public void retirerProduction(Production production) {
		this.listeproduction.remove(production);
	}
	
	public boolean isChaineDeProduction(String code, String nom, int temps) {
		if(this.codeChaineProduction.equals(code) && this.nom.equals(nom) && this.temps == temps) {
			return true;
		}
		else if(this.codeChaineProduction.equals(code) && this.nom.equals(nom) && this.temps == 0) {
			return true;
		}
		else if(this.codeChaineProduction.equals(code) && this.nom == null && this.temps == temps) {
			return true;
		}
		else if(this.codeChaineProduction == null && this.nom.equals(nom) && this.temps == temps) {
			return true;
		}
		else if(this.codeChaineProduction.equals(code) && this.nom == null && this.temps == 0) {
			return true;
		}
		return false;
	}

	public String toString() {
		String src = this.codeChaineProduction + " - " + this.nom + " - " + this.temps;
		src += "\nElement en Entrée :\n";
		for (Element e : this.entree.keySet()) {
			src += e + "Quantitee dont on a besoin " + this.entree.get(e);
		}
		src += "\nElement en Sortie :\n";
		for(Element e : this.sortie.keySet()) {
			src += e + "Quantitee dont qui en ressort " + this.sortie.get(e) + ";\n";
		}
		src += "\n\n\n";
		return src;
		
	}
	
	public void effacerPrevision() {
		for (Production p : this.listeproduction) {
			for (Element e : this.entree.keySet()) {
				e.getStock().ajouter(p.getNiveauProduction()*this.entree.get(e));
			}
			for(Element e : this.sortie.keySet()) {
				e.getStock().retirer(p.getNiveauProduction()*this.sortie.get(e));
			}
		}
		this.listeproduction.clear();
	}
	
	public boolean peutProduire() {
		if(this.niveauActivitee==0) {
			return false;
		}
		for (Element e : this.entree.keySet()) {
			if(e.getStock().getStock()-this.entree.get(e)*this.niveauActivitee<0) {
				return false;
			}
		}
		return true;
	}	
	
	public void produire(){
		for (Element e : this.entree.keySet()) {
			e.getStock().retirer(this.entree.get(e)*this.niveauActivitee);
		}
		for (Element e : this.sortie.keySet()) {
			e.getStock().ajouter(this.sortie.get(e)*this.niveauActivitee);
		}
		Calendar cal = this.getFinDeProduction();
		cal.add(Calendar.MINUTE, this.temps);
		this.listeproduction.add(new Production(this.niveauActivitee, cal));		
	}
		
	public Calendar getFinDeProduction() {
		Calendar cTemp = new GregorianCalendar();
		for(Production p : this.listeproduction) {
			if(p.getDateProduction().after(cTemp)) {
				cTemp = p.getDateProduction();
			}
		}
		return cTemp;
	}
	
	public void attribuerNiveauActivite(int niveauActivitee) {
		this.niveauActivitee= niveauActivitee;
	}
	
	public int getTemps() {
		return this.temps;
	}
}
