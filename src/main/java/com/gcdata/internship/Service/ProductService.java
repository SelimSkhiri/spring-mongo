package com.gcdata.internship.Service;

import com.gcdata.internship.Model.Product;

import java.util.List;

public interface ProductService  {

    Product addProduct(Product product);
    Product updateProduct(long id , Product newProduct);
    List<Product> getAllProduct();
    Product getProductById(String name);
}
