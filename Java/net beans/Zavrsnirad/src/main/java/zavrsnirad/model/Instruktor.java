package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



@Entity
public class Instruktor extends Osoba {

    private String iban;

    public Instruktor() {
    }
    
   
   

  
public Instruktor(int sifra,String iban,  String ime, String prezime, Date datumrodenja) {
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




		
	

	
	
	
	
	
	

