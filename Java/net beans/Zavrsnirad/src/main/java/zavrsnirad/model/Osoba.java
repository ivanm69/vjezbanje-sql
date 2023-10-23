package zavrsnirad.model;

import jakarta.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public abstract class Osoba extends Entitet {

    protected String ime;
    protected String prezime;
    protected String email;
    protected Date datumrodenja;

    public Osoba(String ime, String prezime, String email, Date datumrodenja, Integer sifra) {
        super(sifra);
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.datumrodenja = datumrodenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatumrodenja() {
        return datumrodenja;
    }

    public void setDatumrodenja(Date datumrodenja) {
        this.datumrodenja = datumrodenja;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    public Osoba() {
    }

}
