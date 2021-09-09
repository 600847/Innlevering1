package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
	
		double inntekt = Double.parseDouble(showInputDialog("Skriv inn din inntekt"));
		String meldingUt = "Din trinnskatt er: ";
		String meldingUt2 = " Som bli på ";
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.132;
		double trinn4 = 0.162;
		
		
			
		if (inntekt > 1021550) {
			
			showMessageDialog(null, meldingUt + "4." + meldingUt2 + inntekt*trinn4);
		} 
		else if (inntekt >= 651250 && inntekt <= 1021550) {
			
			showMessageDialog(null, meldingUt + "3." + meldingUt2 + inntekt*trinn3);
		}
		else if (inntekt >= 260100  && inntekt <= 651249) {
			
			showMessageDialog(null, meldingUt + "2." + meldingUt2 + inntekt*trinn2);
		} 
		else if (inntekt >= 184800  && inntekt <= 260099) {
			
			showMessageDialog(null, meldingUt + "1." + meldingUt2 + inntekt*trinn1);		
		} 
		else if (inntekt >= 0  && inntekt <= 184799) {
			
			showMessageDialog(null, meldingUt + "ingen trinnskatt");
	}
		else {
			showMessageDialog(null, "Ugyldig");
		}

}
}
