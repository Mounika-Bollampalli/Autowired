package Autowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ConfigurableApplicationContext cxt = new ClassPathXmlApplicationContext(
                "classpath:config.xml");
		Employee obj1=(Employee) cxt.getBean("emp");
		System.out.println(obj1.getName());
		obj1.setName("hdjbf");
		System.out.println(obj1.getName());
		Employee obj2=(Employee) cxt.getBean("emp");
		System.out.println(obj2.getName());
		

	}

}
