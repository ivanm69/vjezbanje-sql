/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;

import java.util.List;
import static org.hibernate.Hibernate.get;
import zavrsnirad.model.Tecaj;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaTecaj extends Obrada<Tecaj> {

    @Override
    public void create()throws EdunovaException{
        super.create();
        
        if(entitet.getStil().getNaziv()==null){
             throw new EdunovaException("Naziv stila ne smije biti prazan");
        }else{
            entitet.getStil().setNaziv(entitet.getStil().getNaziv()+1);
        }
        ObradaStil os= new ObradaStil(entitet.getStil());
        try {
            os.update();
        } catch (EdunovaException ex) {
        }
    }
@Override
 public List<Tecaj> read() {
        return session.createQuery("from Tecaj",Tecaj.class).list();
    }
    
    @Override
    protected void kontrolaUnos() throws EdunovaException {
       kontrolaStil();
       kontrolainstruktor();
       
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaStil();
        kontrolainstruktor();
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
       
    }


    private void kontrolaStil() throws EdunovaException{
        if(getEntitet().getStil()==null|| getEntitet().getStil().getSifra().equals(0)){
          throw new EdunovaException("Stil mora biti odabran");
        }
    }

    private void kontrolainstruktor() throws EdunovaException {
        if(getEntitet().getInstruktor()==null || getEntitet().getInstruktor().getSifra().equals(0)){
   //         get.Entitet().setInstruktor(null);
        }
    }
   
    
}
