package com.vedruna.apirest1.services;

import java.util.List;

import com.vedruna.apirest1.persistance.models.Products;

public interface ProductsServiceI {
    List<Products> showAllProducts();
    Products showProductsByProductName(String productName);
    Products showProductsByProductPrice(double productPrice);
    Products showProductsByProductNameAndProductPrice(String productName, double productPrice);
    void saveProducts(Products products);
    void updateProducts(Long id, Products products);
    void deleteProducts(Long id);
}
