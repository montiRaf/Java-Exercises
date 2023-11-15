
public class TestLibro {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 500);
        Libro libro2 = new Libro("1984", "George Orwell", 502);

        libro1.visualizzaInformazioni();
        libro2.visualizzaInformazioni();

        javax.swing.JOptionPane.showMessageDialog(null, "Confronto delle pagine:\n" + libro1.confrontaPagine(libro2));
	}

}
