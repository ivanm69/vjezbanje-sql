package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	public static void main(String[] args) {
		
		int i =Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		if (i%2==0) {
	    	System.out.println("Broj je paran");
	    }else {System.out.println("Broj je neparan");}
		
		 System.out.println("Broj je"  + (i%2!=0?  "ne" :"")+  "paran");
		
		
		
		
		
	}

}
