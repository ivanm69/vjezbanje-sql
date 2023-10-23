/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.controller;
import org.apache.commons.validator.routines.EmailValidator;
import zavrsnirad.model.Osoba;
import zavrsnirad.util.EdunovaException;
/**
 *
 * @author Ivan
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{

    @Override
    protected void kontrolaUnos() throws EdunovaException {
       kontrolaIme();
       kontrolaPrezime();
       kontrolaEmail();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {

    }

    private void kontrolaIme() throws EdunovaException{
        if(entitet.getIme()==null || entitet.getIme().isEmpty()){
            throw new EdunovaException("Ime Obavezno");
            }
    }
    private void kontrolaPrezime() throws EdunovaException{
        if(entitet.getPrezime()==null || entitet.getPrezime().isEmpty()){
            throw new EdunovaException("Prezime Obavezno");
        }
    }

    private void kontrolaEmail() throws EdunovaException {
        EmailValidator validator = EmailValidator.getInstance();
        if(!validator.isValid(entitet.getEmail())){
        throw new EdunovaException("Email nije u dobrom formatu");
    }
    }
    

    

}
  
