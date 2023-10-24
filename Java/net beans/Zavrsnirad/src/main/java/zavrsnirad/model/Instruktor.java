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
    public List<Tecaj> tecajevi = new ArrayList<>();

    public List<Tecaj> getTecajevi() {
        return tecajevi;
    }

    public void setTecajevi(List<Tecaj> tecajevi) {
        this.tecajevi = tecajevi;
    }

    public Instruktor() {
    }

    public Instruktor(String iban, String ime, String prezime, String email, Date datumrodenja, Integer sifra) {
        super(ime, prezime, email, datumrodenja, sifra);
        this.iban = iban;
    }

    public String getiban() {
        return iban;
    }

    public void setiban(String iban) {
        this.iban = iban;
    }

}
