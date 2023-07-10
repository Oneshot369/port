package com.josh.port.interfaces;

import java.util.List;

import com.josh.port.model.ProductModel;

public interface ProductDaoInterface {
    // Create operation
    void addProduct(ProductModel product);

    // Read operations
    ProductModel getProductById(Long productId);
    List<ProductModel> getAllProducts();

    // Update operation
    void updateProduct(ProductModel product);

    // Delete operation
    void deleteProduct(Long productId);
}
