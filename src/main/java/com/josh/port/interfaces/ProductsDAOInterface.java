package com.josh.port.interfaces;

import java.util.List;

import com.josh.port.model.ProductModel;


public interface ProductsDAOInterface {
    public ProductModel findById(String id);
    public List<ProductModel> findAll();
    public String addOne(ProductModel document);
    public boolean update(String id, ProductModel document);
    public boolean delete(String id);
}
