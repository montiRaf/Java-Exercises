package it.dib.po.vaccinazione;

/** 
 * Classe che rappresenta l'entità centro vaccinale
 */
public class CentroVaccinale {


	private String nome;
	private String indirizzo;
	
	private Cittadino[] cittadiniAssociati;
	
	public CentroVaccinale(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public String getNome() {
		return nome;
	}
}
