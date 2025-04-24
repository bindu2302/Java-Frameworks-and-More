package learn.hiber;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {   
    	
    	
    	// Create data 
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	
    	SessionFactory factory = cfg.buildSessionFactory();
    	Session sess = factory.openSession();
    	
    	Transaction tx = sess.beginTransaction();
    	
    	//create a new student object
//    	Student s1 = new Student(6, "Ravi", "Delhi", 2023);
//    	Student s2 = new Student(7, "Meena", "Mumbai", 2022);
//    	Student s3 = new Student(8, "Arjun", "Chennai", 2024);
//
//    	sess.persist(s1);
//    	sess.persist(s2);
//    	sess.persist(s3);
    	
    	
    	// efficient way to insert multiple records at a time
    	List<Student> students = Arrays.asList(
    		    new Student(10, "Asha", "Pune", 2023),
    		    new Student(11, "Vikram", "Bangalore", 2022),
    		    new Student(12, "Divya", "Kolkata", 2024)
    		);

    		for (Student s : students) {
    		    sess.persist(s);
    		}

    	
    	tx.commit();
    	sess.close();
    	factory.close();
    	
    	
    	// Read data
   	Configuration cfg = new Configuration();
   	cfg.configure();
   	SessionFactory factory =cfg.buildSessionFactory();
   	Session sess = factory.openSession();
   	
   	Student st = sess.get(Student.class,5);
   	System.out.println(st);
    	
    	
    	
    	// update data
 
   	Configuration cfg = new Configuration();
   	cfg.configure();

   	SessionFactory factory = cfg.buildSessionFactory();
   	Session sess = factory.openSession();

   	Transaction tx = sess.beginTransaction();

   	Student st = sess.get(Student.class, 5);
   	st.setYop(2021); // modify field

   	tx.commit(); // Hibernate will automatically update the changes

   	sess.close();
   	factory.close();


    	
    	
    	// Delete Data
    	
   	Configuration cfg = new Configuration();
   	cfg.configure();
   	
   	SessionFactory factory = cfg.buildSessionFactory();
   	Session sess = factory.openSession();
   	
   	Student st = sess.get(Student.class, 4);
   	Transaction tx = sess.beginTransaction();
   	
   	sess.remove(st);
   	tx.commit();
    }
}
