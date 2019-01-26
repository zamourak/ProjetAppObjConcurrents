package main;

import core.*;
import gestionfichier.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entreprise e = new Entreprise();
		
		FichierCSVElement fE = new FichierCSVElement();
		FichierCSVChaineDeProduction fCdP = new FichierCSVChaineDeProduction();
		
		fE.ChargerElement();
		System.out.println("---------------");
		for(Element elem : Entreprise.enteprise.getListeElements()) {
			System.out.println("iiio"+elem);
		}
		System.out.println("---------------");
		fCdP.ChargerChaineDeProduction();
		for (ChaineProduction cp : Entreprise.enteprise.getListeChaineProduction()) {
			System.out.println(cp);
		}
		
		
		
		
		
	}

}
