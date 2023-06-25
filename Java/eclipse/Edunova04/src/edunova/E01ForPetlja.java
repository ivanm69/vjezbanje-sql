package edunova;

public class E01ForPetlja {

	public static void main(String[] args) {
		
		//ispisite 10 linija jednu ispod druge s tekstom Osijek
		//najgore rijesenje
		System.out.println("1.********");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	System.out.println("Osijek");
	
	//FOR (od kuda; do kuda ;korak)
	 System.out.println("2.*********");
	for(int i=0;i<10;i=i+1) {
	System.out.println("Osijek");
	
	}	
	System.out.println("3.*********");
	for(int i=0;i<10;i+=1) {
		System.out.println(i);
	}
	
	System.out.println("4.*********");
	
	for(int i=0;i<10;i++) {
		System.out.println(i+1);//i+1 ne mjenja vrijednost varijable i
	
	}
		
	System.out.println("5.*********");
	for(int i=100;i>0;i-=5) {
		System.out.println(i);
	}
	
	System.out.println("6.*********");
	//zbroj prvih 100 brojeva
	int zbroj=0;
	for(int i=1;i<=100;i++) {
		//System.out.println(i);
		zbroj+=i;
	
	}
	System.out.println(zbroj);

	//ispisi sve parne brojeve od 1 do 27
	System.out.println("7.*********");
	for(int i=1;i<=27;i++) {
		if(i%2==0)
	System.out.println(i);
	}
	
	int[]niz= {2,2,3,4,5,5,6};
	
	//ispisi sve elemente niza jedno ispod drugog
	System.out.println("8.*********");
	for(int i=0;i<niz.length;i++) {
		System.out.println(niz[i]);
	}
	
	
	
/*	for(int i=1;i>0;i++) {//Ovo nije beskonacna petlja
	*/	
	//beskonacna petlja
	//System.out.println("9. ********************");
	for(;;) {
		System.out.println(Math.random() + " " + Math.random()
		+ " " + Math.random());
	//nasilno prekidanje petlje
		break;
	
	}
	System.out.println("10. ********************");
	//== provjerava vrijednost
	for(int i=0;i<10;i++) {
		if(i==7) {
			break;
		}
	System.out.println(i);
	}
	// petlju je moguce nastaviti/preskociti
	System.out.println("11. ********************");
	for(int i=0;i<10;i++) {
		if(i==3||i==7) {
	continue;
		}
	System.out.println(i);
	}
	System.out.println("12. ********************");
	for(int i=0;i<10;i++) {
		if(i==3||i==7) {
	continue;
		}
		if(i==8) {
			break;
		}
		System.out.println(i);
	}
	System.out.println("13. ********************");
	for(int i=1;i<10;i++) {
		for(int j=1;j<10;j++) {
		
			System.out.print(i*j+" ");
		}
		System.out.println();
	}
	
	//prekidanje unutarnjih petlji
	vanjska:
	for(int i=1;i<10;i++) {
		for(int j=1;j<10;j++) {
			//break; //ovo prekida unutranju petlju
			//prekidanje vanjske petlje
			break vanjska;
		}
		}
	//zanimljivo
	for(int i=0;i<10;i++);{
		System.out.println("Osijek");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
	
	
	
	
	
