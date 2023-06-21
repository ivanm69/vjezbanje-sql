package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	public static void main(String[] args) {
		
//Korisnik unosi dva cijela broja
		//program ispisuje veci
		//3 i 5 -> 5
		//5 i 3 -> 3
		//5 i 5 ->

int broj1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
int broj2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

if(broj1>broj2) {
	System.out.println(broj1);
}else if (broj2>broj1) {
	System.out.println(broj2);
}else{ 
	System.out.println("Brojevi su jednaki");}


	 
  
	 
	 
		
	
	
	}

}
