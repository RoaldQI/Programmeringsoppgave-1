package oppgaver;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
		
			int poengsum = Integer.parseInt(showInputDialog("skriv inn poengsum"));
		
			String karakter = "Ugyldig poengsum";
		
		if (poengsum <= 39)
		karakter = "F";
		
		if (poengsum >= 40 && poengsum <= 49)
		karakter = "E";
		
		if (poengsum >= 50 && poengsum <= 59)
		karakter = "D";
		
		if (poengsum >= 60 && poengsum <= 79)
		karakter = "C";
		
		if (poengsum >= 80 && poengsum <= 89)
		karakter = "B";
		
		if (poengsum >= 90 && poengsum <= 100)
		karakter = "A";
		
		
		
		
		
		showMessageDialog(null, poengsum + " poen"
				+ "g gir karakter: " + karakter);
		

		}
	}
}