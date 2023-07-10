package com.josh.port.business;

import java.util.ArrayList;
import java.util.List;

import com.josh.port.interfaces.ProductDaoInterface;
import com.josh.port.model.ProductModel;

public class ProductFakeList implements ProductDaoInterface{
    private List<ProductModel> products;

    public ProductFakeList() {
        // Initialize the list of products with hardcoded values
        products = new ArrayList<>();
        products.add(new ProductModel(1L, "Product 1", "Description 1", 9.99f, 10));
        products.add(new ProductModel(2L, "Product 2", "Description 2", 19.99f, 5));
        products.add(new ProductModel(3L, "Product 3", "Description 3", 14.99f, 3));
        products.add(new ProductModel(4L, "Product 4", "Description 4", 24.99f, 8));
        products.add(new ProductModel(5L, "Product 5", "Description 5", 29.99f, 2));
    }

    @Override
    public void addProduct(ProductModel product) {
        products.add(product);
    }

    @Override
    public ProductModel getProductById(Long productId) {
        for (ProductModel product : products) {
            if (product.getId() == productId) {
            return product;
            }
        }
        return null;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return products;
    }

    @Override
    public void updateProduct(ProductModel product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == product.getId()) {
            products.set(i, product);
            break;
            }
        }
    }

    @Override
    public void deleteProduct(Long productId) {
        products.removeIf(product -> product.getId() == productId);
    }
}
