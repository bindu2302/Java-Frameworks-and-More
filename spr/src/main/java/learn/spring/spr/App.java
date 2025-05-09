package learn.spring.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx 
    			= new ClassPathXmlApplicationContext("config.xml");
    	Laptop l = ctx.getBean("lappy",Laptop.class);
    	System.out.println(l);
    	
    }
}
