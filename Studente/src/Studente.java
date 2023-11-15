
public class Studente {
	
	// ATTRIBUTI DELLA CLASSE
	private int matricola;
	private String nome;
	private String cognome;
	
	// COSTRUTTORI
	public Studente(int matricola, String nome, String cognome) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Studente() {
		this(0, "Nome non inserito", "Cognome non inserito");
	}
	
	// METODI
	@Override
	public String toString() {
		return nome + " " + cognome + " mat. " + matricola;
	}
}
