package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	public static void main(String[] args) {
		
	String grad=(JOptionPane.showInputDialog("Unesi grad"));	
		switch(grad) {
		case "Osijek":
			System.out.println("Osjecko-Baranjska zupanija");
		break;
		
		case "Orahovica":
			System.out.println("Viroviticko-Podravska zupanija");
		break;
		case "Kutjevo":
			System.out.println("Požesko-slavonska zupanija");
		break;
		case "Slavonski Brod":
			System.out.println("Brodsko-Posavska zupanija");
		break;
		
		default:
			System.out.println("Svi drugi");
		
		}
		
		
		
		
	}

}
