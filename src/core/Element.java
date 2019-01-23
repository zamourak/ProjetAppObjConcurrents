package core;

public abstract class Element {
	private String codeElement;
	private String nom;
	private String unitee;
	private float prixAchat;
	private float prixVente;
	public Element(String codeElement, String nom, String unitee, float prixAchat, float prixVente) {
		this.codeElement = codeElement;
		this.nom = nom;
		this.unitee = unitee;
		this.prixAchat = prixAchat;
		this.prixVente=prixVente;
	}
	
	public boolean CodeCorrect(String code) {
		if(this.codeElement.equals(code)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return this.codeElement + " - " + this.nom + "\nmesure : " +this.unitee+ "\nprix d'achat : " + this.prixAchat
				+ "\nprix de vente :" +this.prixVente; 
	}
	
	
	
	
	
	
}
