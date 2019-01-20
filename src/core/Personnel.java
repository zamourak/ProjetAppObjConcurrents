package core;

import java.util.ArrayList;

public class Personnel {
	private int codePersonnel;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	private String telephone;
	private ArrayList<ChaineProduction> qualification;
	public Personnel(int codePersonnel, String nom, String prenom, String adresse, String email, String telephone) {
		this.codePersonnel = codePersonnel;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
		this.qualification = new ArrayList<ChaineProduction> ();
	}
	
	

}
