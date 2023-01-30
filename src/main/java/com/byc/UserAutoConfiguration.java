package com.byc;

import com.byc.model.User;
import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Data
@Configuration
@ConfigurationProperties(prefix = "user.config")
@EnableAutoConfiguration
public class UserAutoConfiguration {

    private String name;

    private int age;

    @Bean
    public User userInfo(){
        return new User(name, age);
    }

}
