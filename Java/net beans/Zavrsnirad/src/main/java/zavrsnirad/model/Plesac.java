package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Plesac extends Osoba {

    private String razinaZnanja;
    private Date datumOd;
    @ManyToMany(mappedBy = "plesac")
    private List<Tecaj> tecajevi = new ArrayList<>();

    public List<Tecaj>getTecajevi(){
        return tecajevi;
    }
    public void setTecajevi(List<Tecaj>tecajevi){
        this.tecajevi= tecajevi;
    }

  

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

@Override
    public String toString(){
         StringBuilder sb = new StringBuilder();
        sb.append(getPrezime());
        sb.append(" ");
        sb.append(getIme());
        return ime + " " + prezime;
        
        
    }
}
