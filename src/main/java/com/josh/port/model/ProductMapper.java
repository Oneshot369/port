package com.josh.port.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<ProductModel>{

    @Override
    public ProductModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ProductModel(
            (int) rs.getLong("ID"), 
            rs.getString("Name"), 
            rs.getString("Description"), 
            rs.getFloat("Price"), 
            rs.getInt("QTY")
            );
    }
    
}
