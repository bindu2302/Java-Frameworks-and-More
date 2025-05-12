package learn.spring.spr2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx 
    			= new ClassPathXmlApplicationContext("config.xml");
    	Person p = ctx.getBean("person",Person.class);
    	System.out.println(p);
    	
    }
}

