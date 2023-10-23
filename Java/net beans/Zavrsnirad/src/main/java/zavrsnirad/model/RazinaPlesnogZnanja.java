/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import java.util.Date;

/**
 *
 * @author Ivan
 */
@Entity
public class RazinaPlesnogZnanja extends Entitet{
   
  @ManyToOne
  private Plesac plesac;
  private String stecenaRazina_znanja;
  private Date datumOd;

    public Plesac getPlesac() {
        return plesac;
    }

    public void setPlesac(Plesac plesac) {
        this.plesac = plesac;
    }

    public String getstecenaRazina_znanja() {
        return stecenaRazina_znanja;
    }

    public void setstecenaRazina_znanja(String razina_znanja) {
        this.stecenaRazina_znanja = razina_znanja;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public RazinaPlesnogZnanja(Plesac plesac, String razina_znanja, Date datumOd, Integer sifra) {
        super(sifra);
        this.plesac = plesac;
        this.stecenaRazina_znanja = razina_znanja;
        this.datumOd = datumOd;
    }

}

