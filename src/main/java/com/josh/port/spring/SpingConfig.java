package com.josh.port.spring;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//imports all classes in the business folder
import com.josh.port.business.*;
import com.josh.port.database.MySqlDAO;
import com.josh.port.interfaces.ProductBusinessInterface;

@Configuration
public class SpingConfig {
    @Bean(name="productsDAO")
    public ProductBusinessInterface getProducts(){

        //MongoDB
        return new ProductSQL();

        //test data
        //return new ProductFakeList();
    }
    @Autowired
    private DataSource dataSource;
    @Bean(name="database")
    public MySqlDAO getDatabase(){
        return new MySqlDAO(dataSource);
    }
}
