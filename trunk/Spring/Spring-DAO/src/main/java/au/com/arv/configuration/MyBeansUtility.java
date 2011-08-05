package au.com.arv.configuration;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeansUtility {
	private static ApplicationContext beansUtility;	
	static{
		beansUtility=new ClassPathXmlApplicationContext("au/com/arv/dao/configurations/*-context.xml");
		
	}
	private MyBeansUtility(){}
	public static BeanFactory getInstance(){
		return beansUtility;
	}	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
