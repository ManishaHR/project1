package iocBasic2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testCar {

	public static void main(String[] args) {
		//***BF*****
//		ClassPathResource r1 = new ClassPathResource("ioc2.xml");
//		BeanFactory bf = new XmlBeanFactory(r1);
//		jaguar j = (jaguar) bf.getBean("mycar");
//		j.car();
		
		//*****AC******
//		ApplicationContext  c=new ClassPathXmlApplicationContext("ioc2.xml");
//		jaguar j = (jaguar) c.getBean("mycar");
//		j.car();
		
		ApplicationContext  a=new ClassPathXmlApplicationContext("ioc2.xml");
		lambargini l = (lambargini) a.getBean("ourcar");
		l.drive();
	}
}