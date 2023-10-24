package zavrsnirad.controller;

import java.text.Collator;
import java.util.List;
import java.util.Locale;
import zavrsnirad.model.Plesac;
import zavrsnirad.util.EdunovaException;

/**
 *
 * @author Ivan
 */
public class ObradaPlesac extends ObradaOsoba<Plesac>{

    @Override
    public List<Plesac> read() {
           return session.createQuery("from Plesac p order by p.sifra desc",Plesac.class)
               .setMaxResults(20)
               .list();
    }
    
     public List<Plesac> read(String uvjet) {
        return read(uvjet, 20);
    }
    public List<Plesac> read(String uvjet, int brojRezultata) {
        uvjet = uvjet==null ? "" : uvjet;
        uvjet = uvjet.trim();
        uvjet = "%" + uvjet + "%";
        
        List<Plesac> lista = session.createQuery("from Plesac p "
               + " where concat(p.ime,' ', p.prezime,' ',p.ime,' ',coalesce(p.RazinaZnanja,'')) like :uvjet"
               + " order by p.prezime, p.ime",Plesac.class)
               .setParameter("uvjet", uvjet)
               .setMaxResults(brojRezultata)
               .list();
        
        
        Collator spCollator = Collator.getInstance(Locale.of("hr", "HR"));
        
        lista.sort((e1, e2)-> spCollator.compare(e1.getPrezime(), e2.getPrezime()));
        
       return lista;
    }
     public Plesac readBySifra(int sifra){
        return session.get(Plesac.class, sifra);
    }
    
    
    
    
    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos(); 
        kontrolaRazinaZnanja();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaUnos();
    }

    
    
    
    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if(!entitet.getTecaj().isEmpty()){
            throw new EdunovaException("Ne možeš obrisati polaznika jer je na nekoj grupi");
        }
    }

    private void kontrolaRazinaZnanja() throws EdunovaException {
      if(entitet.getRazinaZnanja()==null||entitet.getRazinaZnanja().isEmpty()){
            throw new EdunovaException("Razina znanja obavezna ");
        }
    if(entitet.getRazinaZnanja().isBlank()){
        throw new EdunovaException("Razina znanja  ne smije biti prazan");
    }
  }
        
    }