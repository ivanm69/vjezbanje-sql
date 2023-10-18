package zavrsnirad.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entitet {

    public Entitet() {
    }

    public Entitet(int sifra) {
        super();
        this.sifra = sifra;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;

    public int getsifra() {
        return sifra;
    }

    public void setsifra(Integer sifra) {
        this.sifra = sifra;
    }

}
