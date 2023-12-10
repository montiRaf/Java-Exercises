package it.dib.po.vaccinazione;

/**
 * Classe che rappresenta l'entità cittadino
 */
public class Cittadino {
	
	private String CF;
	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;
	
	private CentroVaccinale centroAssociato;
	
	public Cittadino(String CF, String nome, String cognome, String indirizzo, String telefono) {
		this.CF = CF;	
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
	}

	public boolean isAssegnato() {
		return centroAssociato != null;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void assegna(CentroVaccinale piuVicino) {
		centroAssociato = piuVicino;
	}

	public String getCf() {
		return CF;
	}

	public String getNomeCentro() {
		if(centroAssociato != null) {
			return centroAssociato.getNome();
		}
		else {
			return "<Cittadino non associato ad un centro>";
		}
	}
}
