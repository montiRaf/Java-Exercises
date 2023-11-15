import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// finestra di dialogo per input dall'utente
		ArrayList<Studente> studenti = new ArrayList<>();
		String num = javax.swing.JOptionPane.showInputDialog("Quanti studenti?");
		Integer numStud = Integer.parseInt(num);
		
		for(int i = 0; i < numStud; i++) {
			String nome = javax.swing.JOptionPane.showInputDialog("Nome: ");
			String cognome = javax.swing.JOptionPane.showInputDialog("Cognome: ");
			String matricola = javax.swing.JOptionPane.showInputDialog("Matricola: ");
			Integer mat = Integer.parseInt(matricola);
			Studente s = new Studente(mat, nome, cognome);
			studenti.add(s);
		}
		
		javax.swing.JOptionPane.showMessageDialog(null, studenti);
		System.gc();	// utilizzo del garbage collector 
	}

}
