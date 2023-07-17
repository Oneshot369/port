package com.josh.port.database;
import com.josh.port.interfaces.ProductsDAOInterface;
import com.josh.port.model.ProductMapper;
import com.josh.port.model.ProductModel;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class MySqlDAO implements ProductsDAOInterface{
    
    @Autowired
    DataSource dataSource;
    JdbcTemplate jdbc;

    // Contructor
    public MySqlDAO(DataSource data) {
       this.dataSource = data;
       this.jdbc = new JdbcTemplate(data);
    }

    @Override
    public ProductModel findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<ProductModel> findAll() {
        return jdbc.query("Select * from products", new ProductMapper());
    }

    @Override
    public String addOne(ProductModel document) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOne'");
    }

    @Override
    public boolean update(String id, ProductModel document) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    
}
