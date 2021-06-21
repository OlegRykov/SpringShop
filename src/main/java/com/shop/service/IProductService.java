package com.shop.service;

import com.shop.entites.Product;

import java.util.List;

public interface IProductService {
    List<Product> showAllProduct();

    Product getProductById(Long id);
}
