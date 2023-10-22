/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import zavrsnirad.model.Stil;
import zavrsnirad.model.Tecaj;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaStil extends Obrada<Stil> {

    @Override
    public List<Stil> read(){
    //HQL
      return session.createQuery("from Stil",Stil.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
      kontrolaNaziv();
      kontrolaOpis();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
     
     
   }

    private void kontrolaNaziv() throws EdunovaException {
        if(entitet.getNaziv()==null||entitet.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv stila obavezno ");
        }
    if(entitet.getNaziv().isEmpty()){
        throw new EdunovaException("Naziv stila ne smije biti prazan");
    }
  }

    private void kontrolaOpis()throws EdunovaException {
       if(entitet.getOpis()==null){
           throw new EdunovaException("Opis mora biti definiran ");
       
        }
       if(entitet.getOpis().isEmpty()){
           throw new EdunovaException("Opis ne smije biti prazan");
       }
    }

}
