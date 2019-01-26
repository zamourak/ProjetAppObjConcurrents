package gestionfichier;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import core.Element;
import core.Entreprise;
import core.MatieresPremieres;
import core.Stockage;

public class FichierCSVStockage extends FichierCSV{

	public FichierCSVStockage() {
		super("Data/Stockage.csv");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Charge les données sur les Stockage écrites dans le fichier Stockage
	 */
	public void ChargerChaineDeProduction() {
		ArrayList<String> elements = this.Lecture();
		for (String src : elements) {
			String[] attribut = src.split(",");
			String code = attribut[0];
			String nom = attribut[1];
			Stockage stockage = new Stockage(code, nom);
			Entreprise.enteprise.ajouterStockageDansEntreprise(stockage);
			ChargerContenu(attribut, stockage);
		}		
	}
	
	private void ChargerContenu(String[] ligne, Stockage stockage) {
		for (int i = 2; i<ligne.length; i+=2) {
			String codeElem = ligne[i].substring(ligne[i].indexOf('(')+1);
			float quantitee = Float.parseFloat(ligne[i+1].substring(0, ligne[i+1].indexOf(')')));
			Element elem = Entreprise.enteprise.rechercherElement(codeElem);
			stockage.ajouterElementPourStockage(elem, quantitee);
		}
	}
	

	@Override
	public String[][] Ecriture() {
		// TODO Auto-generated method stub
		return null;
	}

}
