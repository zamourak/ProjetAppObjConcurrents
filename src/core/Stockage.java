package core;

import java.util.HashMap;

public class Stockage {
	private int codeStockage;
	private HashMap<Element, Integer> stock;
	public Stockage(int codeStockage) {
		this.codeStockage = codeStockage;
		this.stock = new HashMap<Element, Integer>();
	}
}
