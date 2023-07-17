package com.josh.port.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.josh.port.interfaces.ProductBusinessInterface;
import com.josh.port.interfaces.ProductsDAOInterface;
import com.josh.port.model.ProductModel;

public class ProductSQL implements ProductBusinessInterface{
    @Autowired
    ProductsDAOInterface productsDAO;

    @Override
    public void addProduct(ProductModel product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public ProductModel getProductById(Long productId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductById'");
    }

    @Override
    public List<ProductModel> getAllProducts() {
        List<ProductModel> test = productsDAO.findAll();
        System.out.println("\n" + test.get(0) + "\n");
        return test;
    }

    @Override
    public void updateProduct(ProductModel product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateProduct'");
    }

    @Override
    public void deleteProduct(Long productId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProduct'");
    }
    
}
