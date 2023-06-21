package edunova;

import javax.swing.JOptionPane;

public class E01UvijetiGrananjaIF {

	public static void main(String[] args) {
		

		boolean uvjet = true;
		
		//obavezni dio if sintakse
		if (uvjet) {
			//true grana
			System.out.println("1");
		}
		//opcionalno
		else {
			//false grana
			System.out.println("2");
		}
		
		//cesce susretljiva sintaksa
		int i=0;
		if (i>0) {
			System.out.println("3");
		}
		if (i==0) 
			System.out.println("4");
		    System.out.println("5");
		    
		    //Nikad ne smijete napraviti
		    
		    boolean tocno=true;
		    
		    if (tocno==true) {
		    	System.out.println("6");
		    }
		
		    //Koristenje logickih operatora:& (and) | (ili),!(Not)
		    int t=2;
		    int k=3;
		    //ugnjijezdeni if
		    if(t!=0) {
		    	if(k>-8) {System.out.println("7");}
		    }
		    //&(and)komada 1 provjerava oba uvijeta
		    if(t!=0 & k>-8) {
		    	System.out.println("8");
		    }
		    //&& komada 2:Drugi uvjet se ne provjerava ako prvi nije zadovoljen
		    
		    if(t!=0&& k>-8) {
		    	System.out.println("9");
		    }
		    //Mi cemo u nastavku koristiti &&
		    
		    // |(ili) komada 1 provjerava oba uvijeta
		    
		    if(t==2 | k>7) {
		    	System.out.println("10");
		    }
		    // ||
		    if(t==2 || k>7) {
		    	System.out.println("11");}
		    //Mi cemo koristit ||(ili)
		    
		    if(!tocno) {//NE ovo tocno==false
		    	System.out.println("12");
		    }
		    int ocjena=3;
		    
		    if(ocjena==1) {
		    	System.out.println("Nedovoljan");
		    	
		    }else if(ocjena==2) {
		    	System.out.println("Dovoljan");
		    	
		    }else {System.out.println("Super");
		       }
	
		    int broj= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		    if(broj%2==0) {
		    	System.out.println("Broj je paran");
		    }else {System.out.println("Broj je neparan");}
		    
		    //tercijalni operator?
		    //inline if
		    System.out.println("Broj je"  + (broj%2!=0?  "ne" :"")+  "paran");
		    
	
	
	
	}

}
