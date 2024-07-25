package com.iiht.configclient.resources;

import com.iiht.configclient.interfaces.FeignInterface;
import com.iiht.configclient.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class FeignClient {
    @Autowired
    private FeignInterface feignClient;

    @GetMapping("/allProducts")

    public List<Product> getAll() {
        return feignClient.getProducts();
    }

    //http://localhost:7082/client/products-by-id/2
    @GetMapping("/products-by-id/{id}")
    public Product getProductById(@PathVariable ("id") int id) {
        System.out.println(id);
        return feignClient.getProductsById(id);
    }

    // http://localhost:7082/client/products-by-category/Mobile
    @GetMapping("/products-by-category/{category}")
    public List<Product> getProductsByCategory(@PathVariable("category") String category){
        return feignClient.getProductsByCategory(category);
    }

}
