package iocBasic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestMobile {
	
	public static void main(String[] args) {
		// ********BEAN FACTORY*********
//		ClassPathResource resource=new ClassPathResource("ioc1.xml");
//		BeanFactory bf= new XmlBeanFactory(resource);
//		Mobile mobile= (Mobile) bf.getBean("mymobile");
//		mobile.musicPlayer();
		
		
		//*******APPLICATION CONTEXT**********
		ApplicationContext context = new ClassPathXmlApplicationContext("ioc1.xml");
		Mobile mobile = (Mobile) context.getBean("mymobile");
		mobile.musicPlayer();
	}

}