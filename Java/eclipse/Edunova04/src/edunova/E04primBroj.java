package edunova;

import javax.swing.JOptionPane;

public class E04primBroj {

	public static void main(String[] args) {
		
		//prim broj/prime number
		
		//prim broj je cjelobrojno djeljiv s jedan i sam sa sobom
		
	int broj=254821;
		
		//hipoteza
		boolean prim=true;
		for(int i=2;i<broj;i++){
			if (broj%2==0) {
				
				prim=false;
				}break;//// čitati https://www.bigocheatsheet.com/
			}
		System.out.println(broj + (prim  ?  " je" : " nije")+" prim broj");
	
	
	
	}
	
	int pb=Integer.parseInt(JOptionPane.showInputDialog("pb"));
	int db = Integer.parseInt(JOptionPane.showInputDialog("db"));{

	
	if(pb>db) {
		int zamjenski=pb;
		pb=db;
		db=zamjenski;
		}
	
	boolean prim=true;
	
	for(int i=pb;i<=db;i++) {
		prim=true;
		for(int j = 2;j<i;j++) {
			if (i%j==0) {
				prim=false;
			}
		}

		if(prim) {
			System.out.println(i);
		}
			}

	}
}


