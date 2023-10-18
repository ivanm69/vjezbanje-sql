package zavrsnirad.model;

import jakarta.persistence.Entity;
import java.util.Date;


@Entity
public class Instruktor extends Osoba {

private String Ime;

private String Prezime;

private Date DatumRodenja;

    public Instruktor(String Ime, String Prezime, Date DatumRodenja, int sifra, String ime, String prezime, Date datumrodenja) {
        super(sifra, ime, prezime, datumrodenja);
        this.Ime = Ime;
        this.Prezime = Prezime;
        this.DatumRodenja = DatumRodenja;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String Ime) {
        this.Ime = Ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String Prezime) {
        this.Prezime = Prezime;
    }

    public Date getDatumRodenja() {
        return DatumRodenja;
    }

    public void setDatumRodenja(Date DatumRodenja) {
        this.DatumRodenja = DatumRodenja;
    }

   
}





		
	

	
	
	
	
	
	

