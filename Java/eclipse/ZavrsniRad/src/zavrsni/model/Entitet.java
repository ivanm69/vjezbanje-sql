package zavrsni.model;

public abstract class Entitet {

	public Entitet() {
	}
	public Entitet(int sifra) {
	super();
	this.sifra = sifra;
}
private int sifra;

public int getsifra() {
	return sifra;
}

public void setsifra(int sifra) {
	this.sifra = sifra;
}

}