
package zavrsnirad.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class HibernateUtil {
    
    private static Session session = null;
    
    private HibernateUtil(){
        session = new Configuration().configure().buildSessionFactory().openSession();
    }
    
    public static Session getSession(){
        if(session==null){
           new HibernateUtil();
        }
        return session;
    }
    
    
}