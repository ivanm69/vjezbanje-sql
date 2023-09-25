/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsnirad.util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import zavrsnirad.model.Instruktor;
import zavrsnirad.model.Plesac;
import zavrsnirad.model.Stil;
import zavrsnirad.model.Tecaj;

/**
 *
 * @author Ivan
 */
public class PocetniInsert {

    private static final int BROJ_STILOVA = 12;
    private static final int BROJ_PLESACA = 12200;
    private static final int BROJ_INSTRUKTORA = 5;
    private static final int BROJ_TECAJEVA = 102;

    private Faker faker;
    private Session session;
    private List<Stil> stilovi;
    private List<Plesac> plesaci;
    private List<Instruktor> instruktori;

    public PocetniInsert() {
        faker = new Faker();
        session = HibernateUtil.getSession();
        stilovi = new ArrayList<>();
        plesaci = new ArrayList<>();
        instruktori = new ArrayList<>();
        session.getTransaction().begin();
        kreirajStilove();
        kreirajPlesaca();
        kreirajInstruktora();
        kreirajTecaje();

        session.getTransaction().commit();
    }

    private void kreirajStilove() {
        Stil s;
        for (int i = 0; i < BROJ_STILOVA; i++) {
            s = new Stil();
            s.setNaziv(faker.beer().name());
            s.setOpis(faker.nation().nationality());
            session.persist(s);
            stilovi.add(s);
        }
    }

    private void kreirajPlesaca() {
       /* Plesac p;
        for (int i = 0; i < BROJ_PLESACA; i++) {
            p = new Plesac();
            p.setIme(faker.animal().name());
            p.setPrezime(faker.artist().name());
            session.persist(p);
            plesaci.add(p);
        }*/
    }

    private void kreirajInstruktora() {
        Instruktor in;
for (int i = 0; i < BROJ_INSTRUKTORA; i++){
      /*  in=new Instruktor();
        in.setIme(faker.aviation().aircraft());
        in.setPrezime(faker.ancient().god());
        in.getStil();
        in.getTecaj();
        session.persist(in);
        instruktori.add(in);*/
    }
    }
    private void kreirajTecaje(){
       
        Tecaj t;
        List<Plesac>p;
        
        for(int i = 0; i < BROJ_TECAJEVA; i++){
           t=new Tecaj();
           t.setNaziv(faker.ancient().hero());
           t.setTrajanje(faker.zelda().character());
           t.setInstruktor(instruktori.get(faker.number().numberBetween(0, -1)));
           p= new ArrayList<>();
           session.persist(t);
       }
    }
}

