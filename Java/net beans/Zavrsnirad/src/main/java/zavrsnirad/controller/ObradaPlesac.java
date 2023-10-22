/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Plesac;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaPlesac extends ObradaOsoba<Plesac>{

    @Override
    public List<Plesac> read() {
        return session.createQuery("from Plesac",Plesac.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos(); 
        kontrolaRazinaZnanja();
    }

    
    
    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
       
    }

    private void kontrolaRazinaZnanja() {
        
    }
    
}
