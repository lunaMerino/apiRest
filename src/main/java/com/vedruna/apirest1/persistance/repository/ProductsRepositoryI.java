package com.vedruna.apirest1.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedruna.apirest1.persistance.models.Products;

@Repository
public interface ProductsRepositoryI extends JpaRepository<Products, Long>{
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    Products findByProductName(String productName);
    Products findByProductPrice(double productPrice);
    Products findByProductNameAndProductPrice(String productName, double productPrice);
}
