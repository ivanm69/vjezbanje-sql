package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Plesac extends Osoba {
    
    private String razinaZnanja;
    private Date datumOd;
   
 
    public String getRazinaZnanja() {
        return razinaZnanja;
    }

    public void setRazinaZnanja(String razinaZnanja) {
        this.razinaZnanja = razinaZnanja;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Plesac(String ime, String prezime, Integer sifra, String razinaZnanja, Date datumrodenja) {
        super(sifra, ime, prezime, datumrodenja);
        this.razinaZnanja = razinaZnanja;
        this.datumOd = datumOd;
    }

    public Plesac(int sifra, String ime, String prezime, Date datumrodenja) {
        super(sifra, ime, prezime, datumrodenja);
    }

    public Plesac() {
    }

    
@Override
    public String toString(){
         StringBuilder sb = new StringBuilder();
        sb.append(getPrezime());
        sb.append(" ");
        sb.append(getIme());
        return ime + " " + prezime;
        
        
    }
}
