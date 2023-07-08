package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		//program unosi od korisnika dva broja izmedju 20 i 80
		//program ispisuje sve neparne brojeve 
		//izmedju unesenih brojeva unazad (od veceg prema manjem)
		//koristiti do while
		
		int i;
		int i2;

		do {
			i = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));

			if (i >= 20 && i <= 80) {
				break;
			}
		} while (true);

		do {
			i2 = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
			if (i2 >= 20 && i2 <= 80) {
				break;
			}
		} while (true);

		int manji = i < i2 ? i : i2;
		int veci = i < i2 ? i2 : i;
		int broj = veci;
		do {
			if (broj % 2 == 1) {
				System.out.println(broj);
			}
			broj--;
		} while (broj >= manji);
	}
}

			 			 
				
			 

			
	
	
	
		
		