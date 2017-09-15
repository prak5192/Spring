package com.spring.annotation.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class Application {

	@Bean
    MessageService mockMessageService() {
        return new MessageServiceImpl(); 
    }

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		context.close();
		
	}
}
