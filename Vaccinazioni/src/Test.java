import it.dib.po.vaccinazione.SistemaVaccinale;

public class Test {

	public static void main(String[] args) {
		SistemaVaccinale sistema = new SistemaVaccinale();
		sistema.registraCittadino("MTRRZA21X54L", "Mario", "Rossi", "C.so Italia, 61", "+39 3339122743");
		System.out.println("Cittadini inseriti: " + sistema.numeroRegistrati());
		
		sistema.inserisciCentro("Centro vaccinazioni dib", "c.so Duca, 24");
		sistema.assegnaCittadini();
		
		System.out.println(sistema.centroDelCittadino("MTRRZA21X54L"));
	}

}
