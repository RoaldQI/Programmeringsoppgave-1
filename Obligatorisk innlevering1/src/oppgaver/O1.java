package oppgaver;
import static javax.swing.JOptionPane.*;

public class O1 {
	
		public static void main(String[] args) {
			
			String inntekt = showInputDialog("bruttoinntekt");
			int brutto = Integer.parseInt(inntekt);
			
			
			
			double trinn1 = brutto/100*0.93;
			double trinn2 = brutto/100*2.41;
			double trinn3 = brutto/100*11.42;
			double trinn4 = brutto/100*14.32;
			
			if (brutto <= 164100) {
				System.out.println("Du har ikke trinnskatt");
			} else if (brutto >= 164101 && brutto <=230950)
				System.out.println("Du er på trinn 1");
			
			else if (brutto >= 230951 && brutto <= 580650)
			System.out.println("Du er på trinn 2");
			
			else if (brutto >= 580651 && brutto <= 934050)
				System.out.println("Du er på trinn 3");
			
			else if (brutto <= 934051)
				System.out.println("Du er på trinn 4");

		}
	}
	}
