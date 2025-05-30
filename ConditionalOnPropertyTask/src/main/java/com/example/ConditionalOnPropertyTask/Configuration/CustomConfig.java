package com.example.ConditionalOnPropertyTask.Configuration;

import com.example.ConditionalOnPropertyTask.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Autowired
    Customer customer;


    @Bean
    public String getDetails(){
        return customer.getDetails();
    }
}
