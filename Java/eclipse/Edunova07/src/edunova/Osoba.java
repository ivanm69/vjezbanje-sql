package edunova;


//Ovo znati u svako doba dana i noci
//Klasa je opisnik objekta
//Za OOP citati https://github.com/tjakopec/OOP_JAVA_PHP_PYTHON_SWIFT

public class Osoba {
	//OVO Nije Dobro jer nije po OOP principu ucahuravianja
	/*String ime;//package scope
	String prezime;
	int godine;
	*/
	
	//OOP princip ucahurivanje
	//1.Klasa ce sakriti svoja svojstva
	
	private String ime;
	private String prezime;
	private int godine;
	
	//konstruktor je posebna metoda
	//koja se poziva kljucnom rijecju new
	//Naziv konstruktora mora biti istovjetan nazivu klase
	// prazan konstruktor
	public Osoba() {
		
		System.out.println("Nalazim se u osoba konstruktor");
		
	}
	//puni konstruktor
	
	public Osoba(String ime, String prezime, int godine) {
		// vezano za nasljedivanje kasnije-super();
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	
	
	//2.Klasa ce uciti svojstva dostupan putem javnih get/set metoda
	public String getIme() {
		
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodine() {
		return godine;
	}
	public void setGodine(int godine) {
		this.godine = godine;
	}
	
	/*public String getIme() {
		return this.ime;
	}Rucno kucanje
	public void setIme(String ime) {
		this.ime=ime;
	}*/



}


