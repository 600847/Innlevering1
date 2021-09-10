package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("n!"));
		
		int svar = fakultet(n);
		
		showMessageDialog(null, svar);
		
	}
	public static int fakultet(int n) {
		if (n == 1) {
			return 1;
		}	else {
			
			return n* fakultet(n-1);
		}
	}
}
