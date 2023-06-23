package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		// program unosi broj između 
				// 1 i 999
				// U slučaju da je izvan tog raspona
				// ispisati grešku i prekinuti program
				// Program ispisuje 1. znamenku upisanog broja
				
				// -5 greška
				// 1067 greška
				// 456 4
				// 6 6
				// 89 8
	
		
	int broj=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj izmedju 1 i 999:"));
	if (broj<1||broj>999) {
		System.out.println("Broj je izvan raspona");
	
		return;
	}else {String brojevi = Integer.toString(broj);
	char br[] = brojevi.toCharArray();
	System.out.println(br[0]);}
	 
	
	
				
		
		
				// Program unosi 2 broja
				// Ako su oba broja parni
				// ispisuje njihov zbroj
				// inače ispisuje njihovu razliku	
	
int br1=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
int br2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

if(br1%2==0&&br2%2==0) {
	System.out.println(br1+br2);
}else if(br1%2==0+1&&br2%2==0){
	System.out.println(br1-br2);
}else if(br1%2==0&&br2%2==0+1) {
	System.out.println(br1-br2);
}

else {
	System.out.println("Neispravan unos");
return;} 

	
	
	}
   
	}


	



