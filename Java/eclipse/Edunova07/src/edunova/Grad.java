package edunova;

public class Grad {

	 private String naziv;
	 private int brojStanovnika;
	 private boolean sjedisteZupanije;
	 private char energetskiCertifikat;
	 private float prosjecnaPlaca;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getBrojStanovnika() {
		return brojStanovnika;
	}
	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}
	public boolean isSjedisteZupanije() {
		return sjedisteZupanije;
	}
	public void setSjedisteZupanije(boolean sjedisteZupanije) {
		this.sjedisteZupanije = sjedisteZupanije;
	}
	public char getEnergetskiCertifikat() {
		return energetskiCertifikat;
	}
	public void setEnergetskiCertifikat(char energetskiCertifikat) {
		this.energetskiCertifikat = energetskiCertifikat;
	}
	public float getProsjecnaPlaca() {
		return prosjecnaPlaca;
	}
	public void setProsjecnaPlaca(float prosjecnaPlaca) {
		this.prosjecnaPlaca = prosjecnaPlaca;
	}
		

	}


