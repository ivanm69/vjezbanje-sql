/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zavrsnirad;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import zavrsnirad.controller.ObradaOperater;
import zavrsnirad.model.Operater;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.PocetniInsert;
import zavrsnirad.view.Autorizacija;
import zavrsnirad.view.SplashScreen;

/**
 *
 * @author Ivan
 */
public class Start {



    public static void main(String[] args) {
        //lozinka();
      //HibernateUtil.getSession();
      //new PocetniInsert();
         
      new SplashScreen().setVisible(true);
     
    //private void lozinka();
      
    //Provjera //
//        ObradaOperater oo=new ObradaOperater();
//      
//      Operater o = oo.autoriziraj("oper@edunova.hr", "oper");
//      
//     System.out.println(o==null ? "Neispravno" : o.getIme());
    }
    private static void lozinka(){
        // factory pattern
        Argon2 argon2 = Argon2Factory.create();

        String hash = argon2.hash(10, 65536, 1, "oper".toCharArray());

      
        ObradaOperater oo = new ObradaOperater();
        Operater o = new Operater();
        o.setIme("Ivan");
        o.setPrezime("Marosevic");
        o.setEmail("ivan@edunova.hr");
        o.setUloga("oper");
        o.setLozinka(hash);

        oo.setEntitet(o);

        try {
            oo.create();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
      
   
    
       

//     ObradaStil os=new ObradaStil();
//     Stil s=new Stil();
//     s.setNaziv("Prvi preko kontrola");
//     s.setOpis("Lorem ipsum");
//     
//     os.setEntitet(s);
//     
//        try {
//            os.create();
//        } catch (EdunovaException ex)
//       
//          {System.out.println(ex.getPoruka());
//        }
     
    // System.out.println(new Gson().toJson(new ObradaStil().read()));
    

