package zavrsni.model;


public abstract class Osoba extends Entitet {
	
	private String ime;
	private String prezime;
	
	private String datumrodenja;
	
	public Osoba(int sifra, String ime, String prezime, String datumrodenja) {
		super();
	}

public Osoba(String ime, String prezime, String datumrodenja) {
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

	public String getDatumrodenja() {
		return datumrodenja;
	}


	public void setDatumrodenja(String datumrodenja) {
		this.datumrodenja = datumrodenja;
	}


	@Override
	public String toString() {
		return ime + " " + prezime;
	}

}

