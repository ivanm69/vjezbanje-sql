package edunova;

public class E02KoristenjeMetoda {

	public static void main(String[] args) {
		E01Metode.tip1();
		
		
		//NE mozes pristupiti metodi pozivom na klasu ako nije static
		
		//System.out.println(Pomocno.valjanOIB("58965852322"));
		
		//Ne staticne metode se pozivaju na objektu
		
		//objekt koji je instanca klase
		
		Pomocno p=new Pomocno();
		//objekti mogu pamtiti stanje
		
		//System.out.println(p.valjanOIB("64480721192"));
		//Warning kada je metoda static 
	
		System.out.println(Pomocno.valjanOIB("58965852322"));
	}
}
