/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Instruktor;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaInstruktor extends ObradaOsoba<Instruktor> {

    @Override
    public List<Instruktor> read() {
         List<Instruktor> lista=session.createQuery("from Instruktor", Instruktor.class).list();
        /*
        for(Instruktor p : lista){
            session.refresh(p);
        }
         */
         return lista;
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos();

    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaUnos();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if (!entitet.getTecajevi().isEmpty()) {
            throw new EdunovaException("Ne možeš obrisati Instruktora jer predaje na nekom Tecaju");
        }
    }

}