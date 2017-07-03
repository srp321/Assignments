package first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloWorld {
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("From SpringBean");
	}

	public void Hello1() {
		System.out.println("From Bean");
	}
}

class User {
	public static void main(String[] args) {

		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("HelloWorld.xml"));

		HelloWorld myBean = (HelloWorld) beanFactory.getBean("Bean");
		myBean.Hello1();

	}

}
