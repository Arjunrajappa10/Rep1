package applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Bikemain
{
	public static void main(String[] args) 
	
	{
//		Bike bike=new Bike();
//		bike.model();
// instead of creating an object for bike class we invoke the class by using application context		
		
  	
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
		Bike bike=(Bike)applicationContext.getBean("Bikeid"); // bikeid is a bean id given in .xml file
		bike.model();
	}

}
