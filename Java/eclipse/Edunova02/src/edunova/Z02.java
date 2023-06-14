package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		

		int i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj")
				);
		int j=Integer.parseInt(JOptionPane.showInputDialog("Drugi Broj")
				);
		//jedan od brojeva mora biti float pa "castamo"varijablu u float	
		System.out.println(i/(float)j);
		
		
		//ekvivalent onom gore
		
	}

}
