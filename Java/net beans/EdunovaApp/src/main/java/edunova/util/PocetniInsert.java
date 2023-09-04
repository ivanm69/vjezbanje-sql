/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author Ivan
 */
public class PocetniInsert {
    


    
    private static final int BROJ_SMJEROVA = 12;
    private static final int BROJ_POLAZNIKA = 11256;
    private static final int BROJ_PREDAVACA = 7;
    private static final int BROJ_GRUPA = 220;
    
    private final Faker faker;
    private final Session session;
    private final List<Smjer> smjerovi;
    private final List<Polaznik> polaznici;
    private final List<Predavac> predavaci;
    
    public PocetniInsert() {
        faker = new Faker();
        session = HibernateUtil.getSession();
        smjerovi = new ArrayList<>();
        polaznici = new ArrayList<>();
        predavaci = new ArrayList<>();
        session.getTransaction().begin();
        kreirajSmjerove();
        kreirajPolaznike();
        kreirajPredavace();
        kreirajGrupe();
        session.getTransaction().commit();
    }
    
    private void kreirajSmjerove() {
        Smjer s;
        for (int i = 0; i < BROJ_SMJEROVA; i++) {
            s = new Smjer();
            s.setNaziv(faker.beer().name());
            s.setCijena(new BigDecimal(faker.number().numberBetween(910, 1560)));
            s.setTrajanje(faker.number().numberBetween(90, 350));
            s.setVerificiran(faker.bool().bool());
            session.persist(s);
            smjerovi.add(s);
        }
    }
    
    private void kreirajPolaznike() {
        
        Polaznik p;
        for (int i = 0; i < BROJ_POLAZNIKA; i++) {
            p = new Polaznik();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setOib("244561561231");
            p.setBrojUgovora(faker.business().creditCardNumber());
            p.setEmail(faker.internet().emailAddress());
            
            session.persist(p);
            polaznici.add(p);
            
        }
        
    }
    
    private void kreirajPredavace() {
        Predavac p;
        for (int i = 0; i < BROJ_PREDAVACA; i++) {
            p = new Predavac();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setOib("51231561321");
            p.setIban(faker.business().creditCardNumber());
            p.setEmail(faker.internet().emailAddress());
            
            session.persist(p);
            predavaci.add(p);
            
        }
    }
    
    private void kreirajGrupe() {
        
        Grupa g;
        List<Polaznik> p;
        for (int i = 0; i < BROJ_GRUPA; i++) {
            g = new Grupa();
            g.setNaziv(faker.chuckNorris().fact());
            g.setDatumPocetka(faker.date().birthday(1, 10));
            g.setPredavac(predavaci.get(faker.number().numberBetween(0, BROJ_PREDAVACA - 1)));
            g.setSmjer(smjerovi.get(faker.number().numberBetween(0, BROJ_SMJEROVA - 1)));
            g.setMaxpolaznika(faker.number().numberBetween(5, 30));
            p = new ArrayList<>();
            // DZ: Osigurati da jedan polaznik može biti samo jednom na jednoj grupi
            for (int j = 0; j < faker.number().numberBetween(5, g.getMaxpolaznika()); j++) {
                p.add(polaznici.get(faker.number().numberBetween(0, BROJ_POLAZNIKA - 1)));
            }
            g.setPolaznici(p);
            
            session.persist(g);
            
        }
        
   
        
    }
    
}