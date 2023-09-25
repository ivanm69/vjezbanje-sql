/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik>{

    @Override
    public List<Polaznik> read() {
       return session.createQuery("from Polaznik",Polaznik.class).list();
    }
    public Polaznik readBySifra(int sifra){
        return session.get(Polaznik.class, sifra);
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos(); 
        kontrolaBrojUgovora();
    }
    
    

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
     if(entitet.getGrupe().isEmpty()){
    throw new EdunovaException("Ne mozes obrisati polaznika jer je na nekoj grupi");
    }
    }
    private void kontrolaBrojUgovora ()throws EdunovaException{
        if(entitet.getBrojUgovora()!=null && !entitet.getBrojUgovora().contains("/")){
            throw new EdunovaException ("Broj ugovora mora sadrzavati znak /");
    
    }
     }
}