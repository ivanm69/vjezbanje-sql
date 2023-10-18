package zavrsnirad.model;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Osoba extends Entitet {
	
	protected String ime;
	protected String prezime;
	
	protected Date datumrodenja;
	
	public Osoba(int sifra, String ime, String prezime, Date datumrodenja) {
		super();
	}

public Osoba(String ime, String prezime, Date datumrodenja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.datumrodenja = datumrodenja;
	}

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


	@Override
	public String toString() {
		return ime + " " + prezime;
	}

}

