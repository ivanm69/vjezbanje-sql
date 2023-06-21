package edunova;

public class E04UlazniParametri {

	public static void main(String[] args) {
		
		//program mora primiti dva parametra
		
		if(args.length!=2) {
			System.out.println("Obavezna dva parametra");
			return; //prekida izvodenje metode -short circuiting
			
		}
		
		System.out.println(args[0]);
		
		
	}

}
