package it.unisa.model;

import java.io.Serializable;

public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	int codice;
	String nome;
	String descrizione;
	int quantita;
	int prezzo;
	String tipo; //forse qui va fatto un enum perchè sul database abbiamo che il tipo può essere solo(Esig,Liquido,Atom)
	
	public ProductBean() {
		codice = -1;
		nome = "";
		descrizione = "";
		quantita = 0;
		tipo = "";
	}
	
	public int getCodice() {
		return codice;
	}
	
	public void setCodice(int codice) {
		this.codice = codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getQuantita() {
		return quantita;
	}
	
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return nome + " (" + codice + "), " + prezzo+" "+ quantita+". " +descrizione ;
	}
}
