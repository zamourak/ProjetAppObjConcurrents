package core;

import java.util.HashMap;

public class Stockage {
	private int codeStockage;
	private HashMap<Element, Integer> stock;
	public Stockage(int codeStockage) {
		this.codeStockage = codeStockage;
		this.stock = new HashMap<Element, Integer>();
	}
	
	public void ajouterElementPourStockage(Element elem, int quantitee) {
		if(this.stock.containsKey(elem)) {
			this.stock.put(elem, this.stock.get(elem)+quantitee);
		}else {
			this.stock.put(elem, quantitee);
		}
	}
	public void retirerElementPourStockage(Element elem) {
		this.stock.remove(elem);
	}
	public void retirerElementPourStockage(Element elem, int quantitee) {
		if(this.stock.containsKey(elem)) {
			if(this.stock.get(elem)-quantitee >= 0) {
				this.stock.put(elem, this.stock.get(elem)-quantitee);
			}else {
				this.retirerElementPourStockage(elem);
			}
		}
	}
	
	
	
}
