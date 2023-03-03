package iocbasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Testcar
{
	public static void main(String[] args) 
	{
		ClassPathResource classPathResource=new ClassPathResource("ioc.xml"); 
		 // Bean factory is an interface,we cannot create object for beanfactory,so we are create object for xmlbeanfactory(subclass of beanfactory)
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Car car=(Car) beanFactory.getBean("cartest");  // cartest is a id given in xml file inside a bean tag
		car.engine();
		
	}

}
