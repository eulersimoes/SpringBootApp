package com.spring.app.SpringApp.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Autowired
    private ApplicationArguments args;

    @Bean
    public AppConfiguration argsComponent() {

        //verifyArguments();

        //
        // return new ArgsComponent(args);
        return null;
    }

}
