package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
		//Korisnik unosi dva cijela broja
				//Program ispisuje 
				//zbroj svih neparnih brojeva
				//izmedu dva broja
		int pb=Integer.parseInt(JOptionPane.showInputDialog("unesi prvi broj"));
		int db=Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
		
		int manji= pb< db? pb:db;
		int veci=pb >db ? pb :db;
		int zbroj=0;
		for(int i=manji;i<=veci;i++) {
			//ista sintaksa kao ova ispod  zbroj=i%2 !=0?zbroj + i:zbroj;
			if(i%2!=0) {
				zbroj+=i;
			}
			
		}
		System.out.println(zbroj);
	
	
	
		
		
		
		
		
		
	}

}
