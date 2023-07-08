package edunova;

public class E03ForEachPetlja {

	public static void main(String[] args) {
		

		
	//deklariajte niz od 7 vrijednosti i svima dodjelite broj 7
		int[] niz= {1,2,3,4,5,6,7};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		
	//foreach ide uvijek od pocetka do kraja	
		for(int en:niz) {
			System.out.println(en);
		}
		
		//prekidanje,nastavak, ugnjezdivanje je isto kao kod for while i do while
		
		
	}

}
