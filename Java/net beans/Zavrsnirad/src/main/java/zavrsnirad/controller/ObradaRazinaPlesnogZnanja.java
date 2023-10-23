/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.RazinaPlesnogZnanja;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaRazinaPlesnogZnanja extends Obrada<RazinaPlesnogZnanja> {

    @Override
    public List<RazinaPlesnogZnanja> read() {
      return session.createQuery("from RazinaPlesnogZnanja",RazinaPlesnogZnanja.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
      
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
       kontrolaUnos(); 
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

 
}
