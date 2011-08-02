package au.com.arv.configuration;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyBeansUtility {
	private static BeanFactory beansUtility;	
	static{
		Resource resBeans=new ClassPathResource("au/com/arv/resources/application-context.xml");
		if(resBeans==null){
			System.out.println("File is missing!");
		}		
		beansUtility=new XmlBeanFactory(resBeans);
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
