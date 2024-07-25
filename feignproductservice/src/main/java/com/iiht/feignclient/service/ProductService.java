package com.iiht.feignclient.service;

import com.iiht.feignclient.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> findByCategory(String category);
    Product findById(int id);
}
