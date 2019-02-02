package core;

public class Stockage {
	private float quantite;
	private String unitee;
	
	public Stockage(String unitee) {
		this(0f, unitee);		
	}
	
	public Stockage(float stock, String unitee) {
		this.quantite = stock;
		this.unitee = unitee;
	}
	public float getStock() {
		return this.quantite;
	}
	

	public String toString() {
		return "Le stock est de " + this.quantite + " " + this.unitee;
	}
	
}
