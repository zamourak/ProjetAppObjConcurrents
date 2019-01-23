package core;

import java.util.HashMap;
import java.util.Iterator;

public class Stockage {
	private String codeStockage;
	private String nom;
	private HashMap<Element, Integer> stock;
	public Stockage(String codeStockage, String nom) {
		this.codeStockage = codeStockage;
		this.nom=nom;
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
	
	public String toString() {
		String src = "stockage : :" +this.codeStockage + " - " + this.nom + ":\n" ;
		Iterator it = this.stock.keySet().iterator();
		Element elem;
		Integer quantitee;
		while(it.hasNext()) {
			elem = (Element) it.next(); 
			quantitee = this.stock.get(elem);
			src+="Element : " + elem + " quantitee :" +quantitee;
		}
		return src;
	}
	
	
	
}
