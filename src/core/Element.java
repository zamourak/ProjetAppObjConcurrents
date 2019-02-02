package core;

public abstract class Element {
	private String codeElement;
	private String nom;
	private String unitee;
	private Stockage stock;
	private float prixAchat;
	private float prixVente;
	public Element(String codeElement, String nom, String unitee, float prixAchat, float prixVente) {
		this(codeElement, nom, unitee, 0, prixAchat, prixVente);
	}
	public Element(String codeElement, String nom, String unitee, float quantite, float prixAchat, float prixVente) {
		this.codeElement = codeElement;
		this.nom = nom;
		this.stock = new Stockage(quantite, unitee);
		this.prixAchat = prixAchat;
		this.prixVente=prixVente;
	}
	
	public Stockage getStock() {
		return this.stock;
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
