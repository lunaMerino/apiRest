package com.vedruna.apirest1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedruna.apirest1.persistance.models.Products;
import com.vedruna.apirest1.persistance.models.Products;
import com.vedruna.apirest1.persistance.repository.ProductsRepositoryI;

@Service
public class ProductsServiceImpl implements ProductsServiceI {

    @Autowired
    ProductsRepositoryI productsRepo;

    @Override
    public List<Products> showAllProducts() {
        return productsRepo.findAll();
    }

    @Override
    public Products showProductsByProductName(String productname) {
        return productsRepo.findByProductName(productname);
    }

    @Override
    public Products showProductsByProductPrice(double productPrice) {
        return productsRepo.findByProductPrice(productPrice);
    }

    @Override
    public Products showProductsByProductNameAndProductPrice(String productName, double productPrice) {
        return productsRepo.findByProductNameAndProductPrice(productName, productPrice);
    }

    @Override
    public void saveProducts(Products products) {
        productsRepo.save(products);
    }

    @Override
    public void updateProducts(Long id, Products products) {
        products.setProductId(id);
        productsRepo.save(products);
    }

    @Override
    public void deleteProducts(Long id) {
        productsRepo.deleteById(id);    
    }
    
}
