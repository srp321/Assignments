package autowireByType;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XmlBeanFactory beanFact = new XmlBeanFactory(new ClassPathResource("autowireByTypeBean.xml"));

		Person Bean1 = (Person) beanFact.getBean("PersonBean");
		System.out.println(Bean1);
		ownDetail Bean2 = (ownDetail) beanFact.getBean("OwnBean");
		System.out.println(Bean2);

	}

}
