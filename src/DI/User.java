package DI;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Setter.xml"));

		PersonDetails myBean = (PersonDetails) beanFactory.getBean("PersonBean");
		System.out.println(myBean);
		JobDetails jd = (JobDetails) beanFactory.getBean("JobBean");
		System.out.println(jd);

	}

}
