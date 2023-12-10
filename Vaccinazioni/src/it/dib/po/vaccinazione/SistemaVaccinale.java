package it.dib.po.vaccinazione;

/**
 * Classe di servizio per il sistema vaccinale
 */
public class SistemaVaccinale {
	
	private static final int DIM_DEFAULT = 100;
	private Cittadino[] cittadiniRegistrati;
	private int numCittadini;
	private CentroVaccinale[] centri;
	private int numCentri;
	
	public SistemaVaccinale() {
		cittadiniRegistrati = new Cittadino[DIM_DEFAULT];
		centri = new CentroVaccinale[DIM_DEFAULT];
	}
	
	/**
	 * Permette di inserire nel sistema vaccinale le informazioni di un nuovo **cittadino**
     * (CF, nome, cognome, indirizzo, telefono)
	 */
	public void registraCittadino(String CF, String nome, String cognome, String indirizzo, String telefono) {
		Cittadino c = new Cittadino(CF, nome, cognome, indirizzo, telefono);
		cittadiniRegistrati[numCittadini] = c;
		numCittadini++;
	}
	
	/**
	 * Restituisce il numero di cittadini registrati
	 * @return numero cittadini
	 */
	public int numeroRegistrati() {
		return numCittadini;
	}
	
	/**
	 * Aggiunge un nuovo centro vaccinale al sistema
	 * @param nome nome del centro vaccinale
	 * @param indirizzo indirizzo del centro
	 */
	public void inserisciCentro(String nome, String indirizzo) {
		CentroVaccinale c = new CentroVaccinale(nome, indirizzo);
		centri[numCentri++] = c;
	}
	
	/**
	 * Per ogni cittadino (non ancora assegnato)
	 * cerca il centro più vicino e assegna il cittadino a quel centro
	 */
	public void assegnaCittadini() {
		for(Cittadino c : cittadiniRegistrati) {
			if(c != null && !c.isAssegnato()) {
				CentroVaccinale piuVicino = null;
				double distanzaMin = Double.MAX_VALUE;
				for(CentroVaccinale centro : centri) {
					if(centro != null) {
						double d = calcolaDistanza(c.getIndirizzo(), centro.getIndirizzo());
						if(d < distanzaMin) {
							distanzaMin = d;
							piuVicino = centro;
					}
				}
				}
				c.assegna(piuVicino);
			}
		}
	}
	
	/**
	 * Utilizza un servizio online di geolocalizzazione per calcolare la distanza in km tra i due indirizzi dati (al momento un numero casuale)
	 * @param indirizzo 
	 * @param indirizzo2
	 * @return distanza in km
	 */
	private double calcolaDistanza(String indirizzo, String indirizzo2) {
		return Math.random() * 100; 	// numero pseudo-casuale compreso tra 0 e 100
	}

	public String centroDelCittadino(String CF) {
		for(Cittadino c : cittadiniRegistrati) {
			if(c != null && c.getCf().equals(CF)) {
				return c.getNomeCentro();
			}
		}
		return "<Cittadino non trovato";
	}
}
