package learn.hiber2;

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

//		Employee emp = new Employee("Anil", 22000, "associate", "test");
		
		
		Person p = new Person();
		AadharCard  ac = new AadharCard(1111,"deep","btm","male",p);
		
		p.setId(101);
		p.setNickName("dee");
		p.setCard(ac);
		
		sess.persist(p);
		sess.persist(ac);
		sess.getTransaction().commit();
	}
}