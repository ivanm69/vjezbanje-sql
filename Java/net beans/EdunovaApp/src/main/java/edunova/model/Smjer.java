package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Smjer extends Entitet {
	
        @Column(nullable =false)
	private String naziv;
	private BigDecimal cijena;
	private BigDecimal upisnina;
	private int trajanje;
	@Column(columnDefinition = "boolean")
        private boolean verificiran;
	@OneToMany(mappedBy = "smjer")
        private List<Grupa>grupe=new ArrayList<>();
        
	public Smjer() {
		
	}
	
    
 
    public Smjer(int sifra, String naziv, BigDecimal cijena, BigDecimal upisnina, int trajanje, boolean verificiran) {
		super(sifra);
		this.naziv = naziv;
		this.cijena = cijena;
		this.upisnina = upisnina;
		this.trajanje = trajanje;
		this.verificiran = verificiran;
	}



	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public BigDecimal getCijena() {
		return cijena;
	}

    
    public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public BigDecimal getUpisnina() {
		return upisnina;
	}
	public void setUpisnina(BigDecimal upisnina) {
		this.upisnina = upisnina;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public boolean isVerificiran() {
		return verificiran;
	}
	public void setVerificiran(boolean verificiran) {
		this.verificiran = verificiran;
	}

    public List<Grupa> getGrupe() {
        return grupe;
    }

    public void setGrupe(List<Grupa> grupe) {
        this.grupe = grupe;
    }
	
	

}