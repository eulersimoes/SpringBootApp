package com.spring.app.SpringApp;

import com.spring.app.SpringApp.infrastructure.webservice.fepam.FepamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SpringAppApplication  extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {

                ApplicationContext applicationContext = SpringApplication.run(SpringAppApplication.class, args);

	}
}
