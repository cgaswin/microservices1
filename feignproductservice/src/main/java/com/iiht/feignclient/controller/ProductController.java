package com.iiht.feignclient.controller;

import com.iiht.feignclient.model.Product;
import com.iiht.feignclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product-service")
public class ProductController {
    @Autowired
    ProductService product;



    @GetMapping("/products")
    public List<Product> findAll(){
        return product.findAll();
    }

    @GetMapping("/products-by-category/{category}")
    public List<Product> findByCategory(@PathVariable("category") String category){
        return product.findByCategory(category);
    }

    @GetMapping("/products-by-id/{id}")
    public Product findById(@PathVariable("id") int id) {
        return product.findById(id);
    }

}



