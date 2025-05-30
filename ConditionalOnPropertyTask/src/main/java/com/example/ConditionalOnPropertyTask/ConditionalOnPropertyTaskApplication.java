package com.example.ConditionalOnPropertyTask;

import com.example.ConditionalOnPropertyTask.Configuration.CustomConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionalOnPropertyTaskApplication {

	public static void main(String[] args) {
//		 SpringApplication.run(ConditionalOnPropertyTaskApplication.class, args);
//		ApplicationContext context = SpringApplication.run(ConditionalOnPropertyTaskApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ConditionalOnPropertyTaskApplication.class, args);
         System.out.println(context.getBean(CustomConfig.class).getDetails());



	}

}
