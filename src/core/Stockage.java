package core;

public class Stockage {
	private double quantite;
	private String unitee;
	
	public Stockage(String unitee) {
		this(0, unitee);		
	}
	public Stockage(double quantite, String unitee) {
		this.quantite = quantite;
		this.unitee = unitee;
	}
	public double getStock() {
		return this.quantite;
	}
	public void retirer(double quantitee) {
		this.quantite-=quantitee;
	}
	public void ajouter(double quantitee) {
		this.quantite+=quantitee;
	}
	

	public String toString() {
		return "Le stock est de " + this.quantite + " " + this.unitee;
	}
	
}
