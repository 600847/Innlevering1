package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		String melding = "Poengsum?";
		String meldingUt = "Karakteren din er: ";
		
		int antall = 0;
		final int MAKS = 10;
		final int MIN = 0;
	
		for (antall = 1; antall <= MAKS && antall >= MIN; antall++)	{
		int poengsum = Integer.parseInt(showInputDialog(melding));
		
	
			
		if (poengsum < 40) {
			String karakter = "F";
			showMessageDialog(null, meldingUt + karakter);
		} 
		else if (poengsum < 50) {
			String karakter = "E";
			showMessageDialog(null, meldingUt + karakter);
		}
		else if (poengsum < 60) {
			String karakter = "D";
			showMessageDialog(null, meldingUt + karakter);
		}
		else if (poengsum < 80) {
			String karakter = "C";
			showMessageDialog(null, meldingUt + karakter);
		}
		else if (poengsum < 90) {
			String karakter = "B";
			showMessageDialog(null, meldingUt + karakter);
		}
		else if (poengsum < 101) {
			String karakter = "A";
			showMessageDialog(null, meldingUt + karakter);
		}
		
		else {
			showMessageDialog(null, "Poengsummen din er ugyldig");
			antall--;
		}
		
		
		
		
		}
		
	}
}