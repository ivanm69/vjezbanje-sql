package zavrsni;

import java.util.Date;

public abstract class Osoba extends Entitet{

	private String ime;
	private String prezime;
	private Date datumrodenja;
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
	public Date getDatumrodenja() {
		return datumrodenja;
	}
	public void setDatumrodenja(Date datumrodenja) {
		this.datumrodenja = datumrodenja;
	}
	
	
}
