package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Plesac extends Osoba {

    private String RazinaZnanja;

    @ManyToMany(mappedBy = "plesaci")
    private List<Tecaj> tecajevi = new ArrayList<>();

    public List<Tecaj> getTecaj() {
        return tecajevi;
    }

    public void setTecaj(List<Tecaj> tecaji) {
        this.tecajevi = tecaji;
    }

    public Plesac() {

    }

    public Plesac(String RazinaZnanja, String ime, String prezime, String email, Date datumrodenja, Integer sifra) {
        super(ime, prezime, email, datumrodenja, sifra);
        this.RazinaZnanja = RazinaZnanja;
    }

    public String getRazinaZnanja() {
        return RazinaZnanja;
    }

    public void setRazinaZnanja(String RazinaZnanja) {
        this.RazinaZnanja = RazinaZnanja;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(getPrezime());
        sb.append(" ");
        sb.append(getIme());

        return sb.toString();

    }

}
