package edunova;

public class E02DOWhilePetlja {

	public static void main(String[] args) {
		
		//do while osigurava minimalno jedan prolazak kroz petlju
		
		do {
			System.out.println("Ispisuje se");
		}while(false);
		
		//prekidanje nastavak i ugnjezdivanje su jednaki kao i kod for i while
		
		
		
		//zbroj prvih sto brojeva
		
		int suma=0;
		int i=1;
		do {
			suma+=i;
		}while(i++<100);
		System.out.println(suma);
		
		
	}

}
