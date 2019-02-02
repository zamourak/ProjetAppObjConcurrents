package main;

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
		for (Element e : Entreprise.enteprise.getListeElement()) {
			System.out.println(e);
		}
		for (ChaineProduction cp : Entreprise.enteprise.getListeChaineProduction()) {
			System.out.println(cp);
		}
		
		
		
		
		
		
		
		
	}

}
