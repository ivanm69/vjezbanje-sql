package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Plesac extends Osoba {
       
    @ManyToMany
    public List<Tecaj>tecajevi=new ArrayList<>();
    public List<Tecaj> getTecajevi(){
        return tecajevi;
    }
    public void setTecajevi(List<Tecaj>tecajevi){
        this.tecajevi=tecajevi;
    }
    
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

    public Plesac(String razinaZnanja, Date datumOd, String ime, String prezime, String email, Date datumrodenja, Integer sifra) {
        super(ime, prezime, email, datumrodenja, sifra);
        this.razinaZnanja = razinaZnanja;
        this.datumOd = datumOd;
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