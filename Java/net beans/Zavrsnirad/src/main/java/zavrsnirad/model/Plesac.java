package zavrsnirad.model;

import jakarta.persistence.Entity;
import java.util.Date;

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

    public Plesac(int sifra, String ime, String prezime, Date datumrodenja, String razinaZnanja, Date datumOd) {
        super(sifra, ime, prezime, datumrodenja);
        this.razinaZnanja = razinaZnanja;
        this.datumOd = datumOd;
    }

    public Plesac(int sifra, String ime, String prezime, Date datumrodenja) {
        super(sifra, ime, prezime, datumrodenja);
    }

}
