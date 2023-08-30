package zavrsni.model;

public class Prijava extends Tecaj {

	
	private Plesac plesac;
	private Tecaj tecaj;
	public Plesac getPlesac() {
		
		return plesac;
}
	public Tecaj getTecaj() {
		return tecaj;
	}
	public void setTecaj(Tecaj tecaj) {
		this.tecaj = tecaj;
	}
	public void setPlesac(Plesac plesac) {
		this.plesac = plesac;
	}
	public Prijava(Plesac plesac, Tecaj tecaj) {
		super();
		this.plesac = plesac;
		this.tecaj = tecaj;
	}
	


}
	



