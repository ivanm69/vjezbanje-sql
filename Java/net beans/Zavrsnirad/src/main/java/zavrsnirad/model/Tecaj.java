package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.List;
@Entity
public class Tecaj extends Entitet{

	private String naziv;
	
        @ManyToOne
        private Stil stil;
        
        @ManyToOne
        private Instruktor instruktor;
	@ManyToMany
	 private List<Plesac> plesaci; 
        
     

   
    public List<Plesac> getPlesaci() {
        return plesaci;
    }

    public void setPlesaci(List<Plesac> plesaci) {
        this.plesaci = plesaci;
    }
	
        public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
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

	@Override
    public String toString() {
      
        StringBuilder sb = new StringBuilder();
        
        if(getNaziv()==null ){
            sb.append("Tecaj bez naziva, ");
            sb.append(String.valueOf(getSifra()));
        } else if(getNaziv().length()>10){
            sb.append(getNaziv().substring(0,10));
            sb.append("...");
        }else{
            sb.append(getNaziv());
        }
        
        if(getStil()!=null && getStil().getNaziv()!=null && !getStil().getNaziv().isEmpty()){
            sb.append(" [");
            sb.append(getStil().getNaziv());
            sb.append("]");
        }
        
        return sb.toString();
        
    }



}