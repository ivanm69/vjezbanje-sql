package edunova;

import java.util.Objects;

//NAsljedivanje je OOP princip kojim klasa moze nasljediti javna i zasticena
//svojstva i metoda od jedne nadklase.
//Htjela to ili ne svaka klasa nasljeduje java.lang.object
//Apstraktna klasa je ona klasa koja ne može imati instancu a kreirase da bi ju druge klase nasljedile
//https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html
//Apstraktna klasa je ona klasa koja ne moze imati instancu a kreira se da bi ju druge klase nasljedile
public abstract class Osoba  extends Object{// extends objects se ne mora pisati

	public abstract String pozdravi();
	
	private int sifra;
	private String ime;
	private String prezime;
	
	public Osoba() {
		super();
	}
	public Osoba(int sifra, String ime, String prezime) {
		super();
		this.sifra = sifra;
		this.ime = ime;
		this.prezime = prezime;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
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
	
	@Override
		public String toString() {
			return ime+ " "+ prezime;
		}
	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime, sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime) && sifra == other.sifra;
	}
	
}
