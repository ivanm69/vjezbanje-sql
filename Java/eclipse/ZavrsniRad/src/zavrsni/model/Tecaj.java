package zavrsni.model;

import java.util.List;

public class Tecaj extends Entitet{

	private String naziv;
	private String trajanje;
	private Stil stil;
	private Instruktor instruktor;
	private Plesac plesac;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(String trajanje) {
		this.trajanje = trajanje;
	}
	public Stil getStil() {
		return stil;
	}
	public void setStil(Stil stil) {
		this.stil = stil;
	}
	public Instruktor getInstruktor() {
		return instruktor;
	}
	public void setInstruktor(Instruktor instruktor) {
		this.instruktor = instruktor;
	}
	public Plesac getPlesac() {
		return plesac;
	}
	public void setPlesac(List<Plesac> plesaci) {
		this.plesac = (Plesac) plesaci;
	}
	
	
}
