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
    private static final int BROJ_PLESACA = 15;
    private static final int BROJ_INSTRUKTORA = 7;
    private static final int BROJ_TECAJA = 220;

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
        kreirajPlesace();
        kreirajInstruktore();
        kreirajTecaje();

       
        
        
        session.getTransaction().commit();
    }

    private void kreirajStilove() {
        Stil s;
        for (int i = 0; i < BROJ_STILOVA; i++) {
            s = new Stil();
            s.setNaziv(faker.beer().name());
            s.setOpis(faker.app().author());
            stilovi.add(s);
        }
    }

    private void kreirajPlesace() {
        Plesac p;
        for (int i = 0; i < BROJ_PLESACA; i++) {
            p = new Plesac();
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setRazinaZnanja(faker.artist().name());
            p.setDatumrodenja(faker.date().birthday(2,15));
            p.setDatumOd(faker.date().birthday(2,15));

            session.persist(p);
            plesaci.add(p);
        }

    }

        private void kreirajInstruktore() {
       Instruktor n;
        for(int i=0;i<BROJ_INSTRUKTORA;i++){
        n = new Instruktor();
        n.setIme(faker.name().firstName());
        n.setPrezime(faker.name().lastName());
        n.setiban(faker.business().creditCardNumber());
        n.setDatumrodenja((faker.date().birthday(1, 10)));
        session.persist(n);
        instruktori.add(n);
}}
    private void kreirajTecaje() {
        Tecaj t;
        List<Plesac>p;
        for (int i = 0; i < BROJ_TECAJA; i++) {
        t =new Tecaj();
        t.setNaziv(faker.chuckNorris().fact());
        t.setTrajanje(faker.number().numberBetween(5, 30));
        t.setInstruktor(instruktori.get(faker.number().numberBetween(0, BROJ_INSTRUKTORA)));
        //p =new ArrayList<>();
        t.setStil(stilovi.get(faker.number().numberBetween(0, BROJ_STILOVA-1)));
        }
    }

}
