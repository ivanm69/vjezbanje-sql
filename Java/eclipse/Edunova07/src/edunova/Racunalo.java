package edunova;

public class Racunalo {


	private String naziv;
	private boolean Dostupnost;
	private float cijena;
	
	public Racunalo() {
		super();
	}
	public Racunalo(String naziv, boolean dostupnost, float cijena) {
		super();
		this.naziv = naziv;
		Dostupnost = dostupnost;
		this.cijena = cijena;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public boolean isDostupnost() {
		return Dostupnost;
	}
	public void setDostupnost(boolean dostupnost) {
		Dostupnost = dostupnost;
	}
	public float getCijena() {
		return cijena;
	}
	public void setCijena(float cijena) {
		this.cijena = cijena;
	}
}
	