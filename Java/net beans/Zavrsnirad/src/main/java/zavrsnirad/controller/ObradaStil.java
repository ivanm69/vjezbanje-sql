/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.ArrayList;
import java.util.List;
import zavrsnirad.model.Stil;
import zavrsnirad.model.Tecaj;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaStil extends Obrada<Stil> {
    public ObradaStil(){
        super();
    }
public ObradaStil(Stil s){
    super(s);
}
    
    @Override
    public List<Stil> read(){
    //HQL
      return session.createQuery("from Stil",Stil.class).list();
    }

    
    @Override
    protected void kontrolaUnos() throws EdunovaException {
      kontrolaNaziv();
      nadopunaNaziva();
      kontrolaOpis();
      nadopunaOpisa();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
     kontrolaUnos();
    }


    private void kontrolaNaziv() throws EdunovaException {
        if(entitet.getNaziv()==null||entitet.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv stila obavezno ");
        }
        
    if(entitet.getNaziv().isBlank()){
        throw new EdunovaException("Naziv stila ne smije biti prazan");
    }
  }
    private void nadopunaNaziva(){
     List<Stil> lista = session.createQuery("from Stil s where s.naziv like :uvjet",Stil.class)
                .setParameter("uvjet", entitet.getNaziv() + "%")
                .list();
        
        if(lista!=null && !lista.isEmpty()){
            entitet.setNaziv(entitet.getNaziv() + " (" + (lista.size()) + ")");
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
    private void nadopunaOpisa(){
         List<Stil> lista = session.createQuery("from Stil s where s.naziv like :uvjet",Stil.class)
                .setParameter("uvjet", entitet.getOpis()+ "%")
                .list();
        
        if(lista!=null && !lista.isEmpty()){
            entitet.setOpis(entitet.getOpis()+ " (" + (lista.size()) + ")");
        }
    }
    

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
      if(!entitet.getTecajevi().isEmpty()){
           
           StringBuilder sb = new StringBuilder();
           sb.append("Stil se ne moze obrisati jer ima grupe (");
           for(Tecaj t : entitet.getTecajevi()){
               sb.append(t.getNaziv());
               sb.append("\n");
           }
           
           sb.append(")");
           
           
            throw new EdunovaException(sb.toString());
    }
}
    }