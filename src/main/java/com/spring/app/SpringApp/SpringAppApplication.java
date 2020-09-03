package com.spring.app.SpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SpringAppApplication  extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		//SpringApplication.run(SpringAppApplication.class, args);
                ApplicationContext applicationContext = SpringApplication.run(SpringAppApplication.class, args);

		//for (String name : applicationContext.getBeanDefinitionNames()) {
		//	System.out.println(name);
		//}
	}

}
