package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
@Entity
public class Prijava extends Tecaj {

	@ManyToOne
        
	private List<Plesac> plesac;
	private Tecaj tecaj;
        @ManyToMany
        public List<Plesac> getPlesac() {
		
		return plesac;
}
	public Tecaj getTecaj() {
		return tecaj;
	}
	public void setTecaj(Tecaj tecaj) {
		this.tecaj = tecaj;
	}
        @Override
	public void setPlesac(List<Plesac> plesac) {
		this.plesac = plesac;
	}
	public Prijava(List<Plesac> plesac, Tecaj tecaj) {
		super();
		this.plesac = plesac;
		this.tecaj = tecaj;
	}
	


}
	



