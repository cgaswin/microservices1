package com.iiht.configclient.interfaces;

import com.iiht.configclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "feignclient",url = "http://localhost:7081/product-service")
public interface FeignInterface {

    @RequestMapping(method = RequestMethod.GET,value = "/products")
    public List<Product> getProducts();

    @RequestMapping(method = RequestMethod.GET,value = "/products-by-id/{id}",produces = "application/json")
    public Product getProductsById(@PathVariable ("id") int id);

    @RequestMapping(method = RequestMethod.GET,value = "/products-by-category/{category}",produces = "application/json")
    public List<Product> getProductsByCategory(@PathVariable("category") String category);

}
