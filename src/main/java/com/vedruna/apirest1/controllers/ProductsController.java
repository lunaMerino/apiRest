package com.vedruna.apirest1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedruna.apirest1.persistance.models.Products;
import com.vedruna.apirest1.persistance.models.Products;
import com.vedruna.apirest1.services.ProductsServiceI;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/v1/products")
public class ProductsController {

    @Autowired
    ProductsServiceI productsMngmnt;
    
    @GetMapping
    public List<Products> getAllProducts() {
        return productsMngmnt.showAllProducts();
    }

    @GetMapping("/name/{products_name}")
    public Products showProductsByProductname(@PathVariable String product_name) {
        return productsMngmnt.showProductsByProductName(product_name);
    }

    @GetMapping("/product_price/{product_price}")
    public Products showProductsByProduct_price(@PathVariable double product_price) {
        return productsMngmnt.showProductsByProductPrice(product_price);
    }

    @PostMapping("/insert")
    public String postProducts(@RequestBody Products products) {
        productsMngmnt.saveProducts(products);

        return "Product saved";
    }
    
    @PutMapping("edit/{id}")
    public String editProducts(@PathVariable Long product_id, @RequestBody Products products) {
        productsMngmnt.updateProducts(product_id, products);
        
        return "Products modified";
    }
    
    @DeleteMapping("delete/{id}")
    public String deleteProducts(@PathVariable Long product_id) {
        productsMngmnt.deleteProducts(product_id);
        
        return "Products deleted";
    }

}
