package com.vega.springit;

import com.vega.springit.domain.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(SpringItProperties.class)
public class SpringitApplication {

    @Autowired
    private SpringItProperties properties;


    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Hell");
    }


    @Bean
    @Profile("dev")
    CommandLineRunner runner()
    {
        return args ->
        {
            System.out.println(properties.getWelcomeMsg());
            System.out.println();
        };
    }

}
