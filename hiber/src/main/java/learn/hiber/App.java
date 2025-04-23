package learn.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
//    	Student st = new Student(4,"anitha","btn",2025);
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory factory =cfg.buildSessionFactory();
    	Session sess = factory.openSession();
//    	Transaction tx = sess.beginTransaction();
//    	
//    	sess.save(st);
//    	tx.commit();
    	
    	Student st = sess.get(Student.class,5);
    	System.out.println(st);
    }
}
