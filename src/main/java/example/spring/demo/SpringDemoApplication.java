package example.spring.demo;

import example.spring.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

	}

}
