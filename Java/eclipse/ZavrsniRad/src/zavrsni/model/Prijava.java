package zavrsni.model;

import java.util.List;

public class Prijava extends Tecaj {

	
	private List<Plesac> plesac;
	private Tecaj tecaj;
	public List<Plesac> getPlesac() {
		
		return plesac;
}
	public Tecaj getTecaj() {
		return tecaj;
	}
	public void setTecaj(Tecaj tecaj) {
		this.tecaj = tecaj;
	}
	public void setPlesac(List<Plesac> plesac) {
		this.plesac = plesac;
	}
	public Prijava(List<Plesac> plesac, Tecaj tecaj) {
		super();
		this.plesac = plesac;
		this.tecaj = tecaj;
	}
	


}
	



