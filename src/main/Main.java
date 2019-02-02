package main;

import java.util.HashMap;

import core.*;
import gestionfichier.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("commencement");
		Entreprise entreprise = new Entreprise();
		FichierCSV fElement = new FichierCSVElement();
		FichierCSV fcp = new FichierCSVChaineDeProduction();
		fElement.Charger();
		fcp.Charger();
		/*for (Element e : Entreprise.enteprise.getListeElement()) {
			System.out.println(e);
		}
		for (ChaineProduction cp : Entreprise.enteprise.getListeChaineProduction()) {
			System.out.println(cp);
		}*/
		
		System.out.println("------------------ TEST avant \n\n" +Entreprise.enteprise.getListeChaineProduction().get(1));
		
		Entreprise.enteprise.getListeChaineProduction().get(0).attribuerNiveauActivite(1);
		Entreprise.enteprise.getListeChaineProduction().get(1).attribuerNiveauActivite(1);
		System.out.print("démarrage prévision");
		Entreprise.enteprise.Prevision();
		
		System.out.println("------------------ TEST après\n\n" +Entreprise.enteprise.getListeChaineProduction().get(1));
		

		
		
		
		
	}

}
