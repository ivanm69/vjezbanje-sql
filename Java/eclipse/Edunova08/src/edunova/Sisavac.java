package edunova;

public class Sisavac extends Zivotinja {

	private int danaGraviditeta;

	
	
	public Sisavac() {
		super();
	}

	public Sisavac(String latinskiNaziv, int danaGraviditeta) {
		super(latinskiNaziv);
		this.danaGraviditeta = danaGraviditeta;
	}

	public int getDanaGraviditeta() {
		return danaGraviditeta;
	}

	public void setDanaGraviditeta(int danaGraviditeta) {
		this.danaGraviditeta = danaGraviditeta;
	}

	
	
}