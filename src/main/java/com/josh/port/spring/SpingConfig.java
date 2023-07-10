package com.josh.port.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.josh.port.business.ProductFakeList;
import com.josh.port.interfaces.ProductDaoInterface;

@Configuration
public class SpingConfig {
    @Bean
    public ProductDaoInterface getProducts(){
        return new ProductFakeList();
    }
}
