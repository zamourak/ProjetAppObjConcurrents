package gestionfichier;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import core.Element;
import core.Entreprise;
import core.MatieresPremieres;
import core.ProduitsFinis;

public class FichierCSVElement extends FichierCSV{

	public FichierCSVElement() {
		super("Data/Elements.csv");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Charge les données sur les Eléments écrites dans le fichier Element
	 */
	public void ChargerElement() {
		ArrayList<String> elements = this.Lecture();
		for (String src : elements) {
			String[] attribut = src.split(",");
			String code = attribut[0];
			String nom = attribut[1];
			String unite = attribut[2];
			float achat;
			float vente;
			if(attribut[3].equals("NA")) {
				achat=-1;
			}else {
				achat = Float.parseFloat(attribut[3]);
			}
			if(attribut[4].equals("NA")) {
				vente=-1;
			}else {
				vente = Float.parseFloat(attribut[4]);
			}
			if (attribut[5].equals("PF")) {
				Entreprise.enteprise.ajouterElementDansEntreprise(new MatieresPremieres(code, nom, unite, achat, vente));
			}else {
				Entreprise.enteprise.ajouterElementDansEntreprise(new MatieresPremieres(code, nom, unite, achat, vente));
			}
		}		
	}

	@Override
	public String[][] Ecriture() {
		// TODO Auto-generated method stub
		return null;
	}

}
