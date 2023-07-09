package edunova;

public class Z02 {

	public static void main(String[] args) {
		
	
//Kreirat klasu racunalo
//definirat minimalno 3 svojstva
//razlicitih tipova
	//u ovoj klasi napraviti dvije
	//instace klase racunalo

	
		Racunalo[]racunalo=new Racunalo[2];
		racunalo[0]=new Racunalo("Gamer Profundis",true,969.56f);
		racunalo[1]=new Racunalo("Gamer Iris",false,559.99f);
		
		for(Racunalo r:racunalo) {
			
			System.out.println(r.getNaziv()+ " || " +r.isDostupnost()+ " || "+r.getCijena()+"||");
		}
		
		

	}
}