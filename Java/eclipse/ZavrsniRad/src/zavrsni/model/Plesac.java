package zavrsni.model;



public class Plesac extends Osoba {


		
private String razinaZnanja;
	private String datumOd;
	public String getRazinaZnanja() {
		return razinaZnanja;
	}
	public void setRazinaZnanja(String razinaZnanja) {
		this.razinaZnanja = razinaZnanja;
	}
	public String getDatumOd() {
		return datumOd;
	}
	public void setDatumOd(String datumOd) {
		this.datumOd = datumOd;
	}
	public Plesac(int sifra, String ime, String prezime, String datumrodenja, String razinaZnanja, String datumOd) {
		super(sifra, ime, prezime, datumrodenja);
		this.razinaZnanja = razinaZnanja;
		this.datumOd = datumOd;
	}
	public Plesac(int sifra, String ime, String prezime, String datumrodenja) {
		super(sifra, ime, prezime, datumrodenja);
	}
	
	
	
}

	
	