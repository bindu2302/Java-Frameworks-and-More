package learn.hib3;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();

		Person p1 = new Person();
		Person p2 = new Person();
		
		Bike b1 = new Bike(1001, "pulsar", 97000, p1);
		Bike b2 = new Bike(2002, "apache", 77000, p1);
		
		List<Bike> bikeList1 = new ArrayList<Bike>();
		bikeList1.add(b1);
		bikeList1.add(b2);
		
		Bike b3 = new Bike(3003, "honda", 67000, p2);
		Bike b4 = new Bike(4004, "dominor", 99000, p2);
		
		List<Bike> bikeList2 = new ArrayList<Bike>();
		bikeList2.add(b3);
		bikeList2.add(b4);
		
		p1.setId(1);
		p1.setName("mahi");
		p1.setBikeList(bikeList1);
		
		p2.setId(2);
		p2.setName("john");
		p2.setBikeList(bikeList2);
		
		sess.persist(p1);
		sess.persist(p2);
		
		sess.persist(b1);
		sess.persist(b2);
		sess.persist(b3);
		sess.persist(b4);

		sess.getTransaction().commit();
	}
}