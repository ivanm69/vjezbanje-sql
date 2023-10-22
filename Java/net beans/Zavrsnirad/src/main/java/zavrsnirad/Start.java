/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zavrsnirad;

import com.google.gson.Gson;
import zavrsnirad.controller.ObradaStil;
import zavrsnirad.util.HibernateUtil;
import zavrsnirad.util.PocetniInsert;

/**
 *
 * @author Ivan
 */
public class Start {



    public static void main(String[] args) {
        
     // HibernateUtil.getSession();
      new PocetniInsert();
     
     
     
    // System.out.println(new Gson().toJson(new ObradaStil().read()));
    }

}
