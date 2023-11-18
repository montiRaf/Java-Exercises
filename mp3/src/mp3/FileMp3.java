package mp3;

public class FileMp3 {
	
	// ATTRIBUTI
	private String nomeFile;
	private double dimByte;
	private Canzone canzone;
	
	// COSTRUTTORI
	public FileMp3(String nomeFile, double dimByte, Canzone canzone) {
		this.nomeFile = nomeFile;
		this.dimByte = dimByte;
		this.canzone = canzone;
	}
	
	public FileMp3(String nomeFile, Canzone canzone) {
		this(nomeFile, 0.0, canzone);
	}
	
	// METODI
	public double getDimByte() {
		return dimByte;
	}
	
	public void setDimByte(double dimByte) {
		this.dimByte = dimByte;
	}
	
	public String getNomeFile() {
		return nomeFile;
	}
	
	public String getTitolo() {
		return canzone.getTitolo();
	}
	
	public String getAutore() {
		return canzone.getAutore();
	}
	
	@Override
	public String toString() {
		return nomeFile + ":\n" + "Titolo: " + canzone.getTitolo() + "\n" + "Autore: " + canzone.getAutore() + "\n" + "Dimensione: " + dimByte + " byte";  
	}
	
}
