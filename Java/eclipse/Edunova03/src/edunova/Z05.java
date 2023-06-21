package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		
		int pb=Integer.parseInt(JOptionPane.showInputDialog("PB"));
		int db=Integer.parseInt(JOptionPane.showInputDialog("DB"));
		int tb=Integer.parseInt(JOptionPane.showInputDialog("TB"));
		
	if (pb>=db&&pb>=tb) {
		System.out.println(pb);
	
	}else if (db>= pb && db>= tb) {
		System.out.println(db);
	}else {
		System.out.println(tb);
	}
	}
		
		
}


