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
public class FeignClient implements FeignInterface {
    @Autowired
    private FeignInterface feignClient;

    @Override
    @GetMapping("/allProducts")
    public List<Product> getProducts() {
        return feignClient.getProducts();
    }
    
    //http://localhost:7082/client/products-by-id/2
    @Override
    @GetMapping("/products-by-id/{id}")
    public Product getProductsById(@PathVariable ("id") int id) {
        System.out.println(id);
        return feignClient.getProductsById(id);
    }


    // http://localhost:7082/client/products-by-category/Mobile
    @Override
    @GetMapping("/products-by-category/{category}")
    public List<Product> getProductsByCategory(@PathVariable("category") String category){
        return feignClient.getProductsByCategory(category);
    }

}
