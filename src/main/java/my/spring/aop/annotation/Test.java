package my.spring.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mvc-aop.xml"});
		TestBean tb = (TestBean) ac.getBean("test");
		tb.test();
	}
}
