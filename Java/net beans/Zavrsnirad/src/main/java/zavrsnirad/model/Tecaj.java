package zavrsnirad.model;

import jakarta.persistence.Entity;
import java.util.List;
@Entity
public class Tecaj extends Entitet{

	private String naziv;
	
       private List<Plesac> plesac; 
        private String trajanje;
	private Stil stil;
        
        private Instruktor instruktor;
	
	
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
	public List<Plesac> getPlesac() {
		return plesac;
	}
public void setPlesac(List<Plesac> list) {
    this.plesac = list;
}
	
	



}
