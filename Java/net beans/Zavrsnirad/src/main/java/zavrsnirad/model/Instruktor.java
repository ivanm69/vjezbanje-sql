package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Entity
public class Instruktor extends Osoba {

    private String iban;
    
    @OneToMany(mappedBy = "instruktor")
    private List<Tecaj> tecajevi = new ArrayList<>();

    public List<Tecaj> gettecajevi() {
        return tecajevi;
    }

    public void setGrupe(List<Tecaj> tecajevi) {
        this.tecajevi = tecajevi;
    }

    
public Instruktor(String iban, int sifra, String ime, String prezime, Date datumrodenja) {
        super(sifra, ime, prezime, datumrodenja);
        this.iban = iban;
    }

  public String getiban() {
        return iban;
    }

     public void setiban(String iban) {
        this.iban = iban;
    }

   
   }




		
	

	
	
	
	
	
	

