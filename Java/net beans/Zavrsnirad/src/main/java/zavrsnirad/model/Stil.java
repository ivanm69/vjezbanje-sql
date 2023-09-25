package zavrsnirad.model;

import jakarta.persistence.Entity;

@Entity
public class Stil extends Tecaj {
	
	private String naziv;
	private String opis;
	public Stil(int i, String naziv, String opis) {
		
	}
	public Stil() {
		
	}
   
	public String getNaziv() {
		return naziv;
	}
   
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	

	
@Override
public String toString() {
	return "Naziv: " + naziv + ", Opis: " + opis;
}
	

	
}
