package it.unisa.model;
import java.util.ArrayList;

public class Cart {
	private ArrayList<ProductBean> prodotti;
	
	public Cart() {
		this.prodotti = new ArrayList<ProductBean>();
	}
	
	public void addProduct(ProductBean prodotto) {
		prodotti.add(prodotto);
	}
	
	public void deleteProduct(ProductBean prodotto) {
		for(ProductBean prod : prodotto) {
			if(prod.getCode() == prodotto.getCode()) {
				prodotto.remove(prod);
				break;
			}
		}
 	}
	public ArrayList<ProductBean> getProdotti() {
		return prodotti;
	}
	
}
