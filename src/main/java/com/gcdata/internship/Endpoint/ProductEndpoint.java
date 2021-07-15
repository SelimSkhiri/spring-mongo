package com.gcdata.internship.Endpoint;

import com.gcdata.internship.Model.Product;
import com.gcdata.internship.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductEndpoint {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();

    }
}
