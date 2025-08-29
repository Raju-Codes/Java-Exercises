package hib.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.OneToOne;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration conf = new Configuration().configure();
    	SessionFactory sessionFactory = conf.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	Transaction transaction = session.beginTransaction();
    	
    	Person person = new Person();
    	Aadhar aadhar = new Aadhar(111,"Amit", "2000","M", "Pune",person);
    	person.setId(19);
    	person.setAadhar(aadhar);
    	
    	session.persist(aadhar);
    	session.persist(person);  
    	transaction.commit();
    	session.close();
    	sessionFactory.close();
    }
}
