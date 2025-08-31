package com.yash.javaconfig.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public Address address() {
        return new Address("India", "Bihar", "Sasaram");
    }

}
