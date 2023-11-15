/**
 * Classe per esercitarsi con l'utilizzo di this
 */

public class Libro {
	
	// ATTRIBUTI
	private String titolo;
	private String autore;
	private int numPagine;
	
	// COSTRUTTORI
	public Libro(String titolo, String autore, int numPagine) {
		this.titolo = titolo;
		this.autore = autore;
		this.numPagine = numPagine;
	}
	
	// METODI
	public void visualizzaInformazioni() {
		javax.swing.JOptionPane.showMessageDialog(null, "Titolo: " + titolo + "\n" + "Autore: " + autore + "\n" + "Num. Pagine: " + numPagine);
	}
	
	public String confrontaPagine(Libro libro) {
		String s; 
		if(this.numPagine > libro.numPagine) {
			s = this.titolo + " ha più pagine";
		}
		else if(this.numPagine < libro.numPagine) {
			s = libro.titolo + " ha più pagine";
		}
		else {
			s = "I libri hanno lo stesso numero di pagine";
		}
		return s;
	}
}
