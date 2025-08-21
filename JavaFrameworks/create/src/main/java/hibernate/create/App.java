package hibernate.create;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure("hibernate.cfg.xml");
        
        SessionFactory fact = con.buildSessionFactory();
        Session sess = fact.openSession();
        Student st = new Student(101,"Rakesh",7.8f,"Electrical");
        Transaction tx = sess.beginTransaction();
        sess.persist(st);
        tx.commit();
        sess.close();
    }
}
