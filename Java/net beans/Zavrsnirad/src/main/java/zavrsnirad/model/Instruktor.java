package zavrsnirad.model;

import jakarta.persistence.Entity;


@Entity
public class Instruktor extends Osoba {

	

private String Tecaj;
private String Stil;

public String getTecaj() {
	return Tecaj;
}
public void setTecaj(String tecaj) {
	Tecaj = tecaj;
}
public String getStil() {
	return Stil;
}
public void setStil(String stil) {
	Stil = stil;
}
public Instruktor(int sifra, String ime, String prezime, String datumrodenja, String tecaj, String stil) {
	super(sifra, ime, prezime, datumrodenja);
	Tecaj = tecaj;
	Stil = stil;
}
public Instruktor(int sifra, String ime, String prezime, String datumrodenja) {
	super(sifra, ime, prezime, datumrodenja);
}


}





		
	

	
	
	
	
	
	

