package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {
	//program osigurava i ucitanje broja od korisnika
		//broj je u rasponu 20 do 50 i nije 30
		//koristi while petlju
		
		int i;
		while(true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("unesi broj"));
			if(i>=20&&i<=50&&i!=30){
				break;
			}
			JOptionPane.showInternalMessageDialog(null, "Nije Dobro");
		}
			System.out.println(i);
			
		
	
	
	
	
	
		}
	}


