package cm.spring.injection.use;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestMain {

	   public static void main(String[] args) {
/*	      ApplicationContext context = 
	             new ClassPathXmlApplicationContext("SpringDepInjection/spring_injection.xml");*/
		   
		   
		      ApplicationContext context = 
			             new FileSystemXmlApplicationContext("config/spring_injection.xml");

	      TextEditor te = (TextEditor) context.getBean("textEditor");

	      te.doTextEditor();
	   }
	}