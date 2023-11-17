package com.example.productservice.dao;

import com.example.productservice.entity.Product;

import java.util.List;

public interface ProductDAO {
    void write(Product product);  //Product가 Entity
    void insertAll(List<Product> prdlist);
    Product findByProductNo(Long productNo );
    List<Product> findAll();
}
