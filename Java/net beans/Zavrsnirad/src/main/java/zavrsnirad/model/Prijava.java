/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

/**
 *
 * @author Ivan
 */
 
@Entity
public class Prijava extends Entitet {

    @ManyToOne
    private Plesac plesac;
    
    @ManyToOne
    private Tecaj tecaj;
    
    public Prijava() {
        
    }
    
    public Prijava(Plesac plesac, Tecaj tecaj) {
        this.plesac = plesac;
        this.tecaj = tecaj;
    }
    
    public Plesac getPlesac() {
        return plesac;
    }
    
    public void setPlesac(Plesac plesac) {
        this.plesac = plesac;
    }
    
    public Tecaj getTecaj() {
        return tecaj;
    }
    
    public void setTecaj(Tecaj tecaj) {
        this.tecaj = tecaj;
    }
    
    public String getPlesacRazinaZnanja() {
        return plesac != null ? plesac.getRazinaZnanja(): null;
    }
    
    public String getTecajNaziv() {
        return tecaj != null ? tecaj.getNaziv(): null;
    }
    


}
