package edunova;

public class Z01 {
	public static void main(String[] args) {
		
	
	//Kreirajte klase Zivotinja,Sisavac,Riba,Pas i Som
	//U svakoj klasi definirajte jendo svojstvo koje je na "prvom mjestu"
	
	//KReirati za psa i soma po jednu instancu te dodjelit vrijednosti
	// za sva svojstva

	 
	Pas pas=new Pas("American Staffordshire Terrier ",5,"Americki staford");
	Som som=new Som("Silurus glanis",15,4);
	
	System.out.println(pas.getLatinskiNaziv()+"||"+pas.getPasmina()+"||"+pas.getDanaGraviditeta());
	System.out.println(som.getLatinskiNaziv()+"||"+som.getDubinaZarona()+"||"+som.getDuzinaBrkova());
	
			
			
			
			
	}		
}