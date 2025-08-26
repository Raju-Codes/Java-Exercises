package read.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	
    	SessionFactory sf = config.buildSessionFactory();
    	Session sess = sf.openSession();
    	Student st = sess.find(Student.class, 101);
    	System.out.println(st);
    }
}
