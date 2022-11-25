package oppgaver;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		int x = Integer.parseInt(showInputDialog("heltall større enn 0"));
		int teller = 1;
			
		for(int i = 0; i < x; i++) {
			teller = teller * (x-i) ;
			System.out.print((x-i) + "*");
			
		}
		System.out.println("=" + teller);
			
	}

}
