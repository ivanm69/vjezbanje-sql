package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
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

}


