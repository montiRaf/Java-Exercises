package mp3;

public class TestMp3 {

	public static void main(String[] args) {
		Canzone canzone1 = new Canzone("Euforia", "Annalisa");
		FileMp3 file1 = new FileMp3("File 1", 2.2, canzone1);
		
		javax.swing.JOptionPane.showInternalMessageDialog(null, file1);

	}

}
